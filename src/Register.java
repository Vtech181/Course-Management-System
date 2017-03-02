import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Register extends Frame implements ActionListener{
	
	Button b1;
	TextField t1,t2,t3,t4,t5,t6;
	Label l1,l2,l3,l4,l5,l6;
	
	
	Register()
	{
		this.setLayout(null);
		b1=new Button("Submit");
		l1=new Label("ID");
		l2=new Label("Name");
		l3=new Label("Email");
		l4=new Label("Password");
		l5=new Label("Area of Expertise");
		l6=new Label("Courses Taken");
		
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		l3.setAlignment(Label.CENTER);
		l4.setAlignment(Label.CENTER);
		l5.setAlignment(Label.CENTER);
		l6.setAlignment(Label.CENTER);
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		
		
		l1.setBounds(10, 25, 150, 50);
		l2.setBounds(10,80,150,50);
		l3.setBounds(10,135, 150, 50);
		l4.setBounds(10,190,150,50);
		l5.setBounds(10, 235, 150, 50);
		l6.setBounds(10,290,150,50);
		t1.setBounds(260, 25, 350, 50);
		t2.setBounds(260,80,350,50);
		t3.setBounds(260,135, 350, 50);
		t4.setBounds(260,190,350,50);
		t5.setBounds(260, 245, 350, 50);
		t6.setBounds(260,300,350,50);		
		b1.setBounds(260,400,350,50);
	
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		this.add(t6);
		this.add(b1);
		
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(700,500);
		this.setVisible(false);
		
		this.setTitle("Please fill your credentials");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
