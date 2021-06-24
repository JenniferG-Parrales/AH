package Figuras;

import java.util.InputMismatchException;

public class Hexaedro extends F {
		
			private double Arista, Area, Volumen, Diagonal;
			private static double AreaLateral;
			private static double AreaTotal;
			private static double LongituddeLados;
			private static double NLados;
			
public Hexaedro(double Altura, double Radio, boolean Tridimensional, double Arista, double Area, double Volumen, double Diagonal) {
			super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
			this.Area = Area;
			this.Arista = Arista;
			this.Volumen = Volumen;
	}
		
public void CalcularHexaedro() {
	do {
		try {
			Continuar = false;
					
		System.out.print("Ingrese la Longitud de una de las Aristas del Hexaedro");
		System.out.print(": ");
		Arista = sc.nextDouble();
while(Arista <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		Arista = sc.nextDouble();
	}
				
		Area = Math.round(6 * Math.pow(Arista, 2));
		System.out.println("El Area del Hexaedro es: "+Area);
		Volumen = Math.round(Math.pow(Arista, 3));
		System.out.println("El Volumen del Hexaedro es: "+Volumen);
		Diagonal = Math.round(Arista * Math.sqrt(3));
		System.out.println("La Diagonal del Hexaedro es: "+Diagonal);
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

public double MostrarDiagonal() {
		return this.Diagonal;
}

public void CambiarDiagonal(double Diagonal) {
		this.Diagonal = Diagonal;
}
}