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
    CorsaCavalli campo;
    int velocita;
    Thread thread;
    int conta;
    int posizione;
	
    public Corsa(Fantino f, CorsaCavalli c) {
	fantino = f;
	campo = c;
	conta=0;
        velocita=2;
        thread = new Thread(this);
	thread.start();
	posizione=0;
	}
	
    public void run() {
	int dimImmagine=79;
	int dimPista=960;
	//while((ciclista.))
	while((fantino.getX() + dimImmagine) < dimPista) {
	    if ((conta%10) == 0){
		velocita = (int)(Math.random() * 4+1);
		fantino.setX(fantino.getX() + velocita);
		conta++;
		    try {Thread.sleep(75);}
		    catch (Exception e) {}
		campo.repaint();
            }
        }	
	posizione=campo.getPos();
	campo.Arrivi();
    }
}
