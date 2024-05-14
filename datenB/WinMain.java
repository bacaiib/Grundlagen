package datenB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinMain extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JMenuBar menuBar;
	JMenu mnArtikel;
	JMenuItem mntmArtikelNeu;
	JMenuItem mntmArtikelAnzeigen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinMain frame = new WinMain();
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
	public WinMain() {
		setTitle("Artikel-Verwaltung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArtikel = new JMenu("Artikel");
		menuBar.add(mnArtikel);
		
		mntmArtikelNeu = new JMenuItem("Neu");
		mntmArtikelNeu.addActionListener(this);
		mnArtikel.add(mntmArtikelNeu);
		
		mntmArtikelAnzeigen = new JMenuItem("Anzeigen");
		mntmArtikelAnzeigen.addActionListener(this);
		mnArtikel.add(mntmArtikelAnzeigen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmArtikelAnzeigen) {
			do_mntmArtikelAnzeigen_actionPerformed(e);
		}
		if (e.getSource() == mntmArtikelNeu) {
			do_mntmArtikelNeu_actionPerformed(e);
		}
	}
	protected void do_mntmArtikelNeu_actionPerformed(ActionEvent e) {
		new WinArtikelNeu().setVisible(true);
	}
	protected void do_mntmArtikelAnzeigen_actionPerformed(ActionEvent e) {
		new WinArtikelAnzeigen().setVisible(true);
	}
}
