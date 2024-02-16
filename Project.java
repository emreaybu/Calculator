
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Project implements ActionListener {
	JFrame frame; 
    JTextField text;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    JLabel label,label1 ;
    double num1=0,num2=0,result=0;
    char operation;
    
    Project(){
    	 frame = new JFrame("calculator");
    	 label = new JLabel ("calculate area");
    	 label.setBounds(100,100,200,50);
    	 text = new JTextField();
    	 text.setBounds(100,150,200,50);
    	 
    	b4 = new JButton("+");
    	b4.setBounds(310,220,50,50);
    	b8 = new JButton("-");
    	b8.setBounds(310,290,50,50);
    	b12 = new JButton("*");
    	b12.setBounds(310,360,50,50);
    	b13 = new JButton("=");
    	b13.setBounds(100,430,50,50);
    	b15 = new JButton("C");
    	b15.setBounds(240,430,50,50);
    	b16 = new JButton("/");
    	b16.setBounds(310,430,50,50);
    	
    	b4.addActionListener(this);
    	b8.addActionListener(this);
    	b12.addActionListener(this);
    	b16.addActionListener(this);
    	b13.addActionListener(this);
    	 
    	 b1= new JButton ("1");
    	b1.setBounds(100,220,50,50);
    	b1.addActionListener(new ActionListener(){
    	@Override
    	public void actionPerformed(ActionEvent e) {

    	String a =text.getText();
    	 a+="1";
    	text.setText(a);
           }
    	});

    	b2= new JButton("2");
    	b2.setBounds(170,220,50,50);

    	b2.addActionListener(new ActionListener(){

    	@Override
    	public void actionPerformed(ActionEvent e) {

    	String a =text.getText();
    	 a+="2";
    	 text.setText(a);
    	}
    	});

    	
    	b3= new JButton ("3");
    	b3.setBounds(240,220,50,50);

    	b3.addActionListener(new ActionListener(){

    	@Override
    	public void actionPerformed(ActionEvent e) {

    	String a =text.getText();
    	 a+="3";
    	 text.setText(a); 
    	}
    	});
    	
        b5 = new JButton("4");
        b5.setBounds(100,290,50,50);

        b5.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        String a =text.getText();
        a+="4";
        text.setText(a);
          }
        });

        b6= new JButton("5");
        b6.setBounds(170,290,50,50);

        b6.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        String a =text.getText();
        a+="5";
        text.setText(a);
           
            }
          });

        b7= new JButton("6");
        b7.setBounds(240,290,50,50);

        b7.addActionListener(new ActionListener(){

           @Override
         public void actionPerformed(ActionEvent e) {

         String a =text.getText();
          a+="6";
           text.setText(a);
          }
    });
        
        b9= new JButton("7");
        b9.setBounds(100,360,50,50);

        b9.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        String a =text.getText();
         a+="7";
         text.setText(a);


        }
        });

        b10= new JButton("8");
        b10.setBounds(170,360,50,50);

        b10.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        String a =text.getText();
         a+="8";
         text.setText(a);


        }
        });




        b11= new JButton("9");
        b11.setBounds(240,360,50,50);

        b11.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        String a =text.getText();
         a+="9";
         text.setText(a);


        }
        });

        

        b14= new JButton("0");
        b14.setBounds(170,430,50,50);

        b14.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        String a =text.getText();
         a+="0";
         text.setText(a);


        }
        });

        b15= new JButton("C");
        b15.setBounds(240,430,50,50);

        b15.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {

        text.setText("");
         

        }
        }); 

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);
        frame.add(b16);
    	 
    	 frame.add(text);
    	 frame.add(label);
    	 frame.setSize(400,400);
    	 frame.setLayout(null);
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setVisible(true);
    }
 
	public static void main (String[] args) {
		Project calculator = new Project();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b4) {
			num1 = Double.parseDouble(text.getText());
			operation= '+';
			text.setText(" ");
			}
			if(e.getSource()==b8) {
			num1 = Double.parseDouble(text.getText());
			operation= '-';
			text.setText(" ");
			}	
			if(e.getSource()==b12) {
			num1 = Double.parseDouble(text.getText());
			operation= '*';
			text.setText(" ");
			}
			if(e.getSource()==b16) {
			num1 = Double.parseDouble(text.getText());
			operation= '/';
			text.setText(" ");
			}
			if(e.getSource()==b13) {
			num2 = Double.parseDouble(text.getText());

			switch(operation) {
			case '+' : 
			result= num1 +num2;
			break;
			case '-' : 
			result= num1-num2;
			break;
			case '*' : 
			result= num1*num2;
			break;
			case '/' : 
			result= num1/num2;
			break;
			}
			text.setText(String.valueOf(result));
			num1=result;
			}
			if(e.getSource()==b15) {
			text.setText("");	
	}
  }
}

	
	
	


