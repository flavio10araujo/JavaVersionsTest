package com.tests.java8.T01Lambas;

/**
 * Java Lambda Behaviour Parameter.
 * Changing the behavior of a method through its parameters is called behavior parameterization.
 *
 */
public class EMain {
	
	public static void main(String[] argv) {
		engine((x, y)-> x + y);
		engine((x, y)-> x * y);
		engine((x, y)-> x / y);
		engine((x, y)-> x % y);
	}
	
	// Baseado no tipo de lambda que � passado por par�metro, o comportamento desse m�todo ir� mudar.
	private static void engine(Calculator calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface Calculator{
	int calculate(int x, int y);
}