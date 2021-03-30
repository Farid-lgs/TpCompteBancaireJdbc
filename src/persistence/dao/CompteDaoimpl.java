package persistence.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import persistence.entities.Compte;

public class CompteDaoimpl implements CompteDao{
	
	Statement stmt;
	
	public CompteDaoimpl() {
		try {
			stmt = JdbcConnexion.connecter().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Compte findByNum(int numCompte) {
		Compte c = new Compte();
		try {
			ResultSet result = stmt.executeQuery("select * from compte where numcompte="+numCompte);
			result.next();
			c.setNumCompte(numCompte);
			c.setProprietaire(result.getString("proprietaire"));
			c.setSolde(result.getDouble("solde"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public String findPropByNum(int numCompte) {
		String prop = "";
		try {
			ResultSet result = stmt.executeQuery("select * from compte where numcompte="+numCompte);
			result.next();
			prop = result.getString("proprietaire");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prop;
	}

	@Override
	public double findSoldeByNum(int numCompte) {
		double solde = 0.0;
		try {
			ResultSet result = stmt.executeQuery("select * from compte where numcompte="+numCompte);
			result.next();
			solde = result.getDouble("solde");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return solde;
	}	

}
