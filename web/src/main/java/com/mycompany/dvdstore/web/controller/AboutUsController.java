package com.mycompany.dvdstore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {

  @RequestMapping("/about-us")
  public String displayFullDetails() {
    System.out.println("displayFullDetails() called");
    return "about-us";
  }

}
