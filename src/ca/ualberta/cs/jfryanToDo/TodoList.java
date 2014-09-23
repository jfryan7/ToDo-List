package ca.ualberta.cs.jfryanToDo;

import java.util.ArrayList;
import java.util.Collection;

public class TodoList {
	
	protected ArrayList<Todo> todoList;
	
	public TodoList() {
		todoList = new ArrayList<Todo>();
	}

	public Collection<Todo> getTodos() {
		// TODO Auto-generated method stub
		return todoList;
	}

	public void addTodo(Todo todoItem) {
		todoList.add(todoItem);
		
	}

}
