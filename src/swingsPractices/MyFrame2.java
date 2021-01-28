package swingsPractices;
import java.awt.*;
public class MyFrame2 extends Frame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1991156376021708943L;
	Button b1,b2,b3,b4,b5;
	Scrollbar sc1,sc2;
	Panel p1,p2;
	TextArea t1;
	
	MyFrame2(){
		p1=new Panel();
		b1=new Button("Ok");
		b2=new Button("Start");
		p1.add(b1);
		p1.add(b2);
		
		p2=new Panel();
		p2.setLayout(new GridLayout(3,1));
		b3=new Button("B");
		b4=new Button("I");
		b5=new Button("U");
		p2.add(b3);p2.add(b4);p2.add(b5);
		
		t1=new TextArea();
		sc1=new Scrollbar(Scrollbar.VERTICAL);
		sc2=new Scrollbar(Scrollbar.HORIZONTAL);
		add(p1,"North");
		add(p2,"West");
		add(t1);
		add(sc1,"East");
		add(sc2,"South");
		setBounds(200,200,450,450);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MyFrame2();

	}

}
