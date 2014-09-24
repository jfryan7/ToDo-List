package ca.ualberta.cs.jfryanToDo.test;

import java.util.Collection;

import ca.ualberta.cs.jfryanToDo.Todo;
import ca.ualberta.cs.jfryanToDo.TodoList;
import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
	public void testEmptyToDoList () {
		TodoList todoList = new TodoList();
		Collection<Todo> todos = todoList.getTodos();
		assertTrue("Empty todo list", todos.size() == 0);
	}
	
	public void testAddToDo () {
		TodoList todoList = new TodoList();
		String todoItem2 = "Test todo 2";
		Todo testTodo = new Todo(todoItem2);
		todoList.addTodo(testTodo);
		Collection<Todo> todos = todoList.getTodos();
		assertTrue("Todo list size is too small for add", todos.size() == 1);
		assertTrue("Does not contain test todo 2 in add test",todos.contains(testTodo));
	}
		
	public void testRemoveToDo () {
		TodoList todoList = new TodoList();
		String todoItem2 = "Test todo 2";
		Todo testTodo = new Todo(todoItem2);
		todoList.addTodo(testTodo);
		Collection<Todo> todos = todoList.getTodos();
		assertTrue("Todo list size is too small for remove", todos.size() == 1);
		assertTrue("Does not contain test todo 2 in remove test",todos.contains(testTodo));
		todoList.removeTodo(testTodo);
		assertTrue("Todo list size", todos.size() == 0);
		assertFalse("Still contains test todo 2 in remove test",todos.contains(testTodo));
	}
}
