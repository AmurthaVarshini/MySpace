import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleWindowApp {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Window 1");
        frame1.setSize(400, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        JButton button1 = new JButton("Go to Window 2");
        panel1.add(button1);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                showWindow2();
            }
        });

        frame1.setVisible(true);
    }

    public static void showWindow2() {
        JFrame frame2 = new JFrame("Window 2");
        frame2.setSize(400, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel2 = new JPanel();
        frame2.add(panel2);
        JButton button2 = new JButton("Go to Window 1");
        panel2.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                showWindow1();
            }
        });

        frame2.setVisible(true);
    }

    public static void showWindow1() {
        JFrame frame1 = new JFrame("Window 1");
        frame1.setSize(400, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        JButton button1 = new JButton("Go to Window 2");
        panel1.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                showWindow2();
            }
        });

        frame1.setVisible(true);
    }
}
