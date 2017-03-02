import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JSlider;
import javax.swing.plaf.SliderUI;

public class AssignmentLimit extends Frame implements ActionListener{
	Choice c1;
	JSlider sl;
	AssignmentLimit()
	{
		c1=new Choice();
		sl=new JSlider();
		
		sl.setMinorTickSpacing(1);
		sl.setPaintTicks(true);
		sl.setMinimum(0);
		sl.setMaximum(10);
		sl.setMajorTickSpacing(10);
		c1.addItem("c1");
		c1.addItem("c2");
		c1.addItem("c3");
		c1.addItem("c4");
		c1.setBounds(25,50,250,30);
		sl.setBounds(300, 50, 500, 30);
		this.add(sl);
		this.add(c1);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		this.setSize(900,100);
		this.setLayout(null);
		this.setVisible(false);
		this.setTitle("Choose the appropriate course and then use the slider to decide limit");
	}
	public static void main(String args[])
	{
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
