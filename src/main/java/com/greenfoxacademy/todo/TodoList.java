package com.greenfoxacademy.todo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eggdice on 5/4/17.
 */
@Component
public class TodoList {
  List<TodoItem> list = new ArrayList<>();

  public List<TodoItem> getAll() {
    return list;
  }

  public void add(TodoItem item) {
    list.add(item);
  }

  public void delete(int id) {
    TodoItem selected = null;
    for (TodoItem item : list) {
      if (item.id == id) {
        selected = item;
      }
    }
    list.remove(selected);
  }
}
