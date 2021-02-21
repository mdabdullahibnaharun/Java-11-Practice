import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColoreChooserDemo extends JFrame implements ActionListener {

    JButton b;
    Container c;

    JColoreChooserDemo(){
        c = getContentPane();
        c.setLayout(new FlowLayout());

        b = new JButton("Color Chooser");
        b.addActionListener(this);

        c.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this,"Select a color",initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        JColoreChooserDemo jColoreChooser = new JColoreChooserDemo();
        jColoreChooser.setSize(400,400);
        jColoreChooser.setVisible(true);

        jColoreChooser.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
