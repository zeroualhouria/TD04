package com.enreprise.exception;

public class MontantInvalideException extends Exception {

	private static final long serialVersionUID = 1L;
	private double valeur;

    public MontantInvalideException(String champ, double valeur) {
        super(champ + " invalide : " + valeur);
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }
}
