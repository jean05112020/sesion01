package com.mitocode.ejercicio1;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// Imprimir mensajes
		System.out.println("Bienvenido al curso 2021");
		
		// Capturar valores de la consola
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es tú nombre?");
		
		String nombre = sc.nextLine();
		System.out.println("Bienvenido "+ nombre);
		
		sc.close();
		
		
	}
}
