import java.awt.*;

public class LabelAlignment extends Frame {
    Label lb1,lb2,lb3,lb4;

    public LabelAlignment(){
        setLayout(new FlowLayout());
        lb1 = new Label("Left Label",Label.LEFT);
        lb2 = new Label("Right Label",Label.RIGHT);
        lb3 = new Label("Center Label",Label.CENTER);
        lb4 = new Label("Set Center Alginment");

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);

        lb4.setAlignment(Label.CENTER);
        setTitle("Label Alignment");
        setSize(150,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        LabelAlignment lab = new LabelAlignment();
    }
}
