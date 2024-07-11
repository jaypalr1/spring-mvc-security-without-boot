package com.jay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  /*
  @RequestMapping("/home")
  public ModelAndView home() {

    ModelAndView modelAndView = new ModelAndView("Home");
    modelAndView.addObject("message", "Welcome to the Home Page!");

    return modelAndView;
  }

  @RequestMapping("/login")
  public ModelAndView login() {
    ModelAndView modelAndView = new ModelAndView("Login");

    return modelAndView;
  }

  @RequestMapping("/authenticate")
  public ModelAndView authenticate() {
    ModelAndView modelAndView = new ModelAndView("Login");

    return modelAndView;
  }
*/

  @GetMapping(value = "/home")
  public ModelAndView home() {
    return new ModelAndView("success");
  }

  @GetMapping(value = "/login")
  public ModelAndView showLogin() {
    return new ModelAndView("login");
  }

  @PostMapping("/authenticate")
  public ModelAndView authenticate(@RequestParam String username, @RequestParam String password) {
    if ("u".equals(username) || "p".equals(password)) {
      return new ModelAndView("success");
    } else {
      return new ModelAndView("failure");
    }
  }
}
