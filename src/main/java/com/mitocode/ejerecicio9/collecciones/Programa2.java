package com.mitocode.ejerecicio9.collecciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.mitocode.ejercicio7.interfaces.CuentaAhorros;

public class Programa2 {

	public static void main(String[] args) {
		ArrayList<String> lista= new ArrayList<>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		System.out.println("Estructura for");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.println("Usando iterator");
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<CuentaAhorros> listaCuentas = new ArrayList<>();
		
		CuentaAhorros c1 = new CuentaAhorros();
		c1.setNumeroCuenta("10");
		c1.setTitular("Jean");
		c1.setSaldo(1000);
		
		CuentaAhorros c2 = new CuentaAhorros();
		c2.setNumeroCuenta("11");
		c2.setTitular("Pablo");
		c2.setSaldo(700);
		
		CuentaAhorros c3 = new CuentaAhorros();
		c3.setNumeroCuenta("12");
		c3.setTitular("Mirella");
		c3.setSaldo(1200);
		
		listaCuentas.add(c1);
		listaCuentas.add(c2);
		listaCuentas.add(c3);
		
		for (CuentaAhorros cuentaAhorros : listaCuentas) {
			System.out.println(cuentaAhorros);			
		}
		
		
		
	}

}
