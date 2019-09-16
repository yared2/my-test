package problem1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swng a=new swng();
		a.setVisible(true);

	}

}
class swng extends JFrame {
	
	swng(){
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Metric Conversion Assistance");
		JButton b1=new JButton();
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		JTextField t5=new JTextField();
		JTextField t6=new JTextField();
		JTextField t7=new JTextField();
		JTextField t8=new JTextField();
		JLabel l1=new JLabel();
		JLabel l2=new JLabel();
		JLabel l3=new JLabel();
		JLabel l4=new JLabel();
		JLabel l5=new JLabel();
		JLabel l6=new JLabel();
		JLabel l7=new JLabel();
		JLabel l8=new JLabel();
//		label 1
		l1.setBounds(70, 70,50, 20);
		l1.setText("Mile :");
		add(l1);
		l2.setBounds(70, 100, 50, 20);
		l2.setText("Pound :");
		add(l2);
		l3.setBounds(70, 130, 50, 20);
		l3.setText("Gallon :");
		add(l3);
		l4.setBounds(70, 160, 90, 20);
		l4.setText("Fahrenheit :");
		add(l4);
//		textfiled
		t1.setBounds(160, 70, 80, 20);
		add(t1);
		t2.setBounds(160, 100, 80, 20);
		add(t2);
		t3.setBounds(160, 130, 80, 20);
		add(t3);
		t4.setBounds(160, 160, 80, 20);
		add(t4);
//		label 2
		l5.setBounds(250, 70, 70, 20);
		l5.setText("Kilometer :");
		add(l5);
		l6.setBounds(250, 100, 70, 20);
		l6.setText("Kilogram :");
		add(l6);
		l7.setBounds(250, 130, 50, 20);
		l7.setText("Liters :");
		add(l7);
		l8.setBounds(250, 160, 90, 20);
		l8.setText("Centrigarade :");
		add(l8);
		
//		tx 2
		t5.setBounds(350, 70, 80, 20);
		add(t5);
		t6.setBounds(350, 100, 80, 20);
		add(t6);
		t7.setBounds(350, 130, 80, 20);
		add(t7);
		t8.setBounds(350, 160, 80, 20);
		add(t8);
		b1.setBounds(250,200,80,30);
		add(b1);
		b1.setText("convert");
		b1.addActionListener(e->{
			String a1=t1.getText();
			double d1 =Double.valueOf(a1);
			double d2=d1*1.609344;
			int x=(int)Math.round(d2);
			String a2=String.valueOf(x);
			t5.setText(a2);
			
			
			String a3=t2.getText();
			double d3 =Double.valueOf(a3);
			double d4=d3*0.453592;
			int y=(int)Math.round(d4);
			String a4=String.valueOf(y);
			t6.setText(a4);
			
			String a5=t3.getText();
			double d5 =Double.valueOf(a5);
		    double d6=d5*3.785;
		    int z=(int)Math.round(d6);
			String a7 =String.valueOf(z);
			t7.setText(a7);
			
			String a8=t4.getText();
			double d7 =Double.valueOf(a8);
		    double d8=(d7-32)*0.556;
		    int k=(int)Math.round(d8);
			String a9 =String.valueOf(k);
			t8.setText(a9);
			
		
	});
	
}

}




















