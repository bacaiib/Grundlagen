package datenB;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WinArtikelAnzeigen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JScrollPane scrollPane;
	JTable table;

	
	public WinArtikelAnzeigen() {
		setTitle("Artikel Liste");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 581, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 545, 362);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		fillTable();
	}
	
	private void fillTable() {
		//ArrayList<Artikel> liste = Datenbank.getArtikelListe();
		//ArrayList<Artikel> liste = Datenbank.getArtikelListe();

		Vector<String> columnNames = new Vector<>();
		columnNames.add("Artikel-ID");
		columnNames.add("Name");
		columnNames.add("Preis");

		// Holen Sie sich die Liste der Artikel
		ArrayList<Artikel> artikelListe = Datenbank.getArtikelListe();
		Vector<Vector<String>> data = new Vector<>();

		for (Artikel artikel : artikelListe) {
			Vector<String> row = new Vector<>();
			row.add(String.valueOf(artikel.getNr()));
			row.add(artikel.getBezeichnung());
			row.add(String.format("%.2f", artikel.getPreis()));
			data.add(row);
		}

		// Setze das TableModel mit den Daten
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table.setModel(model);

		// 1 String-Vector für Spaltenüberschriften
		// 1 2dimensionalen String-Vector mit den ArtikelDaten
		
		
		
	}
}
