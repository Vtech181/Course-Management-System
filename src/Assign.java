import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Assign extends Frame implements ActionListener{
	
	Label l1;
	Button b1;
	Choice c1;
	Choice c2;
	Assign()
	{
		b1=new Button("ASSIGN");
		c2=new Choice();
		
		c1=new Choice();
		c1.addItem("c1");
		c1.addItem("c2");
		c1.addItem("c3");
		c1.addItem("c4");
		c1.addItem("c5");
		c2.add("p1");
		c2.add("p2");
		c2.add("p3");
		c2.add("p4");
		c2.add("p5");
		l1=new Label("to");
		l1.setAlignment(Label.CENTER);
		
		c1.setBounds(150, 50, 150,50);
		l1.setBounds(350,50,150,50);
		b1.setBounds(300,150,150,50);
		c2.setBounds(550,50,150,50);
		this.add(c1);
		this.add(c2);
		this.add(l1);
		this.add(b1);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(900,250);
		this.setVisible(false);
		this.setLayout(null);
		this.setTitle("Select Professor Name from right and Course Name from Right");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
