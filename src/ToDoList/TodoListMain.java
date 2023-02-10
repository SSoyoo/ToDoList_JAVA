package ToDoList;

public class TodoListMain {

	public static void main(String[] args) {
		
		ToDoList todo = new ToDoList();
		
		todo.addItem("할일 1 추가");
		todo.addItem("할일 2 추가");
		todo.addItem("할일 3 추가");
		
		System.out.println(todo);
		
	}

}
