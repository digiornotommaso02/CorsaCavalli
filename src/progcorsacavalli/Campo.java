/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcorsacavalli;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author tommaso di giorno
 */
public class Campo extends JPanel{
    
    public void paint(Graphics g) {
        g.setColor(Color.green);
	g.fillRect(0, 0, 800, 510);

	g.setColor(Color.black);
        g.fillRect(0, 0, 10, 510);
	g.fillRect(0, 0, 800, 10);
	g.fillRect(0, 50, 800, 10);
	g.fillRect(0, 100, 800, 10);
	g.fillRect(0, 150, 800, 10);
	g.fillRect(0, 200, 800, 10);
	g.fillRect(0, 250, 800, 10);
	g.fillRect(0, 300, 800, 10);
        g.fillRect(0, 350, 800, 10);
        g.fillRect(0, 400, 800, 10);
        g.fillRect(0, 450, 800, 10);
        g.fillRect(0, 500, 800, 10);
	g.fillRect(750, 0, 10, 510);
        g.fillRect(800, 0, 10, 510);
    }
}
