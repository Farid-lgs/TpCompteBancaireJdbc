package persistence.entities;

import persistence.dao.CompteDaoimpl;

public class Compte {
	
	private int numCompte;
	private double solde;
	private String proprietaire;
	
	static CompteDaoimpl comptedao= new CompteDaoimpl();
	
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	
	public double getSolde() {
		double sol = comptedao.findSoldeByNum(numCompte);
		setSolde(sol);
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public String getProprietaire() {
		String prop = comptedao.findPropByNum(numCompte);
		setProprietaire(prop);
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	} 
	
	
}
