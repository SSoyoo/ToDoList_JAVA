package ToDoList;

import java.util.ArrayList;

public class ToDoList {
	
	

	@Override
	public String toString() {
		return "ToDoList [todoItems=" + todoItems + ", todoStatus=" + todoStatus + "]";
	}

	private ArrayList<String> todoItems ;
	private ArrayList<Boolean> todoStatus ;
	
	public ToDoList() {
		todoItems = new ArrayList<>();
		todoStatus = new ArrayList<>();
	}
	
	public void addItem(String item) {
		todoItems.add(item);
		todoStatus.add(false); // 아직 하지 않은 일이니까 false로 들어감
	}
	
	public void removeItem(int index) {
		todoItems.remove(index - 1);
		todoStatus.remove(index -1);
	}
}
