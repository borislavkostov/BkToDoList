import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Event  {
 private String title;
 private String info;


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


public void showEvent()
{
	System.out.println("~~~~~~TO DO~~~~~~");
	System.out.printf("Title: %s\n",this.title);
	System.out.printf("Info: %s\n",this.info);
}
public void writeEvent() throws IOException
{
	    File outFile = new File ("event.txt");
	    FileWriter fWriter = new FileWriter(outFile,true);
	    PrintWriter pWriter = new PrintWriter (fWriter);
	    pWriter.println(this.title);
	    pWriter.println(this.info);
	    pWriter.close();
}
public void readEvent(Scanner input)
{
	title=input.nextLine();
	info=input.nextLine();
}
@Override
public String toString()
{
	String text ="~~~~~~TO DO~~~~~~\n"+"Title: "+this.title+"\nInfo:"+this.info+"\n";
	return text;
}
}