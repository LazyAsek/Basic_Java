import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickerMain {
    public static void main(String[] args) throws Exception {
        new ClickerMain();
    }

    JLabel counterLabel,perSecLabel;
    int buttonCounter,perSec;
    Font font1,font2;

    public ClickerMain(){
        creatFont();
        createUI();

    }

    public void creatFont (){
        font1= new Font("Comic Sans MS",Font.PLAIN,32);
        font2= new Font("Comic Sans MS",Font.PLAIN,16);
    }

    public void createUI(){
        JFrame window = new JFrame();
        window.setSize(1600, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(650, 700, 200, 220);
        buttonPanel.setBackground(Color.black);
        
        window.add(buttonPanel);
        
        ImageIcon button = new ImageIcon("res/button.png");
        
        JButton buttonButton = new JButton();
        buttonButton.setBackground(Color.black);
        buttonButton.setFocusPainted(false);
        buttonButton.setBorder(null);
        buttonButton.setIcon(button);
        buttonButton.setContentAreaFilled(false);

        buttonPanel.add(buttonButton);

        JPanel counterPanel = new JPanel();
        counterPanel.setBounds(575, 100, 350, 150);
        counterPanel.setBackground(Color.black);
        counterPanel.setLayout(new GridLayout(2,1));

        window.add(counterPanel);

        counterLabel = new JLabel(buttonCounter+"");
        counterLabel.setForeground(Color.white);
        counterLabel.setFont(font1);

        counterPanel.add(counterLabel);

        perSecLabel = new JLabel(perSec+"/s");
        perSecLabel.setForeground(Color.white);
        perSecLabel.setFont(font2);

        counterPanel.add(perSecLabel);

        
        window.setVisible(true);
    }
}
