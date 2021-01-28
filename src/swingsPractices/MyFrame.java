package swingsPractices;
import java.awt.*;
public class MyFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8862287220252143194L;
	Label l1;
	Button b1;
	MyFrame(){
		setLocation(150,150);
		
		setSize(400,400);
		
		setBackground(Color.green);
		
		setForeground(Color.red);
		
		setTitle("My First Frame");
		
		setResizable(false);
		
		l1=new Label("Saransh Bhatia");
		Font fnt=new Font("arial",Font.BOLD+Font.ITALIC,25);
		l1.setFont(fnt);
		add(l1);
		
		b1=new Button("start");
		Font fn=new Font(Font.SERIF,Font.PLAIN,20);
		b1.setFont(fn);
		add(b1);
		
		setUndecorated(true);
		
		setVisible(true);
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		dispose();
		
	}

	public static void main(String[] args) {
		
		new MyFrame();
		
	}

}
