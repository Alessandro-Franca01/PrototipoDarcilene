package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Agendamento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agendamento frame = new Agendamento();
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
	public Agendamento() {
		setTitle("Marcar Atendimento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteOsDados = new JLabel("Digite os dados do Atendimento");
		lblDigiteOsDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteOsDados.setFont(new Font("Verdana", Font.BOLD, 12));
		lblDigiteOsDados.setBounds(115, 22, 234, 22);
		contentPane.add(lblDigiteOsDados);
		
		JLabel lblNomePaciente = new JLabel("Nome do Paciente");
		lblNomePaciente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomePaciente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomePaciente.setBounds(22, 74, 119, 14);
		contentPane.add(lblNomePaciente);
		
		textField = new JTextField();
		textField.setBounds(199, 72, 227, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblData.setBounds(22, 113, 119, 14);
		contentPane.add(lblData);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(199, 111, 227, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(115, 179, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(276, 179, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
