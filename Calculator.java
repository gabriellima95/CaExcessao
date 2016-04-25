import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
	private static JPanel Panel  = new JPanel();
	private JButton botao1 = new JButton("1");
	private JButton botao2 = new JButton("2");
	private JButton botao3 = new JButton("3");
	private JButton botao4 = new JButton("4");
	private JButton botao5 = new JButton("5");
	private JButton botao6 = new JButton("6");
	private JButton botao7 = new JButton("7");
	private JButton botao8 = new JButton("8");
	private JButton botao9 = new JButton("9");
	private JButton botao0 = new JButton("0");
	private JButton botaoma = new JButton("+");
	private JButton botaome = new JButton("-");
	private JButton botaove = new JButton("*");
	private JButton botaodi = new JButton("/");
	private JButton botaoig = new JButton("=");
	private JButton ce = new JButton("CE");
	private boolean click = false;
	private boolean igual=false;
	private JTextField textArea = new JTextField(20);

public Calculator() {
	
    setTitle("Calculadora");
    setSize(400,300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    textArea     .setHorizontalAlignment(textArea.RIGHT); 
    textArea    .setText("0"); 
    textArea    .setCaretPosition(1); 
    textArea     .setEditable(false); 
    textArea.setFont(new Font(("Serif"), Font.BOLD, 16));
 
	 textArea              .setBounds(20,  10,  288, 25);
     botao7               .setBounds(20,  80,  50,  30);
     botao4               .setBounds(20,  115, 50,  30);
     botao1               .setBounds(20,  150, 50,  30);
     botao0               .setBounds(20,  185, 50,  30);
     botao8               .setBounds(80,  80,  50,  30);
     botao5               .setBounds(80,  115, 50,  30);
     botao2               .setBounds(80,  150, 50,  30);
     ce			          .setBounds(140, 45,  110, 30);      
     botao9               .setBounds(140, 80,  50,  30);             
     botao6               .setBounds(140, 115, 50,  30);
     botao3               .setBounds(140, 150, 50,  30);
     botaodi       	      .setBounds(200, 80,  50,  30);
     botaove  			  .setBounds(200, 115, 50,  30);
     botaome       		  .setBounds(200, 150, 50,  30);
     botaoig              .setBounds(140, 185, 50,  30);
     botaoma              .setBounds(200, 185, 50,  30);
     
     botao1               .addActionListener(this); 
     botao0               .addActionListener(this);
     botao2               .addActionListener(this);
     botao3               .addActionListener(this);
     botao4               .addActionListener(this);
     botao5               .addActionListener(this);
     botao6               .addActionListener(this);
     botao7               .addActionListener(this);
     botao8               .addActionListener(this);
     botao9               .addActionListener(this);
     botaoma               .addActionListener(this);
     botaome              .addActionListener(this);
     botaove               .addActionListener(this);
     botaodi               .addActionListener(this);
     botaoig               .addActionListener(this);
     ce		               .addActionListener(this);
     
     getContentPane()     .add(botaoma);
     getContentPane()     .add(botaome);
     getContentPane()     .add(botaove);
     getContentPane()     .add(botaodi);
     getContentPane()     .add(botaoig);
     getContentPane()     .add(ce);
     getContentPane()     .add(botao0);
     getContentPane()     .add(botao1);
     getContentPane()     .add(botao2);
     getContentPane()     .add(botao3);
     getContentPane()     .add(botao4);
     getContentPane()     .add(botao5);
     getContentPane()     .add(botao6); 
     getContentPane()     .add(botao7);
     getContentPane()     .add(botao8);
     getContentPane()     .add(botao9);
     getContentPane()     .add(textArea);
}
CalculatorEngine engine = new CalculatorEngine();
public void actionPerformed (ActionEvent e)
{
	Object source = e.getSource();
	if(igual){
		textArea.setText(" "); 
		igual=false;
	}
	 if(e.getSource() == botao0){
         if(click){
             textArea.setText("0");    
         }

         else{
             // o primeiro caracter é 0 ?
             if((textArea.getText().length() == 1) && (textArea.getText().equals("0"))){
                 textArea.setText("0");
             }

             else{
                 textArea.setText(textArea.getText()+"0");
             }
         }
         click = false;
         engine.digit(0);
     }
     if(e.getSource() == botao1){
         // é o segundo valor ?
         if(click){
             textArea.setText("1");
         }

         else{
             textArea.setText(textArea.getText()+"1");
         }

         click = false;
         engine.digit(1);
     }
     if(e.getSource() == botao2){
         // é o segundo valor ?
         if(click){
             textArea.setText("2");
         }

         else{
             textArea.setText(textArea.getText()+"2");
         }

         click = false;
         engine.digit(2);
     }
     if(e.getSource() == botao3){
         // é o segundo valor ?
         if(click){
             textArea.setText("3");
         }            

         else{
             textArea.setText(textArea.getText()+"3");
         }

         click = false;
         engine.digit(3);
     }
     if(e.getSource() == botao6){
         // é o segundo valor ?
         if(click){
             textArea.setText("6");
         }            

         else{
             textArea.setText(textArea.getText()+"6");
         }

         click = false;
         engine.digit(6);
     }
     if(e.getSource() == botao4){
         // é o segundo valor ?
         if(click){
             textArea.setText("4");
         }            

         else{
             textArea.setText(textArea.getText()+"4");
         }

         click = false;
         engine.digit(4);
     }
     if(e.getSource() == botao5){
         // é o segundo valor ?
         if(click){
             textArea.setText("5");
         }            

         else{
             textArea.setText(textArea.getText()+"5");
         }

         click = false;
         engine.digit(5);
     }
     if(e.getSource() == botao7){
         // é o segundo valor ?
         if(click){
             textArea.setText("7");
         }            

         else{
             textArea.setText(textArea.getText()+"7");
         }

         click = false;
         engine.digit(7);
     }
     if(e.getSource() == botao8){
         // é o segundo valor ?
         if(click){
             textArea.setText("8");
         }            

         else{
             textArea.setText(textArea.getText()+"8");
         }

         click = false;
         engine.digit(8);
     }
     if(e.getSource() == botao9){
         // é o segundo valor ?
         if(click){
             textArea.setText("9");
         }            

         else{
             textArea.setText(textArea.getText()+"9");
         }

         click = false;
         engine.digit(9);
     }
     if(e.getSource() == botaoma){
    	 click = true;         
         engine.add();
     }
     if(e.getSource() == botaome){
         click = true;
         engine.subtract();
     }
     if(e.getSource() == botaove){
         click = true;
         engine.multiply();
     }
     if(e.getSource() == botaodi){
         click = true;
         engine.divide();
     }
     if(e.getSource() == ce){
    	 textArea.setText("0");
    	 engine.clear();
     }
     if(e.getSource() == botaoig){
    	 engine.compute();
    	 textArea.setText("" + engine.display());
    	 engine.clear();
    	 igual=true;
     }
	}
	public static void main(String[] args)
{
	Calculator Calculadora = new Calculator();
	Calculadora.setVisible(true);
	Calculadora.repaint(); 
	//Calculadora.add(getContentPane(),BorderLayout.NORTH);
}
}
