package com.greenfoxacademy.todo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eggdice on 5/4/17.
 */
public class TodoListTest {
  @Test
  public void emptyList() {
    TodoList todos = new TodoList();
    assertEquals(todos.getAll().size(), 0);
  }

  @Test
  public void addElement() {
    TodoList todos = new TodoList();
    todos.add("alma");
    assertEquals(todos.getAll().size(), 1);
  }
}