package com.jay.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
//@RequiredArgsConstructor
public class HomeController {

  @Autowired
  private AuthenticationManager authenticationManager;

  @GetMapping(value = "/home")
  public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView("home");
    modelAndView.addObject("message", "Welcome to the Home Page!");

    return modelAndView;
  }

  @GetMapping(value = "/login")
  public ModelAndView showLogin() {
    return new ModelAndView("login");
  }

  @PostMapping("/login/authenticate")
  public ModelAndView authenticate(@RequestParam("username") String username,
      @RequestParam("password") String password) {

    UsernamePasswordAuthenticationToken usernamePasswordAuthToken =
        new UsernamePasswordAuthenticationToken(username, password);

    try {
      Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthToken);

      SecurityContext context = SecurityContextHolder.createEmptyContext();
      context.setAuthentication(authentication);

      SecurityContextHolder.setContext(context);

      return new ModelAndView("success");
    } catch (AuthenticationException e) {
      log.error("Authentication failed", e);
      return new ModelAndView("failure");
    }
  }

  /**
   * @implNote This endpoint is responsible for rendering 'login successful' page
   */
  @GetMapping("/login/success")
  public ModelAndView loginSuccess() {
    return new ModelAndView("success");
  }

  /**
   * @implNote This endpoint is responsible for rendering 'logout successful' page
   */
  @GetMapping("/logout")
  public ModelAndView logoutSuccess() {
    return new ModelAndView("home");
  }

  /**
   * @implNote This endpoint is responsible for rendering 'login successful' page
   */
  @GetMapping("/invalid-session")
  public ModelAndView invalidSession() {
    return new ModelAndView("invalid-session-page");
  }
}
