package ToDoList;

import java.util.ArrayList;

public class ToDoList {

	private ArrayList<String> todoItems = new ArrayList<>();
	private ArrayList<Boolean> todoStatus = new ArrayList<>();
	
	public ToDoList() {

	}
	//할일 추가 하는 메소드, item은 메인에서 입력받는다
	public void addItem(String item) {
		todoItems.add(item);
		todoStatus.add(false); // 아직 하지 않은 일이니까 false로 들어감
		System.out.println("추가완료");
		
		//음 여기에서 바로 1.을 누르면 추가로 추가(?) 2.를 누르면 빠져나가기 어떻게 하지? 
		
	}
	//할일을 제거하는 메소드 index는 메인에서 입력받는다
	public void removeItem(int index) { 
		System.out.println("지울 아이템을 선택하세요");
		todoItems.remove(index -1); // 할일을 1.~ 로 출력할 거고, 1번 할일은 0번 인덱스에 있음
		todoStatus.remove(index -1);
	}
	
	public void changeStatus(int index) {
		System.out.println("완료한 일의 번호를 선택하세요");
		todoStatus.set(index-1, true); // 완료한일의 상태의 인텍스가 true로 바뀜
		
	}
	
	//전체 할일을 출력하는 메소드
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
				System.out.println(todoStatus.get(i));
			}
		}
	}
	
	public void printTaskDone() {
		
		System.out.println("완료한 목록");
		for(int i = 0 ;i <todoStatus.size() ; i++) {
			if(todoStatus.get(i)) {
				System.out.println(todoStatus.get(i));
			}
		}
		
	}
	
	
	
	
	
	
}