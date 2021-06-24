package Figuras;

import java.util.InputMismatchException;

public class TroncoDePiramide extends F {
	
		private double AristaMayor, AristaMenor, ApotemaBMayor, ApotemaBMenor, PerimetroBMayor, PerimetroBMenor, Apotema, AreaLateral, AreaTotal, Volumen, AreaBMayor, AreaBMenor;
			private static double LongituddeLados;
				private static double NLados;

public TroncoDePiramide(double Altura, double Radio, boolean Tridimensional, double AristaMayor, double AristaMenor, double ApotemaBMayor, double ApotemaBMenor, double PerimetroBMayor, double PerimetroBMenor, double Apotema, double AreaLateral, double AreaTotal, double Volumen, double AreaBMayor, double AreaBMenor) {
			super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
			this.AreaLateral = AreaLateral;
			this.AreaTotal = AreaTotal;
			this.Volumen = Volumen;
			this.Apotema = Apotema;
			this.ApotemaBMayor = ApotemaBMayor;
			this.AristaMenor = AristaMenor;
			this.AristaMayor = AristaMayor;
			this.ApotemaBMenor = ApotemaBMenor;
			this.PerimetroBMayor = PerimetroBMayor;
			this.PerimetroBMenor = PerimetroBMenor;
			this.AristaMayor = AristaMayor;
			this.AristaMenor = AristaMenor;
			this.AreaBMayor = AreaBMayor;
			this.AreaBMenor = AreaBMenor;
		}
		
public void CalcularTroncoPiramide() {
	do {
		try {
			Continuar = false;
					
			System.out.print("Ingrese la longitud de la Arista Mayor");
			System.out.print(": ");
			AristaMayor = sc.nextDouble();
			while(AristaMayor <= 0) {
				System.out.println("Por favor, ingrese un dato valido");
				System.out.print("Opcion: ");
				AristaMayor = sc.nextDouble();
			}
			
			System.out.print("Ingrese la longiud de la Arista Menor");
			System.out.print(": ");
			AristaMenor = sc.nextDouble();
			while(AristaMenor <= 0) {
				System.out.println("Por favor, ingrese un dato valido");
				System.out.print("Opcion: ");
				AristaMenor = sc.nextDouble();
			}
			
			System.out.print("Ingrese la Altura");
			System.out.print(": ");
			CambiarAltura(sc.nextDouble());
			while(MostrarAltura() <= 0) {
				System.out.println("Por favor, ingrese un dato valido");
				System.out.print("Opcion: ");
				CambiarAltura(sc.nextDouble());
			}
			
			System.out.print("Ingrese el Apotema de la Base Mayor");
			System.out.print(": ");
			ApotemaBMayor = sc.nextDouble();
			while(ApotemaBMayor <= 0) {
				System.out.println("Por favor, ingrese un dato valido");
				System.out.print("Opcion: ");
				ApotemaBMayor = sc.nextDouble();
			}
			
			System.out.print("Ingrese el Apotema de la Base Menor");
			System.out.print(": ");
			ApotemaBMenor = sc.nextDouble();
			while(ApotemaBMenor <= 0) {
				System.out.println("Por favor, ingrese un dato valido");
				System.out.print("Opcion: ");
				ApotemaBMenor = sc.nextDouble();
			}
			
			PerimetroBMayor = 4 * AristaMayor;
			PerimetroBMenor = 4 * AristaMenor;
			Apotema = Math.sqrt(MostrarAltura() * MostrarAltura() + Math.pow(ApotemaBMayor - ApotemaBMenor, 2));
			AreaLateral = Math.round(((PerimetroBMayor + PerimetroBMenor) / 2) * Apotema);
			System.out.println("El Area Lateral del Tronco de la Piramide: "+AreaLateral);
			AreaBMayor = Math.pow(AristaMayor, 2);
			AreaBMenor = Math.pow(AristaMenor, 2);
			AreaTotal = Math.round(AreaLateral + AreaBMayor + AreaBMenor);
			System.out.println("El Area Total del Tronco de la Piramide es: "+AreaTotal);
			Volumen = Math.round(0.333333333 * MostrarAltura() * (AreaBMayor + AreaBMenor + Math.sqrt(AreaBMayor * AreaBMenor)));
			System.out.println("El volumen del Tronco de la Piramide es: "+Volumen);
				
} catch (InputMismatchException e) {
			    System.out.println("Por favor, ingrese un dato valido");
		  	  sc.next();
		  	  System.out.println();
		  	  Continuar = true;
		}
} while (Continuar);
		}

public void Tridimensional() {
		System.out.println("El tronco de la piramide es de color gris");
	}
		
public double MostrarAristaMayor() {
			return this.AristaMayor;
		}

public void CambiarAristaMayor(double aristaMayor) {
			this.AristaMayor = aristaMayor;
		}

public double MostrarAristaMenor() {
			return this.AristaMenor;
		}

public void CambiarAristaMenor(double AristaMenor) {
			this.AristaMenor = AristaMenor;
		}

public double MostrarApotemaBMayor() {
			return this.ApotemaBMayor;
		}

public void CambiarApotemaBMayor(double ApotemaBMayor) {
			this.ApotemaBMayor = ApotemaBMayor;
		}

public double MostrarApotemaBMenor() {
			return this.ApotemaBMenor;
		}

public void CambiarApotemaBaseMenor(double ApotemaBMenor) {
			this.ApotemaBMenor = ApotemaBMenor;
		}

public double MostrarPerimetroBMayor() {
			return this.PerimetroBMayor;
		}

public void CambiarPerimetroBMayor(double PerimetroBMayor) {
			this.PerimetroBMayor = PerimetroBMayor;
		}

public double MostrarPerimetroBMenor() {
			return this.PerimetroBMenor;
		}

public void CambiarPerimetroBMenor(double PerimetroBMenor) {
			this.PerimetroBMenor = PerimetroBMenor;
		}

public double MostrarApotema() {
			return this.Apotema;
		}

public void CambiarApotema(double Apotema) {
			this.Apotema = Apotema;
		}

public double MostrarAreaLateral() {
			return this.AreaLateral;
		}

public void CambiarAreaLateral(double AreaLateral) {
			this.AreaLateral = AreaLateral;
		}

public double MostrarAreaTotal() {
		return this.AreaTotal;
		}

public void CambiarAreaTotal(double AreaTotal) {
			this.AreaTotal = AreaTotal;
		}

public double MostrarVolumen() {
			return this.Volumen;
		}

public void CambiarVolumen(double volumen) {
			this.Volumen = volumen;
		}

public double MostrarAreaBMayor() {
			return this.AreaBMayor;
		}

public void CambiarAreaBMayor(double AreaBMayor) {
			this.AreaBMayor = AreaBMayor;
		}

public double MostrarAreaBMenor() {
			return this.AreaBMenor;
		}

public void CambiarAreaBMenor(double AreaBMenor) {
			this.AreaBMenor = AreaBMenor;
		}	
	}