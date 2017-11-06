package com.example.jdbcdemo.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.jdbcdemo.domain.Kawa;

public class KawaManagerTest {
	
	
	KawaManagerJDBC kawaManager = new KawaManagerJDBC();
	
	private final static String NAZWA_1 = "JACOBS";
	private final static double CENA_1 = 14.23;
	private final static int STAN_1 = 123;
	
	private final static String NAZWA_2 = "McAfe";
	private final static double CENA_2 = 13.56;
	private final static int STAN_2 = 33;
	
	private final static String NAZWA_3 = "Woseba";
	private final static double CENA_3 = 15.78;
	private final static int STAN_3 = 66;
	
	private final static String NAZWA_4 = "Lavazza";
	private final static double CENA_4 = 21.76;
	private final static int STAN_4 = 77;
	
	@Test
	public void checkConnection(){
		assertNotNull(kawaManager.getConnection());
	}
	
	//@Test
	public void checkAdding(){
		
		Kawa kawa = new Kawa(NAZWA_1, CENA_1, STAN_1);		
		kawaManager.clearKawas();
		assertEquals(1,kawaManager.addKawa(kawa));
		
		List<Kawa> kawas = kawaManager.getAllKawas();
		Kawa kawaRetrieved = kawas.get(0);
		double epsilon = 1;
		assertEquals(NAZWA_1, kawaRetrieved.getNazwa());
		assertEquals(CENA_1, kawaRetrieved.getCena(), epsilon);
		assertEquals(STAN_1, kawaRetrieved.getStan());
		
	}
	@Test
	public void checkAddAll(){
		kawaManager.clearKawas();
		
		Kawa kawa1 = new Kawa(NAZWA_1, CENA_1, STAN_1);	
		Kawa kawa2 = new Kawa(NAZWA_2, CENA_2, STAN_2);
		Kawa kawa3 = new Kawa(NAZWA_3, CENA_3, STAN_3);
		Kawa kawa4 = new Kawa(NAZWA_4, CENA_4, STAN_4);
		
		List<Kawa> kawas = new ArrayList<>();
		kawas.add(kawa1);
		kawas.add(kawa2);
		kawas.add(kawa3);
		kawas.add(kawa4);
		
		kawaManager.addAllKawas(kawas);
		int size = kawaManager.getAllKawas().size();
		System.out.println(kawaManager.getAllKawas().get(2).getNazwa());
		assertThat(size, either(is(4)).or(is(0)));
	}

}