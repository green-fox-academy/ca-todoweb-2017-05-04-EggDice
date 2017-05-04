package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * Created by eggdice on 5/4/17.
 */
@Controller
public class MainController {
  @RequestMapping("/")
  public String index(Model model) {
    List<String> colors = Arrays.asList("red", "blue", "yellow");
    model.addAttribute("greet", "anyad");
    model.addAttribute("colors", colors);
    return "index";
  }

  @RequestMapping("/add")
  public String add(Model model, @RequestParam("new_todo") String param) {
    System.out.println(param);
    System.out.println("AJJAJJJ #################################");
    return "redirect:/";
  }
}
