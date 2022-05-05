package vistaJuego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public abstract class Boton extends JButton implements ActionListener{

		private int valor;

		public Boton(int valor) {
			this.valor = valor;
			setPreferredSize(new Dimension(50, 50));
			setFocusPainted(false);
			cambiarColor();
			addActionListener(this);
			setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		}
		
		public int getValor() {
			return valor;
		}
		
		public void ciclarValor() {
			if (valor == 6)
				valor = 1; 
			else
				valor++;
			cambiarColor();
		}

		public void cambiarColor() {
			switch (valor) {
			case 1:
				setBackground(Color.RED);
				break;
			case 2:
				setBackground(Color.BLUE);
				break;
			case 3:
				setBackground(Color.GREEN);
				break;
			case 4:
				setBackground(Color.YELLOW);
				break;
			case 5:
				setBackground(Color.ORANGE);
				break;
			case 6:
				setBackground(Color.WHITE);
			}
		}

		public void actionPerformed1(ActionEvent e) {
			ciclarValor();	
		
			
		}

		

	}
