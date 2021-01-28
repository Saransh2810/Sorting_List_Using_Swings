package swingsPractices;

import java.awt.*;

import java.awt.event.*;

public class MyFrame3 extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3205150112147898825L;
	Button b1,b2;
	TextArea t;
	MyFrame3(){
		
		b1=new Button("Msg1");
		b2=new Button("Msg2");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t=new TextArea();
		add(t);
		setBounds(200,200,450,450);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame3();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Button b=(Button)e.getSource();
		if(b==b1)
			System.out.println("Hello");
		else System.out.println("Bye");
	}


}
