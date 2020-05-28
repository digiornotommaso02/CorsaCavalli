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
public class Fantino extends JPanel{
    int coordinateX;
    int coordinateY;
    Image immagine;

    public Fantino (int y, int x) {
	coordinateX = 0;
	coordinateY = y;
	setSize(80, 81);
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	switch (x) {
	case 1: {
	    immagine = toolkit.getImage("ImmagineCavalli/cavallo.gif");
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
	}
        MediaTracker mediatracker = new MediaTracker(this);
        mediatracker.addImage(immagine, 1);
        try {mediatracker.waitForID(1);} 
        catch (Exception e) {}
    }
	
    public void setCoordinateX(int n) {
	coordinateX = n;
    }
	
    public int getCoordinateX() {
	return coordinateX;
    }

    public void paint(Graphics g) {
	g.drawImage(immagine,  coordinateX,  coordinateY, null);
    }
}
