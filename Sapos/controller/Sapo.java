package controller;

import java.awt.Component;
import java.awt.Graphics;

public class Sapo extends Component {

/** @see java.awt.Component#paint(java.awt.Graphics) */
@Override
public void paint(Graphics g) {
    super.paint(g);
    int x = 0, y = 0;
    
//  olho esquerdo
    
    g.drawArc(0, 0, 30, 60, 40, 120);
    g.drawOval(5,5,20,22);
    g.fillOval(10,10,10,10);

//  olho direito
    g.drawArc(25, 0, 30, 60, 20, 120);
    g.drawOval(30,5,20,22);
    g.fillOval(35,10,10,10);
    
    
//    g.drawLine(10, 10, 20, 300);
    // more drawing code here...
}

}
