package ToDoList;

import java.util.Scanner;

public class TodoListMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ToDoList todo = new ToDoList();
		
		todo.addItem("청소하기");
		todo.addItem("등본발급받기");
		todo.addItem("빨래하기");
		

		todo.PrintAllTask();
		
		int n = sc.nextInt();
		todo.removeItem(n);
		
		
		
	}

}
