package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import controller.BolinhaController;
import controller.Sapo;

public class PrincipalSapo extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalSapo frame = new PrincipalSapo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PrincipalSapo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblBolinha1 = new JLabel(".");
		lblBolinha1.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblBolinha1.setBounds(58, 64, 68, 74);
		contentPane.add(lblBolinha1);
		Sapo line = new Sapo();
		line.setBounds(100, 100, 100, 100);
		contentPane.add(line);
		
		
//		JLabel lblBolinha2 = new JLabel(".");
//		lblBolinha2.setFont(new Font("Tahoma", Font.BOLD, 70));
//		lblBolinha2.setBounds(313, 64, 68, 74);
//		contentPane.add(lblBolinha2);
//		JButton btnIniciar = new JButton("Iniciar");
//		btnIniciar.setBounds(0, 0, 89, 23);
//		contentPane.add(btnIniciar);
//		BolinhaController bolinhaController = new BolinhaController(
//				lblBolinha1, lblBolinha2, btnIniciar);
//		btnIniciar.addActionListener(bolinhaController);
	}
}