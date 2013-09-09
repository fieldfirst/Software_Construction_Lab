import javax.swing.*;
import java.awt.*;
import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: Voravut
 * Date: 9/9/13
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main extends Observable{

    JFrame frm;

    public static void main(String[] args){
        Main m = new Main();
        m.addObserver(new View());
    }

    public Main(){
        final int HEIGHT = 500;
        final int WIDTH = 500;
        frm = new JFrame();
        frm.setSize(WIDTH, HEIGHT);
        frm.setTitle("Input Dialog :)");
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);

        frm.setLayout(new BorderLayout());
        frm.add(addUI());
    }

    private JPanel addUI(){
        JPanel ctrl = new JPanel();
        ctrl.setLayout(new GridLayout(6, 3));
        ctrl.add(new JLabel("Number"));
        ctrl.add(new JLabel();
        ctrl.add(new JLabel("y coordinate"));

        return ctrl;
    }

}
