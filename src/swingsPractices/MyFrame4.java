package swingsPractices;
import java.awt.*;
import java.awt.event.*;
public class MyFrame4 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7411049724947520586L;
	Label l1,l2,l3;
	Button b1,b2;
	TextField t1,t2,t3;
	int sum=0;
	double avg=0;
	MyFrame4(){
		setLayout(new GridLayout(4,2,20,20));
		setBounds(200,200,500,500);
		
		l1=new Label("Number 1");
		t1=new TextField();
		l2=new Label("Number 2");
		t2=new TextField();
		l3=new Label("Result");
		t3=new TextField();
		t3.setEditable(false);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		
		b1=new Button("sum");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				
				t3.setText(a+b+"");
			}
		});
		add(b1);
		
		b2=new Button("Average");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int c=Integer.parseInt(t1.getText());
				int d=Integer.parseInt(t2.getText());
				
				t3.setText((c+d)/2.0f+"");
				
			}
		});
		add(b2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame4();

	}

}
