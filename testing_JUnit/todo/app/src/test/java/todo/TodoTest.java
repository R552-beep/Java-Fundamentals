package todo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {
  @Test 
  public void shouldStartWithEmptyList() {
    Todo todo = new Todo();
    assertTrue("Initial task list is empty", todo.tasks.isEmpty()); 

  }

  @Test
  public void shouldGetTasks() {
    Todo todo = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Buy milk");
    expectedList.add("Buy coffee");

    todo.addTask("Buy milk");
    todo.addTask("Buy coffee");

    assertEquals("Should reflect all tasks stored", expectedList, todo.getTasks());
  }

 
}