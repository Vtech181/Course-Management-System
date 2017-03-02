import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AddCourse2 extends Frame implements ActionListener{
	
	Button b1;
	TextField t1,t2,t3,t4,t5,t6;
	Label l1,l2,l3,l4,l5,l6;
	AddCourse2()
	{
		this.setLayout(null);
		b1=new Button("ADD");
		l1=new Label("Course Name");
		l2=new Label("Course ID");
		l3=new Label("Units");
		l4=new Label("Description");
		l5=new Label("Lab Hours");
	
		
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		l3.setAlignment(Label.CENTER);
		l4.setAlignment(Label.CENTER);
		l5.setAlignment(Label.CENTER);
		
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		
		
		
		l1.setBounds(10, 25+20, 150, 50);
		l2.setBounds(10,80+20,150,50);
		l3.setBounds(10,135+20, 150, 50);
		l4.setBounds(10,190+20,150,50);
		l5.setBounds(10, 235+20, 150, 50);
		
		t1.setBounds(260, 25+20, 350, 50);
		t2.setBounds(260,80+20,350,50);
		t3.setBounds(260,135+20, 350, 50);
		t4.setBounds(260,190+20,350,50);
		t5.setBounds(260, 245+20, 350, 50);
		
		b1.setBounds(260,400,350,50);
	
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		
		
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		
		this.add(b1);
		
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(900,450);
		this.setVisible(false);
		
		this.setTitle("आवश्यक विवरण भरें");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
