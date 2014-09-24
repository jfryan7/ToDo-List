package ca.ualberta.cs.jfryanToDo;

public class Todo {

	protected String todoItem;
	public Todo(String todoItem) {
		this.todoItem = todoItem;
	}

	public String getTodo() {
		return this.todoItem;
	}

}
