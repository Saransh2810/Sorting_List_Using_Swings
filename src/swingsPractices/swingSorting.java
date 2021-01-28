package swingsPractices;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class swingSorting extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JTextArea a1;
	JButton b1,b2;
	ArrayList<Student> list=new ArrayList<Student>();
	JComboBox<String> c1;
	
	public class Student{
		String name,course;
		int rollno;
		Student(String n,int r,String c)
		{
			this.name=n;
			this.rollno=r;
			this.course=c;
		}
		
	}
	public class nameComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			
			return s1.name.compareTo(s2.name);
		}
	}
	public class rollnoComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			
			if(s1.rollno==s2.rollno)
				return 0;
			else if(s1.rollno>s2.rollno)
				return 1;
			else return -1;
		}
	}
	public class courseComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			
			return s1.course.compareTo(s2.course);

		}
	}
	
	swingSorting()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.green);
		l1=new JLabel("Name");
		l1.setBounds(50,50,100,30);
		t1=new JTextField();
		t1.setBounds(200,50,200,30);
		l2=new JLabel("Roll Number");
		l2.setBounds(50,100,100,30);
		t2=new JTextField();
		t2.setBounds(200,100,200,30);
		l3=new JLabel("Course");
		l3.setBounds(50,150,100,30);
		t3=new JTextField();
		t3.setBounds(200,150,200,30);
		b1=new JButton("Add");
		b1.setBounds(130, 225, 100, 30);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				String s1=t1.getText();
				int s2=Integer.valueOf(t2.getText());
				String s3=t3.getText();
				
				list.add(new Student(s1,s2,s3));
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		b2=new JButton("Display");
		b2.setBounds(200,270,100,30);
		String sortBy[]= {"Name","Roll No","Course"};
		c1=new JComboBox(sortBy);
		c1.setBounds(255, 225, 100, 30);
		a1=new JTextArea();
		a1.setBounds(50,325,400,150);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				String test=String.valueOf(c1.getItemAt(c1.getSelectedIndex()));
				if(test=="Name")
				{
					Collections.sort(list,new nameComparator());
					Iterator<Student> itr=list.iterator();
					String res="";
					while(itr.hasNext())
					{
						Student st=itr.next();
						res+=(st.name+"\t"+st.rollno+"\t"+st.course+"\n");
					}
					a1.setText("Name\tRollNo\tCourse\n"+res);
				}
				else if(test=="Roll No")
				{
					Collections.sort(list,new rollnoComparator());
					Iterator<Student> itr=list.iterator();
					String res="";
					while(itr.hasNext())
					{
						Student st=itr.next();
						res+=(st.name+"\t"+st.rollno+"\t"+st.course+"\n");
					}
					a1.setText("Name\tRollNo\tCourse\n"+res+"\n");
				}
				else
				{
					Collections.sort(list,new courseComparator());
					Iterator<Student> itr=list.iterator();
					String res="";
					while(itr.hasNext())
					{
						Student st=itr.next();
						res+=(st.name+"\t"+st.rollno+"\t"+st.course+"\n");
					}
					a1.setText("Name\tRollNo\tCourse\n"+res+"\n");
				}

			}
		});
		
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(c1);add(a1);
		setBounds(200,200,500,650);
		
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new swingSorting();
	}

}
