package com.mitocode.ejerecicio9.collecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("MAGENTA");
		lista.add("ROJO");
		lista.add("BLANCO");
		lista.add("AZUL");
		lista.add("CYAN");
		System.out.println("\nColores");
		for (String color : lista) {
			System.out.print(color + " ");
		}
		
		ArrayList<String> listaEliminar = new ArrayList<>();
		listaEliminar.add("ROJO");
		listaEliminar.add("BLANCO");
		listaEliminar.add("AZUL");
		
		
		System.out.println("\nColores a eliminar");
		for (String color : listaEliminar) {
			System.out.print(color + " ");
		}
		
		eliminar(lista, listaEliminar);
		System.out.println("\n");
		for (String color : lista) {
			System.out.println(color);
		}
	}
	
	public static void eliminar(Collection<String> lista1, Collection<String> lista2) {
		Iterator<String> iterator = lista1.iterator();
		while(iterator.hasNext()) {
			if(lista2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
	
	

}
