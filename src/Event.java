import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Event {
 private String title;
 private String info;
 private int day;
 private int month;
 private int hour;
 private int minute;
 
 public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public Event(){

 }
 public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public void getCalendar()
 {
	  Calendar cal =Calendar.getInstance();
	  cal.set(Calendar.DAY_OF_MONTH,this.day);
	  cal.set(Calendar.HOUR_OF_DAY,this.hour);
	  cal.set(Calendar.MINUTE,this.minute);
	  cal.set(Calendar.MONTH,this.month-1);//It's Starting from 0-12
	  SimpleDateFormat format1 = new SimpleDateFormat("HH:mm,DD-MM");
	  System.out.println(format1.format(cal.getTime()));
 }
public void showEvent()
{
	System.out.printf("Title: %s\n",this.title);
	System.out.printf("Info: %s\n",this.info);
	System.out.print("Time: ");
	this.getCalendar();
}

}
