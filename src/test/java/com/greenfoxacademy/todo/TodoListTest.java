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
    todos.add(new TodoItem("alma"));
    assertEquals(todos.getAll().size(), 1);
  }

  @Test
  public void deleteItem() {
    TodoList todos = new TodoList();
    TodoItem first = new TodoItem("alma");
    todos.add(first);
    todos.add(new TodoItem("korte"));
    todos.delete(first.id);
    assertEquals(todos.getAll().get(0).name, "korte");
  }
}