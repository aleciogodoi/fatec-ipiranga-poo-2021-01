package Thread;

import java.awt.Point;

import javax.swing.JLabel;

public class Etiqueta extends JLabel implements Runnable {
	private int velocidade;
	private Point direcao;
		
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public Point getDirecao() {
		return direcao;
	}
	public void setDirecao(Point direcao) {
		this.direcao = direcao;
	}
	
	public void colisao () {
		if ( this.getLocation().x  >= this.getParent().getSize().getWidth() || this.getLocation().x < 0) 
			this.setDirecao(new Point(this.getDirecao().x*-1, this.getDirecao().y));
		if ( this.getLocation().y  >= this.getParent().getSize().getHeight() || this.getLocation().y < 0) 
			this.setDirecao(new Point(this.getDirecao().x, this.getDirecao().y*-1));
	}
	
	@Override
	public void run() {
		while (true) {
			colisao();
			this.setLocation(this.getLocation().x + this.getVelocidade() * this.getDirecao().x, 
					this.getLocation().y + this.getVelocidade() * this.getDirecao().y );
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
