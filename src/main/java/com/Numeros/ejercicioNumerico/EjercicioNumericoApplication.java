package com.Numeros.ejercicioNumerico;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioNumericoApplication {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero.");
		int numeroIf = leer.nextInt();
		
		if(numeroIf > 0) {
			System.out.println("El número es positivo");
		}else if(numeroIf < 0) {
			System.out.println("El número es negativo");
		}else {
			System.out.println("El número es cero");
		}
		
		System.out.println("Siguiente operación...");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero.");
		int numeroWhile = sc.nextInt();
		
		while(numeroWhile < 3) {
			System.out.println("El valor es: " + numeroWhile);
			numeroWhile++;
		}
		
		System.out.println("Siguiente operación...");
		
		Scanner leer2 = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero.");
		int numeroDoWhile = leer2.nextInt();
		
		do {
			System.out.println("El valor es: " + numeroDoWhile);
			numeroDoWhile++;
			break;
		}while(numeroDoWhile < 3);
		
		System.out.println("Siguiente operación...");
		
		int numeroFor = 0;
		
		for (int i = 0; numeroFor < 3 ;i++) {
			System.out.println("El valor es: " + numeroFor);
			numeroFor++;
		}
		
		System.out.println("Siguiente operación...");
		
		Scanner leer3 = new Scanner(System.in);
		
		System.out.println("Ingrese una estación.");
		String estacion = leer3.next();
		
		switch(estacion) {
			case "verano":
				System.out.println("Es verano");
				break;
			case "otoño":
				System.out.println("Es otoño");
				break;
			case "invierno":
				System.out.println("Es invierno");
				break;
			case "primavera":
				System.out.println("Es primavera");
				break;
			default:
				System.out.println("Ingrese una estación aceptada.");
		}
		
		
	}

}
