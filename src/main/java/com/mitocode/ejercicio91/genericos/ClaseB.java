package com.mitocode.ejercicio91.genericos;

public class ClaseB<T,K,V,E> {
	private K objetok;
	private T objetoT;
	private V objetoV;
	private E objetoE;
	
	
	
	public ClaseB() {
		super();
	}

	public ClaseB(K objetok, T objetoT, V objetoV, E objetoE) {
		super();
		this.objetok = objetok;
		this.objetoT = objetoT;
		this.objetoV = objetoV;
		this.objetoE = objetoE;
	}

	public K getObjetok() {
		return objetok;
	}

	public void setObjetok(K objetok) {
		this.objetok = objetok;
	}

	public T getObjetoT() {
		return objetoT;
	}

	public void setObjetoT(T objetoT) {
		this.objetoT = objetoT;
	}

	public V getObjetoV() {
		return objetoV;
	}

	public void setObjetoV(V objetoV) {
		this.objetoV = objetoV;
	}

	public E getObjetoE() {
		return objetoE;
	}

	public void setObjetoE(E objetoE) {
		this.objetoE = objetoE;
	}
	
	public void mostrarTipo() {
		System.out.println("K es un tipo : " + objetok.getClass());
		System.out.println("T es un tipo : " + objetoT.getClass());
		System.out.println("V es un tipo : " + objetoV.getClass());
		System.out.println("E es un tipo : " + objetoE.getClass());
	}
	
}
