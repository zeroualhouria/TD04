package com.enreprise.exception;

public class EquipCompleteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EquipCompleteException(int capacite) {
        super("équipe complète (capacité : " + capacite + ")");
    }
}
