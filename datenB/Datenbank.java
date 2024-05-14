package datenB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Datenbank {

	public static boolean artikelSpeichern(Artikel artikel) {
		String conString = "jdbc:mysql://localhost:3306/artikel";
		String user = "root";
		String password = "";
		final String sqlString = "INSERT INTO artikel(nr, bezeichnung, preis) VALUES(?, ?, ?);";
		
		try(
			Connection con = DriverManager.getConnection(conString, user, password);
			PreparedStatement stat = con.prepareStatement(sqlString);
		){
			stat.setInt(1, artikel.getNr());
			stat.setString(2, artikel.getBezeichnung());
			stat.setDouble(3, artikel.getPreis());
			stat.execute();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<Artikel> getArtikelListe() {
		ArrayList<Artikel> liste = new ArrayList<Artikel>();
		
		String conString = "jdbc:mysql://localhost:3306/artikel";
		String user = "root";
		String password = "";
		String sqlString = "SELECT nr, bezeichnung, preis FROM artikel ORDER BY preis;";
		
		try(
			Connection con = DriverManager.getConnection(conString, user, password);
			Statement stat = con.createStatement();
		){
			ResultSet rs = stat.executeQuery(sqlString);
			while(rs.next()) {
				Artikel artikel = new Artikel();
				artikel.setNr( rs.getInt("nr") );
				artikel.setBezeichnung( rs.getString("bezeichnung") );
				artikel.setPreis( rs.getDouble("preis") );
				liste.add(artikel);
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return liste;
	}
	
}
