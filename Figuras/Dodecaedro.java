package Figuras;

import java.util.InputMismatchException;

public class Dodecaedro extends F {
		
		private double Arista, Area, Volumen, AnguloC, Apotema, AreaP;
		private static double AreaLateral;
		private static double AreaTotal;
		private static double LongituddeLados;
		private static double NLados;
	
public Dodecaedro(double Altura, double Radio, boolean Tridimensional, double Arista, double Area, double Volumen, double AnguloC, double Apotema, double AreaP) {
		super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.Area = Area;
		this.Arista = Arista;
		this.AnguloC = AnguloC;
		this.Apotema = Apotema;
		this.AreaP = AreaP;
		this.Volumen = Volumen;
	}
		
public void CalcularDodecaedro() {
	do {
		try {
			Continuar = false;
					
		System.out.print("Ingrese la longitud de una de las Aristas del Dodecaedro");
		System.out.print(": ");
		Arista = sc.nextDouble();
while(Arista <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		Arista = sc.nextDouble();
	}
		System.out.print("Ingrese el Angulo Central");
		System.out.print(": ");
		AnguloC = sc.nextDouble();
while(AnguloC <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		AnguloC = sc.nextDouble();
	}
			
		Area = Math.round(3 * Math.pow(Arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5)));
		System.out.println("El Area del Dodecaedro es: "+Area);
		Volumen = Math.round(0.25 * (15 + 7 * Math.sqrt(5)) * Math.pow(Arista, 3));
		System.out.println("El Volumen del Dodecaedro es: "+Volumen);
		Apotema = Arista / (2 * Math.tan(AnguloC /2 ));
		AreaP = Math.round(2.5 * Arista * Apotema);
		System.out.println("El Area del Pentagono del Dodecaedro es: "+AreaP);
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

public double MostrarAnguloC() {
		return this.AnguloC;
	}

public void CambiarAnguloCl(double AnguloC) {
		this.AnguloC = AnguloC;
	}

public double MostrarApotema() {
		return this.Apotema;
	}

public void CambiarApotema(double Apotema) {
		this.Apotema = Apotema;
	}

public double MostrarAreaP() {
		return this.AreaP;
	}

public void CambiarAreaP(double AreaPo) {
		this.AreaP = AreaP;
	}
}