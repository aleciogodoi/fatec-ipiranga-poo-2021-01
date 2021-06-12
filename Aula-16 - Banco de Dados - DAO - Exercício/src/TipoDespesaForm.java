import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TipoDespesaForm {

	private JFrame frmTiposDeDespesa;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipoDespesaForm window = new TipoDespesaForm();
					window.frmTiposDeDespesa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TipoDespesaForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTiposDeDespesa = new JFrame();
		frmTiposDeDespesa.setTitle("Tipos de Despesa");
		frmTiposDeDespesa.getContentPane().setBackground(Color.GRAY);
		frmTiposDeDespesa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Tipo");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(31, 64, 46, 14);
		frmTiposDeDespesa.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 61, 86, 20);
		frmTiposDeDespesa.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setBounds(31, 111, 69, 14);
		frmTiposDeDespesa.getContentPane().add(lblDescrio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 108, 362, 20);
		frmTiposDeDespesa.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(436, 196, 89, 23);
		frmTiposDeDespesa.getContentPane().add(btnNewButton);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoDespesaDAO.insert(new TipoDespesa(textField_1.getText()));
			}
		});
		btnOk.setBounds(555, 196, 89, 23);
		frmTiposDeDespesa.getContentPane().add(btnOk);
		frmTiposDeDespesa.setBounds(100, 100, 686, 286);
		frmTiposDeDespesa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
