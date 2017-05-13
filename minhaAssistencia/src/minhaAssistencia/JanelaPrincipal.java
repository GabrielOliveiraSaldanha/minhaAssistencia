package minhaAssistencia;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame {
	private JMenuBar menuBar;
	private JMenu menuArquivo;
	
	public JanelaPrincipal() {
		this.setTitle("minhaAssistência");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
		
	}
	

	public static void main(String[] args) {
		
		JFrame janela = new JanelaPrincipal();
		
		

	}

}
