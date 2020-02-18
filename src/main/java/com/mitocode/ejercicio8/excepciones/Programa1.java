package com.mitocode.ejercicio8.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numerador: ");
		int numerador = sc.nextInt();
		
		System.out.print("Ingrese un denominador: ");
		int denominador = sc.nextInt();
		/* forma 1
		try {
			
			int resultado = numerador/denominador;
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0 es un denominador invalido");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Denominador de formato incorrecto");
		}finally {
			System.out.println("finally siempre");
		}*/
		
		
		//forma 2
		//int resultado = dividir(numerador, denominador);
		//System.out.println("El resultado es: " + resultado);
		
		//forma 3 usando throw
		
		try {
			int resultado = dividir2(numerador, denominador);
			System.out.println("El resultado es: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Denominador de formato incorrecto");
		}
		
		
		sc.close();
	}
	
	public static int dividir(int numerador,int denominador) {
		try {
			return numerador/denominador;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0 es un denominador invalido");
			return -1;
		}finally {
			// TODO: handle exception
			System.out.println("finally siempre");			
		}
	
	}
	
	public static int dividir2(int numerador,int denominador) throws ArithmeticException{
		return numerador/denominador;
	
	}
}
