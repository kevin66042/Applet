package h2;

import java.awt.*;
import java.applet.*;

public class MijnTweedeApplet extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Kevin", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Buitenhuis", 50, 70 );
    }
}