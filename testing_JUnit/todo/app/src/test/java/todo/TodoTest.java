package todo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TodoTest {
  @Test 
  public void shouldStartWithEmptyList() {
    Todo todo = new Todo();
    assertTrue("Initial task list is empty", todo.tasks.isEmpty()); 

  }
 
}