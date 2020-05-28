/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcorsacavalli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author tommaso di giorno
 */
public class ProgCorsaCavalli extends JFrame{
    int pos;
    Fantino[] fantini;
    Corsa[] thread;
    Pista pista;
    Graphics grafica;
    Image immagine;

    public ProgCorsaCavalli() {
	super("Gara Cavalli");
	setSize(950, 545);
	setLocation(50, 50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pista = new Pista();
	fantini = new Fantino[5];
	thread = new Corsa[5];
	pos = 1;
	int partenza = 1;
	for (int xx=0; xx < 5; xx++) {
	    fantini[xx] = new Fantino(partenza,  xx+1);
       	    thread[xx] = new Corsa(fantini[xx], this);
	    partenza = partenza + 100;			
	}
	this.add(pista);
	setVisible(true);
    }
    
    public synchronized int getPos() {
	return pos++;
    }
	
    public synchronized void verifica() {
	boolean arrivati = true;
	for (int x = 0; x < 5; x++) {
            if (thread[x].pos == 0) {
	        arrivati = false;
	    }
        }
	if(arrivati) {
            podio();
	}
    }
	
    public void podio() {
        JLabel[] cavalliArrivati;
	cavalliArrivati = new JLabel[5];
	JFrame classifica = new JFrame("Classifica");
	classifica.setSize(450, 800);
	classifica.setLocation(50, 50);
	classifica.setBackground(Color.white);
	classifica.setDefaultCloseOperation(EXIT_ON_CLOSE);
	classifica.getContentPane().setLayout(new GridLayout(5,1 ));
		
	for(int x = 1; x < 6; x++) {
	    for(int y = 0; y < 5; y++) {
		if (thread[y].pos == x){
		    cavalliArrivati[y]=new JLabel("Il " + x + "' cavallo classificato è in " + (y + 1)+"' corsia");
		    cavalliArrivati[y].setFont(new Font("arial", Font.BOLD, 25));
		    cavalliArrivati[y].setForeground(Color.black);
		    classifica.getContentPane().add(cavalliArrivati[y]);
		}
	    }
	}
	classifica.setVisible(true);	
    }

    public void update(Graphics g) {
	paint(g);
    }
	
    public void paint(Graphics g) {
	if (fantini != null) {
	    Graphics2D screen = (Graphics2D) g;
	    immagine = createImage(950, 545);
	    grafica = immagine.getGraphics();
	    Dimension dim = getSize();
	    pista.paint(grafica);
	    for (int x = 0; x < 5; x++) {
		fantini[x].paint(grafica);
	    }
	    screen.drawImage(immagine, 0, 30, null);
	    grafica.dispose();
	}
    }

    public static void main(String[] a) {
	ProgCorsaCavalli corsa = new ProgCorsaCavalli();
    }
}
