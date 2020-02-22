package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class CadastroAtendimento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAtendimento frame = new CadastroAtendimento();
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
	public CadastroAtendimento() {
		setTitle("Atendimento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeAtendimento = new JLabel("Cadastro Ficha de Atendimento");
		lblCadastroDeAtendimento.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastroDeAtendimento.setBounds(272, 39, 292, 31);
		contentPane.add(lblCadastroDeAtendimento);
		
		JLabel lblNewLabel = new JLabel("Paciente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(111, 116, 57, 19);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(204, 115, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 146, 164, 20);
		contentPane.add(textField_1);
		
		JLabel lblData = new JLabel("Data da Ficha\r\n");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setBounds(88, 146, 81, 19);
		contentPane.add(lblData);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 174, 81, 20);
		contentPane.add(textField_2);
		
		JLabel lblPreco = new JLabel("Preco");
		lblPreco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreco.setBounds(127, 175, 40, 19);
		contentPane.add(lblPreco);
		
		JLabel lblQuantidadeDeAtendimentos = new JLabel("Quantidade de Atendimentos");
		lblQuantidadeDeAtendimentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidadeDeAtendimentos.setBounds(10, 209, 169, 19);
		contentPane.add(lblQuantidadeDeAtendimentos);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(205, 208, 81, 20);
		contentPane.add(textField_3);
		
		JLabel lblDiagnostico = new JLabel("Diagnostico");
		lblDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiagnostico.setBounds(88, 303, 81, 19);
		contentPane.add(lblDiagnostico);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(205, 307, 202, 58);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JLabel lblCusto = new JLabel("Custo");
		lblCusto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCusto.setBounds(129, 257, 40, 19);
		contentPane.add(lblCusto);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(205, 256, 81, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(127, 384, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(280, 384, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
