package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.controlG;

public class gui {
    private static String inputValue;
    private static JLabel label;

    public gui() {
        JFrame frame = new JFrame("Java GUI Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        panel.add(textField);

        JButton button = new JButton("Send Value");
        button.setBounds(50, 100, 200, 30);
        panel.add(button);

        label = new JLabel("Output: ");
        label.setBounds(50, 150, 300, 30);
        panel.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputValue = (textField.getText());
                controlG.Connect();
            }
        });

        frame.setVisible(true);
    }

    public static void showText(String text) {
        // System.out.println(text);
        label.setText("");
        label.setText("Output: " + text);
    }

    public static String getInputValue() {
        return inputValue;
    }

}
