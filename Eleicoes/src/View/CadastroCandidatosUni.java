package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CadastroCandidatosUni extends JInternalFrame {
	private JTextField textPartido;
	private JTextField textParido;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCandidatosUni frame = new CadastroCandidatosUni();
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
	public CadastroCandidatosUni() {
		setTitle("Cadastro de Candidato");
		setBounds(100, 100, 415, 233);
		
		JPanel jpCadastroCandidato = new JPanel();
		jpCadastroCandidato.setBorder(new TitledBorder(null, "Candidato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCancela = new JButton("Cancelar");
		
		JButton btnSalvar = new JButton("Salvar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSalvar)
							.addGap(4)
							.addComponent(btnCancela))
						.addComponent(jpCadastroCandidato, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpCadastroCandidato, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancela))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		
		JLabel lblNome = new JLabel("Nome:");
		
		textPartido = new JTextField();
		textPartido.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido:");
		
		textParido = new JTextField();
		textParido.setColumns(10);
		
		JLabel lblFichalimpa = new JLabel("Ficha Limpa:");
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_jpCadastroCandidato = new GroupLayout(jpCadastroCandidato);
		gl_jpCadastroCandidato.setHorizontalGroup(
			gl_jpCadastroCandidato.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroCandidato.createSequentialGroup()
					.addGroup(gl_jpCadastroCandidato.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPartido, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFichalimpa, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_jpCadastroCandidato.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textParido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPartido, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_jpCadastroCandidato.setVerticalGroup(
			gl_jpCadastroCandidato.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroCandidato.createSequentialGroup()
					.addGroup(gl_jpCadastroCandidato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_jpCadastroCandidato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPartido)
						.addComponent(textParido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_jpCadastroCandidato.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFichalimpa)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		jpCadastroCandidato.setLayout(gl_jpCadastroCandidato);
		getContentPane().setLayout(groupLayout);

	}
}
