package com.mitocode.ejercicio2.staticos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es el precio del dólar?");
		double precioDolar = sc.nextDouble();
		
		System.out.println("¿Cuántos dolares se comprarán?");
		double monto = sc.nextDouble();
		
//		ConvertidorMoneda convertidor = new ConvertidorMoneda();
		
		double resultado = ConvertidorMoneda.dolarToNuevoSol(monto, precioDolar);
		System.out.println("Monto a pagar en soles: " + resultado);
		
		sc.close();
		
	}
}
