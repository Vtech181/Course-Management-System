import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TimeMan extends Frame implements ActionListener{

	Label l1,l2,l3,l4;
	String args[];
	Button b1,b2,b3;
	TextField tf1,tf2;
	CalendarProgram cp;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand())
		{
		case "SET":
		{
			CalendarProgram.main(args);
			
		}
		}
	}
	TimeMan()
	{
		cp=new CalendarProgram();
	tf1=new TextField();
		tf2=new TextField();
		l1=new Label("Course Substitution Time Limit");
		l2=new Label("Course Assignment Time Limit");
		
		b1=new Button("SUBMIT");
		b2=new Button("SET");
		b3=new Button("SET");
		
		l1.setBounds(10, 50, 200, 50);
		l2.setBounds(10,125,200,50);
		b1.setBounds(150,200,500,50);
		b2.setBounds(350,50,200,50);
		b3.setBounds(350,125,200,50);
		
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(l2);
		this.add(l1);
		this.add(b1);
		
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(800,300);
		this.setVisible(false);
		this.setLayout(null);
		this.setTitle("SET TIME LIMIT");
	}
	public static void main(String args[])
	{
		
	}
	

}
