package com.greenfoxacademy.todo;

/**
 * Created by eggdice on 5/4/17.
 */
public class TodoItem {
  private static int lastId = 0;
  public String name;
  public int id;

  public TodoItem(String n) {
    name = n;
    id = lastId;
    lastId++;
  }
}
