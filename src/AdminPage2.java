import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminPage2 extends Frame implements ActionListener{
	
	Label welcomeadmin;
	TimeMan tm;
	Courses c1;
	ViewProfile vp;
	Histogram hf;
	Button facmain,coursemain,assignmentlim,timewindowmain;
	AssignmentLimit al;
	
	AdminPage2()
	{
		al=new AssignmentLimit();
		tm=new TimeMan();
		c1=new Courses();
		vp=new ViewProfile();
		hf=new Histogram();
		welcomeadmin=new Label("WELCOME ADMINISTRATOR");
		facmain=new Button("Faculty Maintainance");
		coursemain=new Button("Course Maintainance");
		assignmentlim=new Button("Assignment Limit Maintainance");
		timewindowmain=new Button("Time Window Maintainance");
		
		welcomeadmin.setBounds(200,25,500,50);
		facmain.setBounds(200,75,500,50);
		coursemain.setBounds(200,125,500,50);
		assignmentlim.setBounds(200,175,500,50);
		timewindowmain.setBounds(200,225,500,50);
		
		welcomeadmin.setAlignment(Label.CENTER);
		timewindowmain.addActionListener(this);
		assignmentlim.addActionListener(this);
		facmain.addActionListener(this);
		coursemain.addActionListener(this);
		
		this.add(welcomeadmin);
		this.add(facmain);
		this.add(coursemain);
		this.add(assignmentlim);
		this.add(timewindowmain);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(900,400);
		this.setVisible(false);
		this.setLayout(null);
		this.setTitle("WELCOME ADMINISTRATOR");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand())
		{
		case "Time Window Maintainance":
			tm.setVisible(true);break;
		case "Assignment Limit Maintainance":
			al.setVisible(true);break;
		case "Course Maintainance":
			c1.setVisible(true);break;
		case "Faculty Maintainance":
			hf.setVisible(true);break;
			
		}
		
	}
	

}
