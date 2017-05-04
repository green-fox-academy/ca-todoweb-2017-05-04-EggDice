package com.greenfoxacademy.controllers;

import com.greenfoxacademy.todo.TodoItem;
import com.greenfoxacademy.todo.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by eggdice on 5/4/17.
 */
@Controller
public class MainController {
  @Autowired
  TodoList todos;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("greet", "anyad");
    model.addAttribute("todos", todos.getAll());
    return "index";
  }

  @RequestMapping("/add")
  public String add(@RequestParam("new_todo") String param) throws InterruptedException {
    todos.add(new TodoItem(param));
    return "redirect:/";
  }

  @RequestMapping("/delete")
  public String delete(@RequestParam("index") String param) {
    todos.delete(Integer.parseInt(param));
    return "redirect:/";
  }
}
