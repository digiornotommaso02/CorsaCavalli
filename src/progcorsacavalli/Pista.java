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
    /**
     * Metodo che crea la pista
     * @param g 
     */
    public void paint(Graphics g) {
        //Sfondo
	g.setColor(Color.gray);//Setta il colore dello sfondo
	g.fillRect(0, 0, 1200, 700);// Grandezza sfondo (x, y, altezza, larghezza)
	//Linee orizzontali
	g.setColor(Color.black);//Setta il colore delle linee laterali
	g.fillRect(0, 0, 1200, 5);
        g.fillRect(0, 70, 1200, 5);
	g.fillRect(0, 140, 1200, 5);
        g.fillRect(0, 210, 1200, 5);
	g.fillRect(0, 280, 1200, 5);
        g.fillRect(0, 350, 1200, 5);
	g.fillRect(0, 420, 1200, 5);
        g.fillRect(0, 490, 1200, 5);
	g.fillRect(0, 560, 1200, 5);
        g.fillRect(0, 630, 1200, 5);
	g.fillRect(0, 700, 1200, 5);
        //Linee verticali
        //Partenza
        g.fillRect(100, 0, 5, 700);
        //Traguardo
        g.setColor(Color.white);//Setta il colore della linea del traguardo
	g.fillRect(1100, 0, 5, 700);
	}
}
