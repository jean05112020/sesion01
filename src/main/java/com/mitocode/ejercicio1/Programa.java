package com.mitocode.ejercicio1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Para capturar los valores de la consola
		Scanner sc = new Scanner(System.in);
		
		// Creando una instancia de Cuenta
		Cuenta cuenta;
		
		System.out.println("Ingrese número de cuenta: ");
		String numeroCuenta = sc.nextLine();
		
		System.out.println("Ingrese el titular de la cuenta: ");
		String titular = sc.nextLine();
		
		System.out.println("Desea realizar un depósito inicial (y/n)? ");
		char respuesta = sc.nextLine().charAt(0);
		
		if (respuesta == 'y') {
			System.out.println("Ingrese el valor de depósito inicial: ");
			double monto = sc.nextDouble();
			
			cuenta = new Cuenta(numeroCuenta, titular, monto);
		} else {
			
			cuenta = new Cuenta(numeroCuenta, titular);
		}
		
		System.out.println("Datos de la cuenta: ");
		System.out.println(cuenta);
		
		// Deposito
		System.out.println();
		System.out.println("Ingrese el valor de depósito: ");
		double monto = sc.nextDouble();
		cuenta.deposito(monto);
		System.out.println("Datos de la cuenta actualizados");
		System.out.println(cuenta);
		
		// Retiro
		System.out.println();
		System.out.println("Ingrese el valor a retirar: ");
		double montoRetiro = sc.nextDouble();
		cuenta.retiro(montoRetiro);
		System.out.println("Datos de la cuenta actualizados");
		System.out.println(cuenta);
		
		
		sc.close();
		
	}
}
