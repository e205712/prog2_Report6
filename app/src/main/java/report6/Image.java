//package jp.ac.uryukyu.ie.e205712;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.BorderLayout;

class Image extends JFrame{
  public static void main(String args[]){
    Image frame = new Image("MyTitle");
    frame.setVisible(true);
  }

  Image(String title){
    setTitle(title);
    setBounds(100, 100, 600, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon icon1 = new ImageIcon("./white.png");
    ImageIcon icon2 = new ImageIcon("./black.png");

    JLabel label1 = new JLabel(icon1);
    JLabel label2 = new JLabel(icon2);

    JPanel p = new JPanel();
    p.add(label1);
    p.add(label2);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}