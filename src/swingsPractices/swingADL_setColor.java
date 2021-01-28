package swingsPractices;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingADL_setColor extends JFrame implements AdjustmentListener {
	
	private static final long serialVersionUID = -2981866369411215673L;
	JTextField t1;
	JScrollBar s1,s2,s3;
	swingADL_setColor(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(4,1,10,10));
		t1=new JTextField();
		s1=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		s2=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		s3=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		t1.setBackground(Color.black);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		add(t1);add(s1);add(s2);add(s3);
		setBounds(200,200,500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new swingADL_setColor();

	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		int r=s1.getValue();
		int g=s2.getValue();
		int b=s3.getValue();
		t1.setBackground(new Color(r,g,b));
		t1.setText(Integer.toString(r)+","+Integer.toString(g)+","+Integer.toString(b));
	}

}
