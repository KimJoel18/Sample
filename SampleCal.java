/**
  * Arellano, Kim Joel O.
  *ITCC 11 A2
  * October 5, 2020
  */
  
  import java.awt.*;
  import javax.swing.*;
  
  class SampleCal extends JFrame {
	  
	  JTextField t1;
	  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,bDecimal,equal,backspace,addidtion,subtraction,multiplication,divide;
	  
	  
  
	SampleCal() {
		setSize(525,460);
		setTitle("MyCalculator");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		t1=new JTextField(50);
		t1.setBounds(10,10,730,50);
		add(t1);
		t1.setEditable(false);
		
		
		
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		b6= new JButton("6");
		b7= new JButton("7");
		b8= new JButton("8");
		b9= new JButton("9");
		b10= new JButton("0");
		b11= new JButton("00");
		bDecimal= new JButton(".");
		
		
		
		backspace= new JButton("Backspace");
		equal= new JButton("=");
		addidtion= new JButton("+");
		subtraction= new JButton("-");
		multiplication= new JButton("*");
		divide= new JButton("/");
		
		b1.setBounds(10,80,70,60);
		b2.setBounds(100,80,70,60);
		b3.setBounds(190,80,70,60);
		b4.setBounds(10,170,70,60);
		b5.setBounds(100,170,70,60);
		b6.setBounds(190,170,70,60);
		b7.setBounds(10,260,70,60);
		b8.setBounds(100,260,70,60);
		b9.setBounds(190,260,70,60);
		b10.setBounds(10,350,70,60);
		b11.setBounds(100,350,70,60);
		bDecimal.setBounds(190,350,70,60);
		
		
		backspace.setBounds(371,80,100,60);
		equal.setBounds(347,350,150,60);
		addidtion.setBounds(340,260,70,60);
		subtraction.setBounds(430,260,70,60);
		multiplication.setBounds(340,170,70,60);
		divide.setBounds(430,170,70,60);
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10); 
		add(b11);
		add(bDecimal);
		
		
		add(equal);
		add(backspace);
		add(addidtion);
		add(subtraction);
		add(multiplication);
		add(divide);
		
		setVisible(true);
	}	
  public static void main(String[] args){
	  
	  new SampleCal();
	 
	}
  }
  
  
  
  

  
	