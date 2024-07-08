package com.jay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  // Custom Welcome page. It only works if we add our custom welcome page to 'Welcome File List'. Otherwise, it doesn't work
//  @GetMapping("/")
//  public String welcomePage() {
//    return "CustomWelcomePage";
//  }

  // This doesn't work. Need to provide custom error page and handler I guess. Need to try that.
  @ResponseBody
  @GetMapping("/error")
  public String error() {
    return "Error occurred";
  }

  // Works
  @ResponseBody
  @GetMapping("/hi")
  public String hi() {
    return "hi";
  }

  // Works
  @GetMapping("/t")
  public String test(@RequestParam(name = "name", required = false, defaultValue = "World")
  String name, Model model) {
    model.addAttribute("name", name);

    return "TestJspPage";
  }

  // Not working. Check how to serve static content
  @GetMapping("/g")
  public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World")
  String name, Model model) {
    model.addAttribute("name", name);

    return "/WEB-INF/views/greeting.html";
  }
}
