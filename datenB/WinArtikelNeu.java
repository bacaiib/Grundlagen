package datenB;

import cc.Check;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinArtikelNeu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNr;
	JTextField tfNr;
	JLabel lblBezeichnung;
	JTextField tfBezeichnung;
	JLabel lblPreis;
	JTextField tfPreis;
	JButton btnSpeichern;

	

	/**
	 * Create the frame.
	 */
	public WinArtikelNeu() {
		setTitle("Neuer Artikel");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Nur dieses Sub-Window schließen
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNr = new JLabel("Nr");
		lblNr.setBounds(10, 28, 46, 14);
		contentPane.add(lblNr);
		
		tfNr = new JTextField();
		tfNr.setBounds(96, 25, 46, 20);
		contentPane.add(tfNr);
		tfNr.setColumns(10);
		
		lblBezeichnung = new JLabel("Bezeichnung");
		lblBezeichnung.setBounds(10, 67, 71, 14);
		contentPane.add(lblBezeichnung);
		
		tfBezeichnung = new JTextField();
		tfBezeichnung.setBounds(96, 64, 177, 20);
		contentPane.add(tfBezeichnung);
		tfBezeichnung.setColumns(10);
		
		lblPreis = new JLabel("Preis");
		lblPreis.setBounds(10, 108, 71, 14);
		contentPane.add(lblPreis);
		
		tfPreis = new JTextField();
		tfPreis.setBounds(96, 105, 94, 20);
		contentPane.add(tfPreis);
		tfPreis.setColumns(10);
		
		btnSpeichern = new JButton("SPEICHERN");
		btnSpeichern.addActionListener(this);
		btnSpeichern.setBounds(96, 146, 130, 23);
		contentPane.add(btnSpeichern);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSpeichern) {
			do_btnSpeichern_actionPerformed(e);
		}
	}
	protected void do_btnSpeichern_actionPerformed(ActionEvent e) {
		if (!Check.isInteger(tfNr.getText())){
			JOptionPane.showMessageDialog(this, "Ungültige Artikelnummer");
			return;
		}
		if (!Check.isName(tfBezeichnung.getText())){
			JOptionPane.showMessageDialog(this, "Ungültige Bezeichnung");
			return;
		}
		if (!Check.isDouble(tfPreis.getText())){
			JOptionPane.showMessageDialog(this, "Ungültiger Preis");
			return;
		}

		Artikel artikel = new Artikel();
		artikel.setNr( Integer.parseInt( tfNr.getText() ) );
		artikel.setBezeichnung( tfBezeichnung.getText() );
		artikel.setPreis( Double.parseDouble( tfPreis.getText().replace(",", ".") ) );
		
		if (Datenbank.artikelSpeichern(artikel)){
			JOptionPane.showMessageDialog(this, "Artikel gespeichert");
			tfNr.setText("");
			tfBezeichnung.setText("");
			tfPreis.setText("");
		} else  {
			JOptionPane.showMessageDialog(this, "Fehler");
		}
	}
}
