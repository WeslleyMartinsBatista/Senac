package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class LoginView {
	JPanel telaLogin = new JPanel();
		ImageIcon logo = new ImageIcon("resources/images/logoEstozem.png"); JLabel labelLogo;
		
		JPanel cardLogin = new JPanel(); TitledBorder borderLogin; Font borderFonte;
		
			JPanel abaUsuario = new JPanel();
				JLabel labelUsuario = new JLabel("Usuario");
				JTextField textusuario = new JTextField();
				
			JPanel abaSenha = new JPanel();
				JLabel labelSenha = new JLabel("Senha");
				JTextField textSenha = new JTextField();
				
			JPanel abaEntrar = new JPanel();
				JButton botaoEntrar = new JButton("Entrar"); 
		
	public LoginView() {
		
	}
	private void gerenciarComponentes() {
		// - ABA USUARIO
		labelUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		labelUsuario.setBorder(BorderFactory.createEmptyBorder(20, 50, 0, 0)); // top, left, bottom, right
		
		textusuario.setPreferredSize(new Dimension(600, 30)); 
		textusuario.setMaximumSize(new Dimension(600, 30));
		
		// - ABA SENHA
		labelSenha.setFont(new Font("Arial", Font.BOLD, 18));
		labelUsuario.setBorder(BorderFactory.createEmptyBorder(20, 50, 0, 0)); // top, left, bottom, right
		
		textSenha.setPreferredSize(new Dimension(600, 30)); 
		textSenha.setMaximumSize(new Dimension(600, 30));
		
		// - ABA ENTRAR
		botaoEntrar.setPreferredSize(new Dimension(100, 30));
		botaoEntrar.setMaximumSize(new Dimension(100, 30));
		//botaoEntrar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		// - ADIÇÃO EM PANEIS
		abaUsuario.setLayout(new BoxLayout(abaUsuario, BoxLayout.Y_AXIS));
		abaUsuario.add(labelUsuario);
		abaUsuario.add(textusuario);
		
		abaSenha.setLayout(new BoxLayout(abaSenha, BoxLayout.Y_AXIS));
		abaSenha.add(labelSenha);
		abaSenha.add(textSenha);
		
		abaEntrar.setLayout(new BoxLayout(abaEntrar, BoxLayout.Y_AXIS));
		abaEntrar.add(botaoEntrar);
		
		
	}
	
	private void gerenciarLogin() {
		gerenciarComponentes();
		
		// LOGO
		//labelLogo = new JLabel(logo);
		Image img = logo.getImage();
		
		int largura = 100;
		int altura = 100;
		
		Image imgRedimensionada = img.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
		
		ImageIcon iconRedimensionado = new ImageIcon(imgRedimensionada);
		
		labelLogo = new JLabel(iconRedimensionado);
		
		// CARD LOGIN
		cardLogin.setPreferredSize(new Dimension(500, 500));
		cardLogin.setMaximumSize(new Dimension(500, 500));
		
		borderFonte = new Font("Arial", Font.BOLD, 16);
		
		borderLogin = BorderFactory.createTitledBorder(
			    BorderFactory.createEtchedBorder(), 
			    "Login", 
			    TitledBorder.LEFT, 
			    TitledBorder.TOP, 
			    borderFonte,
			    Color.BLUE
			);
		
		cardLogin.setBorder(borderLogin);
		//cardLogin.setBackground(Color.GRAY);
		
		cardLogin.setLayout(new BoxLayout(cardLogin, BoxLayout.Y_AXIS));
		
		cardLogin.add(abaUsuario);
		cardLogin.add(abaSenha);
		cardLogin.add(abaEntrar);
		
		// TELA
		telaLogin.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		telaLogin.add(labelLogo, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		telaLogin.add(cardLogin, gbc);
	}
	
	public JPanel setTelaLogin() {
		gerenciarLogin();
		//return cardLogin;
		return telaLogin;
	}
}
