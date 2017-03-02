import java.awt.Choice;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AssignmentFloated extends Frame implements ActionListener {
	Choice c1;
	TextArea t1;
	AssignmentFloated()
	{
		c1=new Choice();
		t1=new TextArea(500,1500);
		c1.add("c1");
		c1.add("c2");
		c1.add("c3");
		c1.add("c4");
		c1.setBounds(250,50,500,50);
		t1.setBounds(250,125,500,500);
		
		this.add(c1);
		this.add(t1);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			});
		
		this.setSize(900,800);
		this.setVisible(false);
		this.setLayout(null);
		this.setTitle("Select Course name from dropdown menu");
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
