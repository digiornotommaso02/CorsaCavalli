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
public class Cavallo implements Runnable{
   Cavalli cavalli;
   ProgCorsaCavalli pista;
   int velocita;
   Thread thread;
   int contatore;
   int pos;
   /**
    * Costruttore Cavallo
    * @param c
    * @param p 
    */
   public Cavallo(Cavalli c, ProgCorsaCavalli p) {
	cavalli = c;
	pista = p;
	contatore = 0;
        velocita = 10;
        thread = new Thread(this);
        thread.start();//inizia l'esecuzione del thread
	pos = 0;
    }
    /**
     * Metodo che permette di far muovere i cavalli lungo la pista
     */
    public void run() {
	int dimensioneImmagine = 100;
	int dimensionePista = 1100;
	while((cavalli.getCoordinateX() + dimensioneImmagine) < dimensionePista) {//il ciclo continua finchè ogni cavallo non arriva al traguardo
	    if ((contatore%10) == 0){
		velocita = (int)(Math.random() * 4 + 1);//velocità cavallo
            }
	    cavalli.setCoordinateX(cavalli.getCoordinateX() + velocita);//aggiunge alla coordinata x del cavallo la velocità per farlo muovere lungo l'asse
	    contatore ++;
	    try {Thread.sleep(100);}
	    catch (Exception e) {}
	    pista.repaint();
	}
	pos = pista.getPos();
	pista.verifica();
    }
}
