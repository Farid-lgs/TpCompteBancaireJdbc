package persistence.dao;

import java.util.List;

import persistence.entities.Compte;

public interface CompteDao {
	
	Compte findByNum(int numCompte);
	String findPropByNum(int numCompte);
	double findSoldeByNum(int numCompte);
	
}