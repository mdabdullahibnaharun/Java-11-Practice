import javax.swing.*;
import java.awt.*;

public class JListDemo extends JFrame {
    private JPanel topPanel;
    private JList listbox;

    public JListDemo(){
        setTitle("JlistDemo");
        setSize(300,150);
        setBackground(Color.gray);

        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);

        String listData[]={"Java"," python","polymer"," php"};

        listbox = new JList(listData);
        topPanel.add(listbox,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JListDemo mainFrame = new JListDemo();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
