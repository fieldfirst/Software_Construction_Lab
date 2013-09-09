import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
/**
 * Created with IntelliJ IDEA.
 * User: Voravut
 * Date: 9/9/13
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */

public class View extends JFrame implements Observer {

    public View(){
        final int HEIGHT = 500;
        final int WIDTH = 500;
        setSize(WIDTH, HEIGHT);
        setTitle("Multi-Shape drawer");
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    public void clear(){

    }
}
