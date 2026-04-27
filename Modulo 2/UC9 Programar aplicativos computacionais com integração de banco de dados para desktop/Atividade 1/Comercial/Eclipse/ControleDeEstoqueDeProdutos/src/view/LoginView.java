package view;

import javax.swing.*;

public class LoginView {
	//JPanel telaLogin = new JPanel();
		JPanel cardLogin = new JPanel();
			JTextField textNome = new JTextField();
			JTextField textSenha = new JTextField();
			JButton botaoEntrar = new JButton(); 
			
	public LoginView() {
		
	}
	
	private void gerenciarLogin() {
		
		
	}
	
	public JPanel setTelaLogin() {
		gerenciarLogin();
		return cardLogin;
	}
}
