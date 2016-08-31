
public class ToDoList {
 public static void main(String args[]){
	 Event list =new Event();
	 list.setTitle("My event");
	 list.setInfo("Buy milk");
	 list.setDay(3);
	 list.setMonth(1);
	 list.setHour(5);
	 list.setMinute(32);
	 list.getCalendar();
	 list.showEvent();
 }
}
