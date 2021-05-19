package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class something implements ActionListener {
    JButton button = new JButton("Click me");


    public static void main(String[] args) {
        something gui = new something();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();

        button.addActionListener(this);

        MyDrawPanel mypanel = new MyDrawPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.getContentPane().add(mypanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I have been clicked");
    }

}
//





//        //System objects
//        Scanner scanner = new Scanner(System.in);
//        Random rand = new Random();
//
//
//        Orc orc  = new Orc(100,14);
//        orc.shout();
//        Skeleton skeleton1 = new Skeleton(120, 11);
//        skeleton1.shout();
//        Zombie zombie1 = new Zombie(135, 7);
//        zombie1.shout();

//
//    }

//
//}
