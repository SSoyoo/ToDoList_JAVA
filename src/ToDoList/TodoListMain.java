package ToDoList;

import java.util.Scanner;

public class TodoListMain {

	public static void main(String[] args) {
		
		ToDoList todo = new ToDoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			String a = null;
			System.out.println("1. 할일추가");
			System.out.println("2. 할일삭제");
			System.out.println("3. 완료하기");
			System.out.println("4. 목록보기");
			a = sc.nextLine();
			
			if(a.equals("1")) {
				todo.addItem();
			}else if(a.equals("2")) {
				todo.removeItem();
			}else if(a.equals("3")) {
				todo.changeStatus();
			}else if(a.equals("4")) {
				todo.printTask();
			}else
			{
				System.out.println("다시 입력하세요");	
			}
				
			
			
			
			
			
			
		}
		
	}
}