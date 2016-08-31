import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
 public static void main(String args[]) throws IOException{
	 List<Event> list=new ArrayList<Event>();
	 Event event =new Event();
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
	 String stop=input.nextLine();
	 switch (menu) 
	 {
	case 1:
		for(;;)
		{
		System.out.println("Enter title:");
		title=input.nextLine();
		event.setTitle(title);
		System.out.println("Add some info:");
		info=input.nextLine();
		event.setInfo(info);
		System.out.println("Enter day:");
		day=input.nextInt();
		event.setDay(day);
		input.nextLine();
		System.out.println("Enter month");
		month=input.nextInt();
		event.setMonth(month);
		input.nextLine();
		System.out.println("Enter hour:");
		hour=input.nextInt();
		event.setHour(hour);
		input.nextLine();
		System.out.println("Enter minute:");
		minute=input.nextInt();
		event.setMinute(minute);
		list.add(event);
		event.writeEvent();
		System.out.println("Enter STOP to stop entering events");
		input.nextLine();
		stop=input.nextLine();
			if(stop.equals("STOP"))
			{
				break;
			}
		}
		break;
	case 2:
		EventFrameShow frame =new EventFrameShow();
		break;
	default:
		break;
	} 
 }
}
