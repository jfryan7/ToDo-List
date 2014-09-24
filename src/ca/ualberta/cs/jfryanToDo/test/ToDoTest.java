package ca.ualberta.cs.jfryanToDo.test;

import junit.framework.TestCase;
import ca.ualberta.cs.jfryanToDo.Todo;

public class ToDoTest extends TestCase {
	
	public void testTodo() {
		String todoItem1 = "Test todo 1";
		Todo todo = new Todo(todoItem1);
		assertTrue("Todo item not equal", todoItem1.equals(todo.getTodo()));
	}

}
