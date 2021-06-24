package Figuras;

import java.util.InputMismatchException;

public class Ortoedro extends F {
	
		private double Arista, Area, Volumen, Ancho, Longitud, Altura, Diagonal;
		private static double LongituddeLados;
		private static double NLados;
		private static double AreaLateral;
		private static double AreaTotal;
	
public Ortoedro(double Altura, double Radio, boolean Tridimensional, double Arista, double Area, double Volumen, double Longitud, double Ancho, double Diagonal) {
		super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
		this.Altura = Altura;
		this.Longitud = Longitud;
		this.Diagonal = Diagonal;
		this.Ancho = Ancho;
	}

public void CalcularOrtoedro() {
	do {
		try {
			Continuar = false;
					
			System.out.print("Ingrese el Ancho");
			System.out.print(": ");
			Ancho = sc.nextDouble();
while(Ancho <= 0) {
				System.out.println("Por favor, ingrese un numero valido");
				System.out.print("Opcion: ");
				Ancho = sc.nextDouble();
			}
			
			System.out.print("Ingrese la Altura");
			System.out.print(": ");
			Altura = sc.nextDouble();
while(Altura <= 0) {
				System.out.println("Por favor, ingrese un numero valido");
				System.out.print("Opcion: ");
				Altura = sc.nextDouble();
			}

			System.out.print("Ingrese la Longitud");
			System.out.print(": ");
			Longitud = sc.nextDouble();
while(Longitud <= 0) {
				System.out.println("Por favor, ingrese un numero valido");
				System.out.print("Opcion: ");
				Longitud = sc.nextDouble();
		}
			
			Area = Math.round(2 * (Longitud * Ancho + Longitud * Altura + Ancho * Altura));
			System.out.println("El Area del Ortoedro es: "+Area);
			Volumen = Math.round(Longitud * Ancho * Altura);
			System.out.println("El Volumen del Ortoedro es: "+Volumen);
			Diagonal = Math.round(Math.sqrt(Math.pow(Longitud, 2) + Math.pow(Ancho, 2) + Math.pow(Altura, 2)));
			System.out.println("La Diagonal del Ortoedro es: "+Diagonal);
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

public double MostrarLongitud() {
			return this.Longitud;
		}

public void CambiarLongitud(double Longitud) {
			this.Longitud = Longitud;
		}

public double MostrarDiagonal() {
			return this.Diagonal;
		}

	public void CambiarDiagonal(double Diagonal) {
			this.Diagonal = Diagonal;
		}
	}