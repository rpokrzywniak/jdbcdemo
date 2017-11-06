package com.example.jdbcdemo.service;

import java.util.List;

import com.example.jdbcdemo.domain.Kawa;

public interface KawaManager {
	
	public int addKawa(Kawa kawa);
	public List<Kawa> getAllKawas();
	public void addAllKawas(List<Kawa> kawas);

}
