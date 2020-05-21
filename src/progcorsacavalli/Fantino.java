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

/**
 *
 * @author tommaso di giorno
 */
public class Fantino {
    int x;
    int y;
    Image immagine;
    public void setCoordx(int n) {x = n;}
    public int getCoordx() {return x;}
    public void paint(Graphics g) {g.drawImage(immagine,  x,  y, null);}
    
    public Fantino(int yy, int xx) {
            x = 0;
            y = yy;
            setSize(0, 0);
		Toolkit tk = Toolkit.getDefaultToolkit();
		switch (xx) {
		case 1: {
			immagine = tk.getImage("");
			break;
		}
		case 2: {
			immagine = tk.getImage("");
			break;
		}
		case 3: {
			immagine = tk.getImage("");
			break;
		}
		case 4: {
			immagine = tk.getImage("");
			break;
		}
		case 5: {
			immagine = tk.getImage("");
			break;
		}
		case 6: {
			immagine = tk.getImage("");
			break;
		}
		}
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(immagine, 1);
		try {mt.waitForID(1);} 
                catch (Exception e) {}
	}
}
