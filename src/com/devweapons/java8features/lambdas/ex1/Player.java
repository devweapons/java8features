package com.devweapons.java8features.lambdas.ex1;

public class Player {

	private int number;
	private String nom;
	private String prenom;
	private String mail;
	private String team;
	
	public Player(int number,String team) {
		this.number = number;
		this.team = team;
	}
	public Player(int number, String nom, String prenom, String mail, String team) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.number = number;
		this.team = team;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
