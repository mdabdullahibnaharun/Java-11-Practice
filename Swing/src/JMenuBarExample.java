import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuBarExample implements Runnable, ActionListener {

    private JLabel message;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem openMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteJMenuItem;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new JMenuBarExample());
    }


    @Override
    public void run() {
        frame = new JFrame("Java Menubar Example");
        menuBar = new JMenuBar();
        message = new JLabel();

        message.setHorizontalAlignment(JLabel.CENTER);

        fileMenu = new JMenu("File");
        openMenuItem = new JMenuItem(" Open");
        fileMenu.add(openMenuItem);

        editMenu = new JMenu("Edit");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem(" Copy");
        pasteJMenuItem = new JMenuItem("Paste");
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteJMenuItem);

        openMenuItem.addActionListener(this);
        cutMenuItem.addActionListener(this);
        pasteJMenuItem.addActionListener(this);
        pasteJMenuItem.addActionListener(this);

        menuBar.add(fileMenu);
        frame.add(message, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,400));
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String textOnMenu = ((JMenuItem)e.getSource()).getText();
        message.setText(textOnMenu+" menu item clicked");
    }

}
