package main;

import javax.swing.JFrame;

import view.LoginView;

public class Main {

	public static void main(String[] args) {
		LoginView telaLogin = new LoginView();
		JFrame janela = new JFrame("Gestão de estoque");
		
		
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		janela.add(telaLogin.setTelaLogin());
		janela.setVisible(true);
	}

}
