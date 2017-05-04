package com.greenfoxacademy.todo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eggdice on 5/4/17.
 */
public class TodoItemTest {
  @Test
  public void uniqeId() {
    TodoItem item = new TodoItem("alma");
    assertEquals(item.id, 0);
    assertEquals(item.name, "alma");
  }


  @Test
  public void uniqeIdWhenMultiple() {
    TodoItem item = new TodoItem("alma");
    TodoItem item2 = new TodoItem("alma");
    assertNotEquals(item.id, item2.id);
    assertEquals(item.name, "alma");
  }
}