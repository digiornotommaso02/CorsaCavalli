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
public class Pista extends JPanel{
    
    public void paint(Graphics g) {
	g.setColor(Color.gray);
	g.fillRect(0, 0, 960, 545);
	//Linee laterali
	g.setColor(Color.black);
        g.fillRect(0, 0, 10, 545);
        g.fillRect(100, 0, 10, 545);
	g.fillRect(0, 0, 950, 10);
        g.fillRect(0, 50, 950, 10);
	g.fillRect(0, 100, 950, 10);
        g.fillRect(0, 150, 950, 10);
	g.fillRect(0, 200, 950, 10);
        g.fillRect(0, 250, 950, 10);
	g.fillRect(0, 300, 950, 10);
        g.fillRect(0, 350, 950, 10);
	g.fillRect(0, 400, 950, 10);
        g.fillRect(0, 450, 950, 10);
	g.fillRect(0, 500, 950, 10);
        // Traguardo
        g.setColor(Color.white);
	g.fillRect(850, 0, 5, 545);
	}
}
