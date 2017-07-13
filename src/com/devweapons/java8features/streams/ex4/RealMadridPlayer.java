package com.devweapons.java8features.streams.ex4;

public class RealMadridPlayer {

	private int number;
	private String nom;
	private String prenom;
    private int prime;
	
	public RealMadridPlayer() {};
    public RealMadridPlayer(int number,String team) {
		this.number = number;
	}
	public RealMadridPlayer(int number, String nom, String prenom, String mail, String team) {
		this.nom = nom;
		this.prenom = prenom;
		this.number = number;
		this.prime = prime;
	}

	public int getPrime() {
		return prime;
	}
	public void setPrime(int prime) {
		this.prime = prime;
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		number = number;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}
