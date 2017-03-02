import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener{

	Label l1,l2;
	Register reg;
	ProfPage pf;
	Button b1,b2;
	TextField tf1,tf2;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand())
		{
		case "REGISTER":
			reg.setVisible(true);break;
		case "LOGIN":	
			pf.setVisible(true);
		}
	}
	Login()
	{
		pf=new ProfPage();
		reg=new Register();
		tf1=new TextField();
		tf2=new TextField();
		l1=new Label("Username");
		l2=new Label("Password");
		b1=new Button("LOGIN");
		b2=new Button("REGISTER");
		
		l1.setBounds(55, 50, 150,50);
		l2.setBounds(55, 125, 150,50);
		b1.setBounds(50,200,800,50);
		b2.setBounds(50,275,800,50);
		tf1.setBounds(225, 50, 500, 50);
		tf2.setBounds(225, 125, 500, 50);
		tf2.setEchoChar('*');
		l1.setAlignment(Label.CENTER);
		l2.setAlignment(Label.CENTER);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.add(b1);
		this.add(l2);
		this.add(b2);
		this.add(l1);
		this.add(b1);
		this.add(tf1);
		this.add(tf2);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(900,450);
		this.setVisible(false);
		this.setLayout(null);
		this.setTitle("LOGIN");
	}
}
