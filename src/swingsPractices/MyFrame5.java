package swingsPractices;
import java.awt.*;
import java.awt.event.*;
public class MyFrame5 extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7408165487465493078L;
	TextField t1,t2;
	Button b1;
	MyFrame5(){
		setLayout(new FlowLayout());
		t1=new TextField(10);
		t2=new TextField(10);
		add(t1);add(t2);
		b1=new Button("Swap");
		b1.addActionListener(this);
		add(b1);
		setSize(300,100);
		setLocationRelativeTo(null);
		//pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new MyFrame5();
	}
	
	public void actionPerformed(ActionEvent e) {
		String s1=t1.getText();
		String s2=t2.getText();
		t1.setText(s2);t2.setText(s1);
	}

}
