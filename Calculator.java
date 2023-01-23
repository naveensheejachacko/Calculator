import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingConstants;

public class Calculator implements ActionListener

{	String oldValue,newValue,result;
	char operator;
	
	JFrame jf;
	JLabel DisplayLabel;
	JButton zeroButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton; 
	JButton addButton;
	JButton subButton;
	JButton mulButton;
	JButton divButton;
	JButton dotButton;
	JButton equalButton;
	JButton clearButton;
	JButton deleteButton;
	Font myFont=new Font("Arial",Font.BOLD,30);
	
	boolean clicked=false;
	boolean sum;
	boolean mul;
	boolean div;
	boolean minus;
	
	
	
	
	public Calculator()
	{
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(420, 550);
		jf.setLocation(500, 120);
		DisplayLabel=new JLabel();
		DisplayLabel.setForeground(Color.white);
		DisplayLabel.setBounds(50, 25, 300, 50);
		DisplayLabel.setFont(myFont);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		jf.add(DisplayLabel);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT); 
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 60, 60);
		sevenButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(110,130, 60, 60);
		eightButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(190, 130, 60, 60);
		nineButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,210,60,60);
		fourButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(110, 210, 60, 60);
		fiveButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(190, 210, 60, 60);
		sixButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 290, 60, 60);
		oneButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(110, 290, 60, 60);
		twoButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		
		threeButton=new JButton("3");
		threeButton.setBounds(190, 290, 60, 60);
		threeButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30, 370, 60, 60);
		zeroButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		dotButton=new JButton(".");
		dotButton.setBounds(110, 370, 60, 60);
		dotButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		equalButton=new JButton("=");
		equalButton.setBounds(190, 370, 60, 60);
		equalButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		divButton=new JButton("/");
		divButton.setBounds(270, 130, 60, 60);
		divButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(divButton);
		divButton.addActionListener(this);
		
		mulButton=new JButton("*");
		mulButton.setBounds(270, 210, 60, 60);
		mulButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(mulButton);
		mulButton.addActionListener(this);
		
		subButton=new JButton("-");
		subButton.setBounds(270, 290, 60, 60);
		subButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(subButton);
		subButton.addActionListener(this);
		
		addButton=new JButton("+");
		addButton.setBounds(270, 370, 60, 60);
		addButton.setFont(new Font("Arial",Font.BOLD,30));
		jf.add(addButton);
		addButton.addActionListener(this);
		
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(30,450,145,60);
		clearButton.setFont(new Font ("Arial",Font.BOLD,30));
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
		deleteButton=new JButton("Delete");
		deleteButton.setBounds(190,450,140,60);
		deleteButton.setFont(myFont);
		jf.add(deleteButton);
		deleteButton.addActionListener(this);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Calculator();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==sevenButton)
		{
			if(clicked) {
			DisplayLabel.setText("7");
			clicked=false;
			}
			else
			{
				
			DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightButton)
		{
			if(clicked) {
				DisplayLabel.setText("8");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"8");
				}
		}
		else if(e.getSource()==nineButton)
		{
			if(clicked) {
			DisplayLabel.setText("9");
			clicked=false;
			}
			else
			{
			DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==fourButton)
		{
			if(clicked) {
				DisplayLabel.setText("4");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"4");
				}
		}
		
		else if(e.getSource()==fiveButton)
		{
			if(clicked) {
				DisplayLabel.setText("5");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"5");
				}
		}
		else if(e.getSource()==sixButton)
		{
			if(clicked) {
				DisplayLabel.setText("6");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"6");
				}
		}
		else if(e.getSource()==oneButton)
		{
			if(clicked) {
				DisplayLabel.setText("1");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"1");
				}
		}
		else if(e.getSource()==twoButton)
		{
			if(clicked) {
				DisplayLabel.setText("2");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"2");
				}
		}
		else if(e.getSource()==threeButton)
		{
			if(clicked) {
				DisplayLabel.setText("3");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"3");
				}
		}
		else if(e.getSource()==zeroButton)
		{
			if(clicked) {
				DisplayLabel.setText("0");
				clicked=false;
				}
				else
				{
			DisplayLabel.setText(DisplayLabel.getText()+"0");
				}
		}
		else if(e.getSource()==addButton)
		{
			clicked=true;
			oldValue=DisplayLabel.getText();
			sum=true;
		}
		else if(e.getSource()==subButton)
		{
			clicked=true;
			oldValue=DisplayLabel.getText();
			minus=true;
		}
		else if(e.getSource()==mulButton)
		{
			clicked=true;
			oldValue=DisplayLabel.getText();
			mul=true;
		}
		
		else if(e.getSource()==divButton)
		{
			clicked=true;
			oldValue=DisplayLabel.getText();
			div=true;
		}
		else if(e.getSource()==dotButton)
		{
			if(DisplayLabel.getText().contains("."))
			{
			return;
			}
			else
		{
			DisplayLabel.setText(DisplayLabel.getText()+".");
		}
		}
		else if(e.getSource()==equalButton)
		{
			if(sum)
			{
		 String newValue=DisplayLabel.getText();
		 float oldValueF=Float.parseFloat(oldValue);
		 float newValueF=Float.parseFloat(newValue);
		 float result=oldValueF+newValueF;
		 DisplayLabel.setText(result+"");
		 sum=false;
			}
			else if(minus)
			{
				String newValue=DisplayLabel.getText();
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				float result=oldValueF-newValueF;
				DisplayLabel.setText(result+"");
				minus=false;
				
			}
			else if(mul)
			{
				String newValue=DisplayLabel.getText();
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				float result=oldValueF*newValueF;
				DisplayLabel.setText(result+"");
				mul=false;
			}
			else if(div)
			{
				String newValue=DisplayLabel.getText();
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				float result=oldValueF/newValueF;
				DisplayLabel.setText(result+"");
				div=false;
			}
		}
	
		
		
		
		if(e.getSource()==clearButton)
		{
			DisplayLabel.setText("");
		}
		if(e.getSource()==deleteButton)
		{
			String string=DisplayLabel.getText();
			DisplayLabel.setText("");
			for(int i=0;i<string.length()-1;i++)
				DisplayLabel.setText(DisplayLabel.getText()+string.charAt(i));
		}
	}

}

