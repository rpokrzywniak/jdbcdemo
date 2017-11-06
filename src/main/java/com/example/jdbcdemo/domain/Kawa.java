package com.example.jdbcdemo.domain;

public class Kawa {
	private long id;
	private String nazwa;
	private double cena;
	private int stan;
	
	public Kawa(){
	}
	public Kawa(String nazwa, double cena, int stan){
		super();
		this.nazwa=nazwa;
		this.cena=cena;
		this.stan=stan;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public int getStan() {
		return stan;
	}
	public void setStan(int stan) {
		this.stan = stan;
	}
	
}
