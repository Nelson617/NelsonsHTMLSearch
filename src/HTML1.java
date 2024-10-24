import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class HTML1 implements ActionListener {

    private JLabel label1;
    private JFrame mainFrame;
    private JPanel panel;
    private JTextArea textArea;
    private JPanel borderPanel, gridPanel;
    private JButton button1;
    JTextField textField;
    JPanel panel1;

    public static void main(String[] args) {

        HTML1 ex = new HTML1();

    }

    public HTML1() {

            borderPanel = new JPanel();

            panel = new JPanel();

            textArea = new JTextArea();

            mainFrame = new JFrame("URL Enrty");

            mainFrame.add(panel);

            panel1 = new JPanel();

            label1 = new JLabel("Enter URL: ");

            button1 = new JButton();

         button1.addActionListener(this);


        textField = new JTextField(20);

            panel.add(textArea, BorderLayout.SOUTH);

            borderPanel.add(textArea, BorderLayout.CENTER);

            panel.add(gridPanel, BorderLayout.NORTH);

            panel.add(textArea, BorderLayout.NORTH); //1 - website

            panel.add(label1, BorderLayout.NORTH); //2 - Input Word

            panel.add(button1, BorderLayout.NORTH); //3 - Button

            borderPanel.add(gridPanel, BorderLayout.CENTER);

            panel.setLayout(new BorderLayout());

            panel.setLayout(new GridLayout(3, 3));

            borderPanel = new JPanel(new BorderLayout());

            gridPanel.add(label1);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.pack();

        mainFrame.setVisible(true);

            mainFrame.setSize(500, 500);



        }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}













