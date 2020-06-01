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
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author tommaso di giorno
 */
public class ProgCorsaCavalli extends JFrame{
    int pos;
    int num = 0;
    Cavalli[] cavalli;
    Cavallo[] thread;
    Pista pista;
    Graphics grafica;
    Image buffer;
    /**
     * Costruttore ProgCorsaCavalli
     */
    public ProgCorsaCavalli() {
	super("Corsa Cavalli");
        while(num < 2 || num > 10){
            Scanner input = new Scanner(System.in);
            System.out.println("Scegli il numero di cavalli da far careggiare");
            num = input.nextInt();//inserimento numero cavalli
            if(num >= 11 || num <= 1){
                System.out.println("Devi inserire un numero tra 2 e 10");
            }
        }
	setSize(1200, 740);//setta la grandezza della finestra corsa cavalli(lunghezza, altezza)
	setLocation(50, 0);//setta la posizione della finestra sullo schermo in base alle coordinate(x, y)
	pista = new Pista();
	cavalli = new Cavalli[num];
	thread = new Cavallo[num];
	pos = 1;
	int posIniziale = 0;
	for (int x = 0; x < num; x++) {
	    cavalli[x] = new Cavalli(posIniziale,  x + 1);
       	    thread[x] = new Cavallo(cavalli[x], this);
	    posIniziale = posIniziale + 70;			
	}
	this.add(pista);
	setVisible(true);
    }
    /**
     * Metodo che permette di ottenere la posizione
     * @return 
     */
    public synchronized int getPos() {
	return pos++;
    }
    /**
     * Metodo che verifica se i cavalli sono arrivati
     */
    public synchronized void verifica() {
	boolean arrivati = true;
	for (int x = 0; x < num; x++) {
            if (thread[x].pos == 0) {
	        arrivati = false;
	    }
        }
	if(arrivati) {
            classifica();
	}
    }
    /**
     * Metodo che permette di visualizzare la classifica
     */
    public void classifica() {
        JLabel[] cavalliArrivati;
	cavalliArrivati = new JLabel[num];
	JFrame classifica = new JFrame("Classifica");
	classifica.setSize(500, 500);//setta la grandezza della finestra(lunghezza, altezza)
	classifica.setLocation(50, 0);// setta la posizione della finestra sullo schermo in base alle coordinate(x, y)
	classifica.setBackground(Color.white);//setta il colore dello sfondo della finestra
	classifica.getContentPane().setLayout(new GridLayout(num,1 ));
	for(int x = 1; x < num + 1; x++) {
	    for(int y = 0; y < num; y++) {
		if (thread[y].pos == x){
		    cavalliArrivati[y]=new JLabel("Il " + x + "' cavallo classificato è in " + (y + 1)+ "' corsia");
		    cavalliArrivati[y].setFont(new Font("arial", Font.BOLD, 25));//setta il font della scritta
		    cavalliArrivati[y].setForeground(Color.black);//setta il colore della scritta
		    classifica.getContentPane().add(cavalliArrivati[y]);
		}
	    }
	}
	classifica.setVisible(true);//rende visibile la classifica
    }
    /**
     * Metodo che aggiorna la grafica
     * @param g 
     */
    public void update(Graphics g) {
	paint(g);
    }
    /**
     * Metodo che disegna la grafica
     * @param g 
     */
    public void paint(Graphics g) {
	if (cavalli != null) {
	    Graphics2D screen = (Graphics2D) g;
	    buffer = createImage(1200, 700);
	    grafica = buffer.getGraphics();
	    pista.paint(grafica);
	    for (int x = 0; x < num; x++) {
		cavalli[x].paint(grafica);
	    }
	    screen.drawImage(buffer, 0, 30, this);
	    grafica.dispose();
	}
    }
    /**
     * Metodo main
     * @param a 
     */
    public static void main(String[] a) {
	ProgCorsaCavalli corsa = new ProgCorsaCavalli();
    }
}
