package com.mitocode.ejercicio8.excepciones;

import java.io.FileInputStream;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis = new FileInputStream("src/main/resource/archivo.txt");
		int k;
		
		while((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		fis.close();
		
	}

}
