package com.devweapons.java8features.collectors.ex2;

public class Player {

	private int number;
	private String nom;
	private String prenom;
	private String mail;
	private String team;
	private int age;
	
	public Player(int number,String team) {
		this.number = number;
		this.team = team;
	}
	public Player(int number, String nom, String prenom, String mail, String team, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
		team = team;
	}
}
