import java.util.Scanner;

public class ToDoList {
 public static void main(String args[]){
	 Event list =new Event();
	 System.out.println("1.Enter your event.");
	 System.out.println("2.Show your event."); 
	 Scanner input =new Scanner(System.in);
	 int menu;
	 menu=input.nextInt();
	 String title;
	 String info;
	 int day;
	 int month;
	 int hour;
	 int minute; 
	 switch (menu) 
	 {
	case 1:
		System.out.println("Enter title:");
		title=input.nextLine();
		list.setTitle(title);
		input.nextLine();
		System.out.println("Add some info:");
		info=input.nextLine();
		list.setInfo(info);
		System.out.println("Enter day:");
		day=input.nextInt();
		list.setDay(day);
		input.nextLine();
		System.out.println("Enter month");
		month=input.nextInt();
		list.setMonth(month);
		input.nextLine();
		System.out.println("Enter hour:");
		hour=input.nextInt();
		list.setHour(hour);
		input.nextLine();
		System.out.println("Enter minute:");
		minute=input.nextInt();
		list.setMinute(minute);
		System.out.println();
		break;
	case 2:
		list.showEvent();
		break;
	default:
		break;
	} 
 }
}
