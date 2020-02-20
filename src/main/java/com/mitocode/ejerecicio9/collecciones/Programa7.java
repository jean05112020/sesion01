package com.mitocode.ejerecicio9.collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa7 {

	public static void main(String[] args) {
		Character[] letras = {'P','C','M'};
		List<Character> lista = Arrays.asList(letras);
		
		System.out.println("Lista: ");
		imprimir(lista);
		
		
		//invierte lista de elementos
		Collections.reverse(lista);
		System.out.println("\nLista invertida: ");
		imprimir(lista);
		
		
		
		//copiar lista
		Character[] listaCopia = new Character[lista.size()];
		
		List<Character> copiaLista = Arrays.asList(listaCopia);
		
		Collections.copy(copiaLista, lista);
		System.out.println("\nLista copiada: ");
		
		imprimir(copiaLista);
		
		//fill
		Collections.fill(lista, 'R');
		System.out.println("lista llena de R");
		imprimir(lista);
		System.out.println();
		//uso max y min
		List<Integer> numeros = new ArrayList<>();
		numeros.add(-10);
		numeros.add(100);
		numeros.add(8);
		numeros.add(30);
		System.out.println("El valor maximo y minimo de la lista");
		System.out.println("Max " + Collections.max(numeros));
		System.out.println("\nMin " + Collections.min(numeros));
		
		//Unir lista
		
		List<Character> listaExtend = new ArrayList<>();
		listaExtend.add('A');
		listaExtend.add('B');
		listaExtend.add('C');
		
		Collections.addAll(listaExtend, letras);
		System.out.println("Lista extends: ");
		imprimir(listaExtend);
		
		
		
		
	}
	
	public static void imprimir(List<Character> lista) {
		for (Character letra : lista) {
			System.out.print(letra + " ");
		}
	}

}
