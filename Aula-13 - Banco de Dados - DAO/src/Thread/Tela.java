package Thread;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela extends JFrame  {

	JPanel   painel; 	// Painel onde serão colocados os labels
	Etiqueta lbl [] ; 	// Array da Classe Etiqueta herdeira de JLabel
	Thread[] thr;		// Array de Threads
	
	Tela(String titulo, int nrEtiqueta) {
		
		// Painel
		painel = new JPanel();	
		
		// Atributos da tela
		this.setSize(400, 300);			// Tamanho da Tela
		this.setTitle(titulo);			// Titulo da Tela
		this.add(painel);				// Adiona Painel na Tela
		this.painel.setLayout(null);	// Define o Layout do Painel como absoluto, devem ser colocadas as coordenas x e y
		
		// Etiquetas
		lbl = new Etiqueta[nrEtiqueta];	// Tamanho do array de Etiquetas
		thr = new Thread[nrEtiqueta];	// Tamanho do array de Threads
		Random r = new Random();		// Gerador de números aleatórios
		
		// Laço para definição dos atributos das etiquetas
		for (int i = 0; i < lbl.length; i++){
			lbl[i] = new Etiqueta();				// declara uma nova etiqueta de índice "i"
			lbl[i].setSize(50, 20);					// tamanho da etiqueta
			lbl[i].setLocation(0, 20 * (i + 1));	// posição da etiqueta em relação a Tela
			lbl[i].setText("Texto " + i);			// texto da etiqueta

			// Direção de x (1 = direita, -1 = esquerda)
			// Direção de y (1 = baixo, -1 = cima)
			switch (i % 3) 
			{
				case 0: 
					lbl[i].setDirecao(new Point(1,1));
					lbl[i].setVelocidade((i + 1 ) * 1);
					break;
				case 1: 
					lbl[i].setDirecao(new Point(-1,-1));
					lbl[i].setVelocidade((i + 1 ) * 2);
					break;
				case 2: 
					lbl[i].setDirecao(new Point(1,-1));
					lbl[i].setVelocidade((i + 1 ) * 3);
					break;				
			}
			
			// Define uma cor aleatoria para a Etiqueta 
			lbl[i].setForeground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			
			thr[i] = new Thread(lbl[i]);	// Declara um Thread associada a Etiqueta 
			thr[i].start();					// Inicia a Thread
			this.painel.add(lbl[i]);		// Adiciona a Etiqueta ao Painel
		}


		// Deixa Tela Visivel
		this.setVisible(true);
		
	}

}
