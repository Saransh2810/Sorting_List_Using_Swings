package swingsPractices;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingadjustmentListener extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1687401439811988032L;
	JTextField t1;
	JScrollBar s1;
	swingadjustmentListener(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		t1=new JTextField("0");
		s1=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,101);
		s1.setPreferredSize(new Dimension(100,20));
		t1.setPreferredSize(new Dimension(200,20));
		s1.setUnitIncrement(5);
		s1.setBlockIncrement(15);
		s1.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent ae) {
				t1.setText(String.valueOf(s1.getValue()));
			}
		});
		add(t1);add(s1);
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new swingadjustmentListener();

	}
}
