package com.mitocode.ejerecicio9.collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa6 {
	public static void main(String[] args) {
		String[] colores = {"negro","amarillo","verde","azul","violeta"};
		
		List<String> lista = Arrays.asList(colores);
		
		System.out.println(lista);
		
		
		//ascendente
		Collections.sort(lista);		
		System.out.println(lista);
		
		//descendente-opuesto
		Collections.sort(lista, Collections.reverseOrder());		
		System.out.println(lista);
	}
}
