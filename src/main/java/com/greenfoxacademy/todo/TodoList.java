package com.greenfoxacademy.todo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eggdice on 5/4/17.
 */
@Component
public class TodoList {
  List<String> list = new ArrayList<>();

  public List<String> getAll() {
    return list;
  }

  public void add(String item) {
    list.add(item);
  }
}
