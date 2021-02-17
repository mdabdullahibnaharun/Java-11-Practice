import java.awt.*;

public class SimpleLabel extends Frame {
    Label l1;

    public SimpleLabel(){
        setLayout(new FlowLayout());

        l1 = new Label("Label Example");

        add(l1);

        setTitle("AWT Example");
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleLabel s = new SimpleLabel();
    }

}
