/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcorsacavalli;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author tommaso di giorno
 */
public class Cavalli extends JPanel{
    int coordinateX;
    int coordinateY;
    Image immagine;
    /**
     * Costruttore Cavalli
     * @param y
     * @param x 
     */
    public Cavalli (int y, int x) {
	coordinateX = 0;
	coordinateY = y;
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	switch (x) {
	case 1: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");//ottiene l'immagine attraverso l'url
	    break;
	}
	case 2: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
	case 3: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
            break;
	}
        case 4: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
	case 5: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
        case 6: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
        case 7: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
        case 8: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
        case 9: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
        case 10: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
	    break;
	}
	}
        MediaTracker mediatracker = new MediaTracker(this);
        mediatracker.addImage(immagine, 1);
        try {mediatracker.waitForID(1);} 
        catch (Exception e) {}
    }
    /**
     * Metodo che permette di settare la coordinata x
     * @param n 
     */
    public void setCoordinateX(int n) {
	coordinateX = n;
    }
    /**
     * Metodo che permette di ottenere la coordinata X
     * @return 
     */
    public int getCoordinateX() {
	return coordinateX;
    }
    /**
     * Metodo che disegna l'immagine utilizzando le coordinate x e y
     * @param g 
     */
    public void paint(Graphics g) {
	g.drawImage(immagine,  coordinateX,  coordinateY, null);//disegna l'immagine in una posizione specifica
    }
}
