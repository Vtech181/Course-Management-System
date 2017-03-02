import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProfPage extends Frame implements ActionListener{
	Label l1;
	Courses c1;
	AddCourse c2;
	AssignmentFloated af;
	ViewProfile c3;
	Register c4;
	Assign c5;
	Button b1,b2,b3,b4,b5,b6;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand())
		{
		case "List of Assignments Done":
			af.setVisible(true);break;
		case "Edit Profile":
			c4.setVisible(true);break;
		
		case "Edit Courses":
			c1.setVisible(true);break;
		
		case "Propose Courses":
			c2.setVisible(true);break;
		case "Assign Course":
			c5.setVisible(true);
			break;
		case "View Reports + Profile":
			c3.setVisible(true);
		  
			
		}
	}
	ProfPage()
	{
		
		c1=new Courses();
		c2=new AddCourse();
		c3=new ViewProfile();
		c4=new Register();
		c5=new Assign();
		af=new AssignmentFloated();
		
		
		
		
		
		l1=new Label("WELCOME PROFESSOR");
		b1=new Button("List of Assignments Done");
		b2=new Button("Edit Profile");
		b3=new Button("Edit Courses");
		b4=new Button("Propose Courses");
		b5=new Button("Assign Course");
		b6=new Button("View Reports + Profile");
		
		l1.setBounds(200,25,500,50);
		b1.setBounds(200,75,500,50);
		b2.setBounds(200,125,500,50);
		b3.setBounds(200,175,500,50);
		b4.setBounds(200,225,500,50);
		b5.setBounds(200,275,500,50);
		b6.setBounds(200,325,500,50);
		
		l1.setAlignment(Label.CENTER);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
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
		this.setTitle("WELCOME PROFESSOR");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfPage pg=new ProfPage();
		pg.setVisible(true);
	}
	

}
