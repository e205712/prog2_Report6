import javax.swing.*;
import java.awt.BorderLayout;

public class Panel extends JFrame{

  public static void main(String[] args){
    Panel frame = new Panel();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 600, 450);
    frame.setTitle("ゲーム");
    frame.setVisible(true);
  }

  Panel(){
    JPanel p = new JPanel();
    p.setLayout(null);

    JButton button1 = new JButton("1");
    button1.setBounds(200, 50, 80, 80);

    JButton button2 = new JButton("2");
    button2.setBounds(280, 50, 80, 80);

    JButton button3 = new JButton("3");
    button3.setBounds(360, 50, 80, 80);

    JButton button4 = new JButton("4");
    button4.setBounds(440, 50, 80, 80);


    JButton button5 = new JButton("5");
    button5.setBounds(200, 130, 80, 80);

    JButton button6 = new JButton("6");
    button6.setBounds(280, 130, 80, 80);

    JButton button7 = new JButton("7");
    button7.setBounds(360, 130, 80, 80);

    JButton button8 = new JButton("8");
    button8.setBounds(440, 130, 80, 80);


    JButton button9 = new JButton("9");
    button9.setBounds(200, 210, 80, 80);

    JButton button10 = new JButton("10");
    button10.setBounds(280, 210, 80, 80);

    JButton button11 = new JButton("11");
    button11.setBounds(360, 210, 80, 80);

    JButton button12 = new JButton("12");
    button12.setBounds(440, 210, 80, 80);


    JButton button13 = new JButton("13");
    button13.setBounds(200, 290, 80, 80);

    JButton button14 = new JButton("14");
    button14.setBounds(280, 290, 80, 80);
    
    JButton button15 = new JButton("15");
    button15.setBounds(360, 290, 80, 80);

    JButton button16 = new JButton("16");
    button16.setBounds(440, 290, 80, 80);

    JButton resetButton = new JButton("やり直す");
    resetButton.setBounds(60,260,100,30);

    JButton restartButton = new JButton("新規ゲーム");
    restartButton.setBounds(60,300,100,30);

    p.add(button1);
    p.add(button2);
    p.add(button3);
    p.add(button4);
    p.add(button5);
    p.add(button6);
    p.add(button7);
    p.add(button8);
    p.add(button9);
    p.add(button10);
    p.add(button11);
    p.add(button12);
    p.add(button13);
    p.add(button14);
    p.add(button15);
    p.add(button16);
    p.add(resetButton);
    p.add(restartButton);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}