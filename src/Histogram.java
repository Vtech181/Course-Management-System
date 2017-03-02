import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Histogram extends Frame implements ActionListener{
	static int f1=50;
	static int f2=50;
	static int f3=50;
	static int f4=50;
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3,tf4;
	
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(250, (600)-5*f1, 50, 5*f1);
		g.setColor(Color.RED);
		g.fillRect(350, (600)-5*f2, 50, 5*f2);
		g.setColor(Color.green);
		g.fillRect(450, (600)-5*f3, 50, 5*f3);
		g.setColor(Color.cyan);
		g.fillRect(550, (600)-5*f4, 50, 5*f4);
		g.setColor(Color.black);
		g.drawLine(200,100,200,600);
		g.drawLine(200,600,600,600);
		g.drawLine(195, 300, 205, 300);
		g.drawLine(195, 200, 205, 200);
		g.drawLine(195, 250, 205, 250);
		g.drawLine(195, 350, 205, 350);
		g.drawLine(195, 150, 205, 150);
		g.drawLine(195, 100, 205, 100);
		g.drawLine(195, 400, 205, 400);
		g.drawLine(195, 450, 205, 450);
		g.drawLine(195, 550, 205, 550);
		g.drawLine(195, 500, 205, 500);
		
	}
	Histogram()
	{
		tf1=new TextField();
		tf2=new TextField();
		tf3=new TextField();
		tf4=new TextField();
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
		tf4.addActionListener(this);
		l1=new Label("f1");
		l2=new Label("f2");
		l3=new Label("f3");
		l4=new Label("f4");
		l1.setBounds(270, 605, 50, 20);
		l2.setBounds(370, 605, 50, 20);
		l3.setBounds(470, 605, 50, 20);
		l4.setBounds(570,605, 50, 20);
		tf1.setBounds(250, 630, 50, 30);
		tf2.setBounds(350, 630, 50, 30);
		tf3.setBounds(450, 630, 50, 30);
		tf4.setBounds(550, 630, 50, 30);
		tf1.setText("50");
		tf2.setText("50");
		tf3.setText("50");
		tf4.setText("50");
		this.setLayout(null);
		this.add(l1);
		this.add(l4);
		this.add(l3);
		this.add(l2);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		this.setSize(900,900);
		this.setVisible(false);
		this.setTitle("Histogram analysis");
		this.setVisible(false);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent E)
			{
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		f1=Integer.parseInt(tf1.getText());
		f2=Integer.parseInt(tf2.getText());
		f3=Integer.parseInt(tf3.getText());
		f4=Integer.parseInt(tf4.getText());
		repaint();
		
	}
}
