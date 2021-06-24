package Figuras;

import java.util.InputMismatchException;

public class Octaedro extends F {
		
		private double Arista, Area, Volumen;
		private static double LongituddeLados;
		private static double NLados;
		private static double AreaLateral;
		private static double AreaTotal;
	
public Octaedro(double Altura, double Radio, boolean Tridimensional, double Arista, double Area, double Volumen) {
		super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
	}
		
public void CalcularOctaedro() {
	do {
		try {
			Continuar = false;
					
			System.out.print("Ingrese la Longitud de una de las Aristas del Octaedro");
			System.out.print(": ");
			Arista = sc.nextDouble();
while(Arista <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		Arista = sc.nextDouble();
	}
			
		Area = Math.round(2 * Math.pow(Arista, 2) * Math.sqrt(3));
		System.out.println("El Area del Octaedro es: "+Area);
		Volumen = Math.round((Math.sqrt(2) / 3) * Math.pow(Arista, 3));
		System.out.println("El Volumen del Octaedro es: "+Volumen);
} catch (InputMismatchException e) {
		    System.out.println("Por favor, ingrese un numero valido");
			  sc.next();
			  System.out.println();
			  Continuar = true;
	}
} while (Continuar);
	}

	
public void Tridimensional() {
		System.out.println("La figura es Tridimensional");
	}
		
public double MostrarArista() {
			return this.Arista;
		}

public void CambiarArista(double Arista) {
			this.Arista = Arista;
		}

public double MostrarArea() {
			return this.Area;
		}

public void CambiarArea(double Area) {
			this.Area = Area;
		}

public double MostrarVolumen() {
			return this.Volumen;
		}

public void CambiarVolumen(double Volumen) {
			this.Volumen = Volumen;
		}
	}