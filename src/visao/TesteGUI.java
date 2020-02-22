package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TesteGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String teste = "Alessandro";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteGUI frame = new TesteGUI();
					frame.setVisible(true);
					// Tentar alterar a variavel 'teste'dentro da tabela com essa janela!
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TesteGUI() {
		setTitle("Agendamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgendamento = new JLabel("Agendamento de Pacientes");
		lblAgendamento.setForeground(Color.DARK_GRAY);
		lblAgendamento.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAgendamento.setBounds(307, 29, 229, 33);
		contentPane.add(lblAgendamento);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(118, 85, 614, 298);
		contentPane.add(scrollPane);
		
		table = new JTable();
		// Metodo para interagir com o click do mouse na tabela
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			// ---------------------- Implementação Nova ----------------------------------------------
			// Abrir uma janela de marcar antendimento - FUNFANDO!!!
				try {
					Agendamento frame = new Agendamento();
					frame.setVisible(true);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			
			
			
			
			
			
				/*// ---------------------- Implementação Antiga ----------------------------------------------
				
				String teste = "Digite o nome do Paciente";
				String capturar = JOptionPane.showInputDialog(teste);
				System.out.println(capturar);*/
				//return  capturar;  // Ideal seria retorna a String
			}
		});
		
		table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" 07:00", "", "", "", "", "", ""},
				{" 08:00", teste, "", "", "", "", ""}, // Teste de inserir variaveis na tabela deu certo!
				{" 09:00", null, null, null, null, null, null},
				{" 10:00", null, null, null, null, null, null},
				{" 11:00", "", null, null, null, null, null},
				{" 12:00", null, null, null, null, null, null},
				{" 13:00", null, null, null, null, null, null},
				{" 14:00", null, null, null, null, null, null},
				{" 15:00", null, null, null, null, null, null},
				{" 16:00", null, null, null, null, null, null},
				{" 17:00", null, null, null, null, null, null},
				{" 18:00", null, null, null, null, null, null},
				{" 19:00", null, null, "", null, null, ""},
				{" 20:00", null, null, null, null, null, null},
				{" 21:00", null, null, null, null, null, null},
				{" 22:00", null, null, null, null, null, null},
			},
			new String[] {
				"Horario", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"
			}
		));
		scrollPane.setViewportView(table);
	}
}
