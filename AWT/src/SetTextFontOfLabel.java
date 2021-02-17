import java.awt.*;

public class SetTextFontOfLabel extends Frame {
    Label lb1,lb2;

    public  SetTextFontOfLabel (){
        setLayout(new FlowLayout());

        lb1 = new Label("Text Font Label");
        lb2 = new Label("Normal Text Label");

        add(lb1);
        add(lb2);

        Font myFont = new Font("Serif",Font.BOLD,12);
        lb1.setFont(myFont);

        setTitle("AWT Elements");
        setSize(200,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        SetTextFontOfLabel s1 = new SetTextFontOfLabel();
    }
}
