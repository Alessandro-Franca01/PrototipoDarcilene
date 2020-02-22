package visao;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Prototipo");
		setBounds(100, 100, 832, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Fisioterapia");
		label.setFont(new Font("Dialog", Font.BOLD, 95));
		label.setBounds(68, 76, 533, 122);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Candara", Font.PLAIN, 14));
		textField.setBounds(309, 268, 292, 29);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Usu\u00E1rio");
		label_1.setFont(new Font("Candara", Font.BOLD, 18));
		label_1.setBounds(200, 270, 60, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Digite seu nome de Usu\u00E1rio e Senha");
		label_2.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 14));
		label_2.setBounds(320, 386, 205, 18);
		contentPane.add(label_2);
		
		JLabel lblSenha = new JLabel();
		lblSenha.setText("Senha");
		lblSenha.setFont(new Font("Candara", Font.BOLD, 18));
		lblSenha.setBounds(200, 329, 60, 22);
		contentPane.add(lblSenha);
		
		JLabel label_3 = new JLabel();
		label_3.setIcon(new ImageIcon(Login.class.getResource("/images/female-user(128).png")));
		label_3.setBounds(640, 76, 128, 128);
		contentPane.add(label_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(309, 330, 292, 29);
		contentPane.add(passwordField);
	}
}
