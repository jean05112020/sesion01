package com.mitocode.ejerecicio9.collecciones;

import java.util.Arrays;
import java.util.LinkedList;

public class Programa4 {
	public static void main(String[] args) {
		String[] colores = {"negro","azul","amarillo"};
		
		LinkedList<String> lista = new LinkedList<>(Arrays.asList(colores));
		
		//lista.add("negro");
		//lista.add("azul");
		//lista.add("amarillo");
		for (String color : lista) {
			System.out.println( color + "");
		}
		
		//a�adir en posicion
		lista.add(2, "verde");	
		System.out.println("\nSe a�adio color verde en la posicion 2");
		for (String color : lista) {
			System.out.println(color + "");
		}
		
		
		//a�adir al inicio
		lista.addFirst("Rosa");
		System.out.println("\nSe a�adio color rosa  al inicio");
		for (String color : lista) {
			System.out.println(color + "");
		}
		
		//a�adir al ultimo
		lista.addLast("cyan");
		System.out.println("\nSe a�adio color cyan al ultimo");

	}
}
