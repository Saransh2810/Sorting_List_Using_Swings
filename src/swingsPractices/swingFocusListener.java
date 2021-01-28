package swingsPractices;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingFocusListener extends JFrame implements FocusListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7526478383691079986L;
	JTextField t1,t2,t3;
	swingFocusListener(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(3,1,10,10));
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t1.setBackground(Color.blue);
		t2.setBackground(Color.blue);
		t3.setBackground(Color.blue);
		add(t1);add(t2);add(t3);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		t3.addFocusListener(this);
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new swingFocusListener();

	}
	
	public void focusGained(FocusEvent fe) {
		JTextField tf=(JTextField)fe.getSource();
		tf.setBackground(Color.green);
	}
	public void focusLost(FocusEvent fe) {
		JTextField tf=(JTextField)fe.getSource();
		tf.setBackground(Color.blue);
	}

}
