package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandidatoNomeUi extends JInternalFrame {
	private JTextField textData;
	private JTextField textCidade;
	private JTextField textidade;
	private JTextField textField;
	private JTextField textformatodapesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandidatoNomeUi frame = new CandidatoNomeUi();
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
	public CandidatoNomeUi() {
		setClosable(true);
		setTitle("Pesquisa");
		setBounds(100, 100, 537, 339);
		
		JPanel jpPesquisa = new JPanel();
		jpPesquisa.setBorder(new TitledBorder(null, "Pesquisa de Candidato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpPesquisa.setToolTipText("Pesquisa dos Candidatos");
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnsalvar = new JButton("Salvar");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(128)
							.addComponent(btnsalvar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jpPesquisa, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpPesquisa, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnsalvar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel jlData = new JLabel("Data:");
		jlData.setVerticalAlignment(SwingConstants.BOTTOM);
		
		textData = new JTextField();
		textData.setColumns(10);
		
		JLabel jlbCidade = new JLabel("Cidade");
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		
		JLabel jblIdade = new JLabel("Idade");
		
		textidade = new JTextField();
		textidade.setColumns(10);
		
		JLabel jblTipoPesquisa = new JLabel("Tipo de Pesquisa");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel jblformato_Pesquisa = new JLabel("Formato da Pesquisa");
		
		textformatodapesquisa = new JTextField();
		textformatodapesquisa.setColumns(10);
		GroupLayout gl_jpPesquisa = new GroupLayout(jpPesquisa);
		gl_jpPesquisa.setHorizontalGroup(
			gl_jpPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPesquisa.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpPesquisa.createSequentialGroup()
							.addComponent(jlData, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
							.addComponent(textData, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(205, Short.MAX_VALUE))
						.addGroup(gl_jpPesquisa.createSequentialGroup()
							.addComponent(jlbCidade, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
							.addComponent(textCidade, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
							.addGap(38))
						.addGroup(Alignment.TRAILING, gl_jpPesquisa.createSequentialGroup()
							.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.LEADING)
								.addComponent(jblIdade, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(jblTipoPesquisa, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addComponent(jblformato_Pesquisa))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
								.addComponent(textidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textformatodapesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		gl_jpPesquisa.setVerticalGroup(
			gl_jpPesquisa.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPesquisa.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlData)
						.addComponent(textData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlbCidade)
						.addComponent(textCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(jblIdade)
						.addComponent(textidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(jblTipoPesquisa)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_jpPesquisa.createParallelGroup(Alignment.BASELINE)
						.addComponent(textformatodapesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jblformato_Pesquisa))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		jpPesquisa.setLayout(gl_jpPesquisa);
		getContentPane().setLayout(groupLayout);

	}
}
