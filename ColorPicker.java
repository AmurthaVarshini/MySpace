import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPicker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Picker");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button = new JButton("Pick Color");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
                if (color != null) {
                    panel.setBackground(color);
                }
            }
        });

        frame.setVisible(true);
    }
}
