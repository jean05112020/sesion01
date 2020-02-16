package com.mitocode.ejercicio2.staticos;

public abstract class ConvertidorMoneda {
	
	private static double COMISION = 0.06;
	
	
	public static double dolarToNuevoSol(double monto, double precioDolar) {
//		double resultado = monto * precioDolar * (1.0 + comision);
		return monto * precioDolar * (1.0 + COMISION);
	}

}
