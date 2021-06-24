package Figuras;

import java.util.InputMismatchException;

public class Tetraedro extends F {
	
	private double Arista, Area, Volumen, Altura;
	private static double LongituddeLados;
	private static double NLados;
	private static double AreaLateral;
	private static double AreaTotal;
		
public Tetraedro(double Altura, double Radio, boolean 	Tridimensional, double Arista, double Area, double Volumen) {
			super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
			this.Area = Area;
			this.Arista = Arista;
			this.Volumen = Volumen;
		}
		
public void CalcularTetraedro() {
	do {
		try {
			Continuar = false;
					
			System.out.print("Ingrese la Longitud de una de las Aristas del Tetraedro");
			System.out.print(": ");
			Arista = sc.nextDouble();
			while(Arista <= 0) {
				System.out.println("Por favor, ingrese un numero valido");
				System.out.print("Opcion: ");
				Arista = sc.nextDouble();
			}
			
			Area = Math.round(Math.pow(Arista, 2) * Math.sqrt(3));
			System.out.println("El Area del Tetraedro es: "+Area);
			Volumen = Math.round((Math.sqrt(2) / 12) * Math.pow(Arista, 3));
			System.out.println("El Volumen del Tetraedro es: "+Volumen);
			Altura = Math.round(Arista * (Math.sqrt(6) / 3));
			System.out.println("La Altura del Tetraedro es: "+MostrarAltura());
		} catch (InputMismatchException e) {
		    System.out.println("No puede introducir caracteres y/o caracteres especiales");
			  sc.next();
			  System.out.println();
			  Continuar = true;
	}
} while (Continuar);
	}

public void Tridimensional() {
		System.out.println("La figura es Tridimensional");
	}
		
public double MotrarArista() {
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