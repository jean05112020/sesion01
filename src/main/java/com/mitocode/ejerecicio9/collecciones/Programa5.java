package com.mitocode.ejerecicio9.collecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programa5 {

	private static int ELEMENTOS = 50000;

	public static void main(String[] args) {
		/* diferencias arrayList vs LinkedList */
		// creamos dos listas
		List<String> arrayList = new ArrayList<>();

		List<String> linkedlist = new LinkedList<>();

		// Agregar
		/*
		 * System.out.println(" *********** Agregar ***********"); long start =
		 * System.currentTimeMillis();
		 * 
		 * // ArrayList for (int i = 0; i < ELEMENTOS; i++) {
		 * arrayList.add("El elemento # " + i); }
		 * 
		 * long tiempo = System.currentTimeMillis() - start;
		 * System.out.println("ArrayList: " + tiempo + "ms");
		 * 
		 * // LinkedList
		 * 
		 * // Siempre usar el linkedList para agregar y eliminar, ya que es más rapido
		 * // start = System.currentTimeMillis(); for (int i = 0; i < ELEMENTOS; i++) {
		 * linkedlist.add("El elemento # " + i); }
		 * 
		 * tiempo = System.currentTimeMillis() - start;
		 * System.out.println("\nlinkedList: " + tiempo + "ms");
		 */

//		// Obtener
//		System.out.println(" *********** Obtener ***********");
//		long start = System.currentTimeMillis();
//
//		// ArrayList
//		for (int i = 0; i < ELEMENTOS; i++) {
//			arrayList.get(i);
//		}
//
//		long tiempo = System.currentTimeMillis() - start;
//		System.out.println("ArrayList: " + tiempo + "ms");
//
//		// LinkedList
//
//		/* Siempre usar el linkedList para agregar y eliminar, ya que es más rapido */
//		start = System.currentTimeMillis();
//		for (int i = 0; i < ELEMENTOS; i++) {
//			linkedlist.get(i);
//		}
//
//		tiempo = System.currentTimeMillis() - start;
//		System.out.println("\nlinkedList: " + tiempo + "ms");
//

////		// Modificar
//		System.out.println(" *********** modificar ***********");
//		long start = System.currentTimeMillis();
//
//		// ArrayList
//		for (int i = 0; i < ELEMENTOS; i++) {
//			arrayList.set(i,"elemento" + i);
//		}
//
//		long tiempo = System.currentTimeMillis() - start;
//		System.out.println("ArrayList: " + tiempo + "ms");
//
//		// LinkedList
//
//		/* Siempre usar el linkedList para agregar y eliminar, ya que es más rapido */
//		start = System.currentTimeMillis();
//		for (int i = 0; i < ELEMENTOS; i++) {
//			linkedlist.set(i, "elemento" + i);
//		}
//
//		tiempo = System.currentTimeMillis() - start;
//		System.out.println("\nlinkedList: " + tiempo + "ms");

		// Eliminar
		System.out.println(" *********** Eliminar ***********");
		long start = System.currentTimeMillis();

		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.remove(0);
		}

		long tiempo = System.currentTimeMillis() - start;
		System.out.println("ArrayList: " + tiempo + "ms");

		// LinkedList

		start = System.currentTimeMillis();
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedlist.remove(0);
		}

		tiempo = System.currentTimeMillis() - start;
		System.out.println("\nlinkedList: " + tiempo + "ms");
		
		
	}
}
