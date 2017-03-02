import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainPage extends Frame implements ActionListener{
	Label l1;
	AdminPage ap;
	Login l;
	Button blogin,bfaculty,bhelp,bfrench;
	static Frame main_page;
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand())
		{
		case "Faculty Login":
			l.setVisible(true);
			break;
		case "Administrator Login":
			ap.setVisible(true);
		}
		
	}
	MainPage()
	{
		ap=new AdminPage();
		l=new Login();
		bfaculty=new Button("Faculty Login");
		blogin=new Button("Administrator Login");
		
		blogin.setBounds(250,250,500,50);
		bfaculty.setBounds(250,300,500,50);
		
		blogin.addActionListener(this);
		bfaculty.addActionListener(this);
		
		this.setSize(900,450);
		this.setVisible(true);
		this.setLayout(null);
		
		this.add(blogin);
		this.add(bfaculty);
		
		this.setTitle("WELCOME TO BITS DSS");
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);
			}
			});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainPage mp=new MainPage();
	}

}
