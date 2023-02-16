package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

	private ArrayList<String> todoItems;
	private ArrayList<Boolean> todoStatus;
	private Scanner sc;
	
	public ToDoList() {
		this.todoItems = new ArrayList<>();
		this.todoStatus = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}
	
	public void addItem() {
		
		String input = null;
		System.out.println("할일입력");
		input = sc.nextLine();
		todoItems.add(input);
		todoStatus.add(false);
		System.out.println("추가완료");
		
	
		}
		
		public void removeItem() { 
		
		this.PrintAllTask();
		int input = 0;
		System.out.println("삭제할 아이템의 번호를 입력: ");
		input = sc.nextInt();
		todoItems.remove(input-1);
		todoStatus.remove(input-1);
		
	}
	public void changeStatus() {
		this.PrintAllTask();
		int input = 0; 
		System.out.println("완료한 일을 선택 : ");
		input = sc.nextInt();
		todoStatus.set(input-1, true);
	}
	
	//전체 할일을 출력하는 메소드\
	
	public void printTask() {
		
		String input = null;
		
		System.out.println("1. 전체목록 ");
		System.out.println("2. 완료한 목록");
		System.out.println("3. 진행중인 목록");
		System.out.println("Q : 메뉴로 돌아가기");
	
		input = sc.nextLine();
		
		if(input.equals("1")) {
			this.PrintAllTask();
		}else if(input.equals("2")) {
			this.printTaskDone();
		}else if(input.equals("3")) {
			this.printTaskInProgress();
		}else if(input.equals("Q")) {
			return;
		}else {
			System.out.println("다시 입력하세요");
		}
	
	
	}
	
	public void PrintAllTask() {
		System.out.println("전체 목록");
		for(int i = 0 ; i<todoItems.size() ; i++) {
			System.out.println(i+1+"."+todoItems.get(i));
		}
	}
	
	public void printTaskInProgress() {
		System.out.println("진행중인 목록");
		for(int i = 0 ;i <todoStatus.size() ; i++) {
			if(todoStatus.get(i) == false) {
				System.out.println(todoItems.get(i));
			}
		}
	}
	
	public void printTaskDone() {
		
		System.out.println("완료한 목록");
		for(int i = 0 ;i <todoStatus.size() ; i++) {
			if(todoStatus.get(i)) {
				System.out.println(todoItems.get(i));
			}
		}
		
	}
	
	
	
	
	
	
}