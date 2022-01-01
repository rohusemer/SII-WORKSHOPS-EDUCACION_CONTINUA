package test;

import static org.junit.Assert.*;
import ec.edu.espol.workshops.*;

import org.junit.Test;

import ec.edu.espol.workshops.Carlnsurance;

public class Structural {

	@Test
	public void test() {
		
		
		// Statement Coverage Specialist
		Carlnsurance prueba1 = new Carlnsurance (25,"M","N");// licencia si
		System.out.println(prueba1.calcularInsurance("Valido"));
		
		
		//Branch Coverage Specialist
		Carlnsurance prueba2 = new Carlnsurance (17,"F","Y");// licencia no
		System.out.println(prueba2.calcularInsurance("No Valido"));
		
		
		Carlnsurance prueba3 = new Carlnsurance (26,"F","Y");// licencia si
		System.out.println(prueba3.calcularInsurance("Valido"));
		
		
		Carlnsurance prueba4 = new Carlnsurance (46,"F","Y");// licencia si
		System.out.println(prueba4.calcularInsurance("Valido"));
		
		
		//Path Coverage specialist   
		
		Carlnsurance prueba5 = new Carlnsurance (46,"M","Y");// licencia si
		System.out.println(prueba5.calcularInsurance("Valido"));
		
		
		Carlnsurance prueba6 = new Carlnsurance (46,"M","Y");// licencia no
		System.out.println(prueba6.calcularInsurance("No Valido"));
		
		
		// extra cases
		
		Carlnsurance prueba7 = new Carlnsurance (50,"M","N");// licencia si
		System.out.println(prueba7.calcularInsurance("Valido"));
		
		Carlnsurance prueba9 = new Carlnsurance (50,"F","N");// licencia si
		System.out.println(prueba9.calcularInsurance("Valido"));
		
		Carlnsurance prueba10 = new Carlnsurance (81,"M","N");// licencia si
		System.out.println(prueba10.calcularInsurance("Valido"));
		
		Carlnsurance prueba11 = new Carlnsurance (23,"M","N");// licencia si
		System.out.println(prueba7.calcularInsurance("Valido"));
		
		
	}

}
