import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventFrameShow 
{
	public EventFrameShow() throws IOException
	{
		JFrame frame =new JFrame();
		Container contentPane=frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new FlowLayout(FlowLayout.TRAILING));
		Scanner inputF =new Scanner(new File("event.txt"));
		while(inputF.hasNextLine()){
			contentPane.add( new JLabel("<html>"+inputF.nextLine()+"</br </html>"));
		}
		frame.pack();
		frame.setVisible(true);
	}
}
