package com.tests.java8.T02Interfaces;

@FunctionalInterface
public interface ComAnnotationFunctionalInterface {

	void unicoMetodo();
	
	// Se esse segundo m�todo for descomentado, ocorre um erro.
	// Isso ocorre porque ao utilizar @FunctionalInterface a interface deve possuir um �nico m�todo.
	// void outroMetodo();
}