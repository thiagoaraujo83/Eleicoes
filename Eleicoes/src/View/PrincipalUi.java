package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUi frame = new PrincipalUi();
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
	public PrincipalUi() {
		setTitle("Pesquisa Eleitoral");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 558);
		
		JMenuBar jdPrincipal = new JMenuBar();
		setJMenuBar(jdPrincipal);
		
		JMenu jmCandidato = new JMenu("Candidato");
		jdPrincipal.add(jmCandidato);
		
		JMenuItem jmiIdCandidato = new JMenuItem("idCandidato");
		jmiIdCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jmCandidato.add(jmiIdCandidato);
		
		JMenuItem jmiNome = new JMenuItem("Nome");
		jmiNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatosUni cadNome = new CadastroCandidatosUni();
				cadNome.setVisible(true);
				contentPane.add(cadNome,0);
														
			}
		});
		jmCandidato.add(jmiNome);
		
		JMenuItem jmiPartido = new JMenuItem("Partido");
		jmCandidato.add(jmiPartido);
		
		JMenuItem Fichalima = new JMenuItem("Ficha Limpa");
		jmCandidato.add(Fichalima);
		
		JMenu jmPartido = new JMenu("Partido");
		jdPrincipal.add(jmPartido);
		
		JMenuItem jmiid = new JMenuItem("Id");
		jmPartido.add(jmiid);
		
		JMenuItem jminomePartido = new JMenuItem("Nome do Partido");
		jmPartido.add(jminomePartido);
		
		JMenu jmPesquisa = new JMenu("Pesquisa");
		jdPrincipal.add(jmPesquisa);
		
		JMenuItem jmiidPartido = new JMenuItem("Id ");
		jmPesquisa.add(jmiidPartido);
		
		JMenuItem jmidatapesquisa = new JMenuItem("Data");
		jmPesquisa.add(jmidatapesquisa);
		
		JMenuItem jmicidadepesquisa = new JMenuItem("Cidade");
		jmPesquisa.add(jmicidadepesquisa);
		
		JMenuItem jmiIdadeMedia = new JMenuItem("Idade");
		jmPesquisa.add(jmiIdadeMedia);
		
		JMenuItem jmiTipoPesquisa = new JMenuItem("Tipo de Pesquisa");
		jmPesquisa.add(jmiTipoPesquisa);
		
		JMenuItem jmiFormato_Pesquisa = new JMenuItem("Forma de Pesquisa");
		jmPesquisa.add(jmiFormato_Pesquisa);
		
		JMenu jmCandidatoXPesquisa = new JMenu("CandidatoXPesquisa");
		jdPrincipal.add(jmCandidatoXPesquisa);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Id");
		jmCandidatoXPesquisa.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Votos");
		jmCandidatoXPesquisa.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
