package minhaAssistencia;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame {
	
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
