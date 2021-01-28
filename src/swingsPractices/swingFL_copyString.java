package swingsPractices;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class swingFL_copyString extends JFrame implements FocusListener{
	
	private static final long serialVersionUID = -2580691294821177679L;
	JTextField t1,t2;
	String s1;
	swingFL_copyString(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		t1=new JTextField(15);
		t2=new JTextField(15);
		add(t1);add(t2);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new swingFL_copyString();

	}
	
	public void focusLost(FocusEvent fe) {
		JTextField tf=(JTextField)fe.getSource();
		s1=tf.getText();
	}
	public void focusGained(FocusEvent fe) {
		JTextField tf=(JTextField)fe.getSource();
		tf.setText(s1);
	}
	
	
}
