package com.mitocode.ejerecicio9.collecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programa8 {

	public static void main(String[] args) {
		Map<String,String> paises = new HashMap<>();
		
		paises.put("PE", "Perú");
		paises.put("CO", "COLOMBIA");
		paises.put("CH", "CHILE");
		paises.put("EC", "ECUADOR");
		
		//validar si es vacio 
		System.out.println("Map vacio: " + paises.isEmpty());
		//obtener los valores		
		Collection<String> valores = paises.values();		
		System.out.println("Valores:"  + valores);
		
		//obtener keys
		Set<String> claves = paises.keySet();
		System.out.println("Claves : " + claves);
		
		//obtener un valor
		
		System.out.println("Valor: " + paises.get("PE"));
		
		//eliminar un elemento
		paises.remove("CO");
		
		System.out.println("Map sin colombia" + paises.values() );
		
		//eliminar todo
		
		paises.clear();
		System.out.println("Map vacio" + paises.values() );

	}

}
