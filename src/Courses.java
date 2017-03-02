import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Courses extends Frame {
Label l1;
	
	Checkbox b1,b2,b3,b4,b5,b6;
	Courses()
	{
		l1=new Label("WELCOME PROFESSOR");
		b1=new Checkbox("C1");
		b2=new Checkbox("C2");
		b3=new Checkbox("C3");
		b4=new Checkbox("C4");
		b5=new Checkbox("C5");
		b6=new Checkbox("C6");
		
		l1.setBounds(200,25,500,50);
		b1.setBounds(200,75,500,50);
		b2.setBounds(200,125,500,50);
		b3.setBounds(200,175,500,50);
		b4.setBounds(200,225,500,50);
		b5.setBounds(200,275,500,50);
		b6.setBounds(200,325,500,50);
		
		l1.setAlignment(Label.CENTER);
		
		
		this.add(l1);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(900,400);
		this.setVisible(false);
		this.setLayout(null);
		this.setTitle("Check the Courses to be made availible this semester");
	}
	
	
}
