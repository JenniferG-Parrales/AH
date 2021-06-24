package Figuras;

import java.util.InputMismatchException;

public class Icosaedro extends F {

		private double Arista, Area, Volumen;
		private static double AreaLateral;
		private static double AreaTotal;
		private static double LongituddeLados;
		private static double NLados;
	
public Icosaedro(double Altura, double Radio, boolean Tridimensional, double Arista, double Area, double Volumen) {
		super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
	}
		
public void CalcularIcosaedro() {
	do {
		try {
			Continuar = false;
					
		System.out.print("Ingrese la Longitud de una de las Aristas del Icosaedro");
		System.out.print(": ");
		Arista = sc.nextDouble();
while(Arista <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		Arista = sc.nextDouble();
	}
		Area = Math.round(5 * Math.pow(Arista, 2) * Math.sqrt(3));
		System.out.println("El Area del Icosaedro es: "+Area);
		Volumen = Math.round(0.41666666667 * (3 + Math.sqrt(5) * Math.pow(Arista, 3)));
		System.out.println("El Volumen del Icosaedro es: "+Volumen);
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