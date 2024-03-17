
import javax.swing.JFrame;


public class Q1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Hello From Yasmeen");
        MyPanel mp =new MyPanel();
        frame.setContentPane(mp);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
