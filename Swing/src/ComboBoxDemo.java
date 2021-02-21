import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;

public class ComboBoxDemo extends JPanel implements ActionListener {

    JLabel picture;

    public ComboBoxDemo(){
        super(new BorderLayout());

        ArrayList<String> listPet = new ArrayList<String>();

        listPet.add("Bird");
        listPet.add("Cat");
        listPet.add("Dog");
        listPet.add("Rabbit");
        listPet.add("Pig");

        JComboBox petList = new JComboBox(listPet.toArray());
        petList.setSelectedIndex(4);
        petList.addActionListener(this);

        picture = new JLabel();

        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));

        picture.setHorizontalAlignment(JLabel.CENTER);

        updateLabel(listPet.get(petList.getSelectedIndex()));

        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

        picture.setPreferredSize(new Dimension(177,122+10));

        add(petList,BorderLayout.PAGE_START);
        add(petList,BorderLayout.PAGE_END);

        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String petName = (String)cb.getSelectedItem();
        updateLabel(petName);
    }

    public void updateLabel(String name){
        picture.setText(name);
    }

    public static void creatAndShowGUI(){
        JFrame frame = new JFrame(" ComboBoxDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new ComboBoxDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creatAndShowGUI();
            }
        });
    }
}
