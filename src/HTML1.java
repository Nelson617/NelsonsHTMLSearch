import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class HTML1 implements ActionListener {

    private JLabel label1;
    private JFrame mainFrame;
    private JPanel panel;
    private JTextArea textArea;
    private JPanel borderPanel, gridPanel;
    private JButton button;
    JTextField textField, textField2, urlField, searchTermField;
    JPanel panel1;

    public static void main(String[] args) {

        HTML1 ex;
        ex = new HTML1();

    }
    //panel boarder
    // results center, gird panel north

    public HTML1() {

        gridPanel = new JPanel(new GridLayout(3, 1));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        borderPanel = new JPanel();

        textArea = new JTextArea();

        mainFrame = new JFrame("URL Entry");

        textField = new JTextField("Enter URL: ");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JTextField urlField = new JTextField("link", 20);
        JTextField searchTermField = new JTextField("Search Term", 20);

        inputPanel.add(new JLabel("URL:"));
        inputPanel.add(urlField);

        inputPanel.add(new JLabel("Search Term:"));
        inputPanel.add(searchTermField);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton button = new JButton("Go");

        inputPanel.add(button);

        borderPanel = new JPanel(new BorderLayout());

        panel.add(inputPanel, BorderLayout.NORTH);

        panel.add(scrollPane, BorderLayout.CENTER);


        borderPanel.add(textArea, BorderLayout.CENTER);

        borderPanel.add(gridPanel, BorderLayout.NORTH);

        mainFrame.add(borderPanel);

        mainFrame.add(gridPanel);


        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.pack();

        mainFrame.add(panel);

        mainFrame.setVisible(true);

        mainFrame.setSize(500, 500);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String urlString = urlField.getText();
            String searchTerm = searchTermField.getText();

            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }
            in.close();

        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}













