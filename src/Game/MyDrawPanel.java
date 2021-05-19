package Game;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fill3DRect(500, 500, 50, 50, true);

        Image image = new ImageIcon(getClass().getResource("oneEyeDoom.gif")).getImage();
        Image image1 = new ImageIcon(getClass().getResource("unicorn.gif")).getImage();
        g.drawImage(image,3,4,this);
        g.drawImage(image1,100,300,this);

    }
}


