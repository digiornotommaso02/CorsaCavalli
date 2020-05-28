/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcorsacavalli;

/**
 *
 * @author tommaso di giorno
 */
public class Corsa implements Runnable{
   Fantino fantino;
   ProgCorsaCavalli pista;
   int velocita;
   Thread thread;
   int contatore;
   int pos;
	
   public Corsa(Fantino f, ProgCorsaCavalli p) {
	fantino = f;
	pista = p;
	contatore = 0;
        velocita = 1;
        thread = new Thread(this);
        thread.start();
	pos = 0;
    }

    public void run() {
	int dimensioneImmagine = 50;
	int dimensionePista = 850;
	//while((ciclista.))
	while((fantino.getCoordinateX() + dimensioneImmagine) < dimensionePista) {
	    if ((contatore%10) == 0)
		velocita = (int)(Math.random() * 6 + 1);
		fantino.setCoordinateX(fantino.getCoordinateX() + velocita);
		contatore ++;
		try {Thread.sleep(100);}
		catch (Exception e) {}
		pista.repaint();
	}
	pos = pista.getPos();
	pista.verifica();
    }
}
