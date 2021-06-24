package Figuras;

import java.util.InputMismatchException;

public class TroncoDelCono extends F {
	
	private double RadioMayor, Volumen, Generatriz, AreaBMayor, AreaBMenor;
	private static double LongituddeLados;
	private static double NLados;
	private static double AreaLateral;
	private static double AreaTotal;
	
	
public TroncoDelCono(double Altura, double Radio, boolean Tridimensional, double RadioMayor, double AreaLateral, double AreaTotal, double Volumen, double Generatriz, double AreaBMayor, double AreaBMenor) {
			super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
			this.RadioMayor = RadioMayor;
			this.AreaLateral = AreaLateral;
			this.AreaTotal = AreaTotal;
			this.Volumen = Volumen;
			this.Generatriz = Generatriz;
			this.AreaBMayor = AreaBMayor;
			this.AreaBMenor = AreaBMenor;
		}
			
public void CalcularTroncoDelCono() {
	do {
		try {
			Continuar = false;
						
				System.out.print("Ingrese el Radio");
				System.out.print(": ");
				CambiarRadio(sc.nextDouble());
				while(MostrarRadio() <= 0) {
					System.out.println("Por favor, ingrese un dato valido");
					System.out.print("Opcion: ");
					CambiarRadio(sc.nextDouble());
				}
				
				System.out.print("Ingrese el Radio Mayor");
				System.out.print(": ");
				CambiarRadioMayor(sc.nextDouble());
				while(MostrarRadioMayor() <= 0) {
					System.out.println("Por favor, ingrese un dato valido");
					System.out.print("Opcion: ");
					CambiarRadioMayor(sc.nextDouble());
				}
				
				System.out.print("Ingrese la Altura");
				System.out.print(": ");
				CambiarAltura(sc.nextDouble());
				while(MostrarAltura() <= 0) {
					System.out.println("Por favor, ingrese un dato valido");
					System.out.print("Opcion: ");
					CambiarAltura(sc.nextDouble());
				}
				
				Generatriz = Math.round(Math.sqrt(MostrarAltura() * MostrarAltura() + (RadioMayor * RadioMayor - MostrarRadio() * MostrarRadio())));
				System.out.println("La Generatriz del Tronco del Cono es: "+Generatriz);
				AreaLateral = Math.round(Math.PI * Generatriz * (RadioMayor + MostrarRadio()));
				System.out.println("El Area Lateral del Tronco del Cono es: "+AreaLateral);
				AreaBMayor = Math.PI * Math.pow(RadioMayor, 2);
				AreaBMenor = Math.PI * Math.pow(MostrarRadio(), 2);
				AreaTotal = Math.round(AreaLateral + AreaBMayor + AreaBMenor);
				System.out.println("El Area Total del Tronco del Cono es: "+AreaTotal);
				Volumen = Math.round(0.3333333333333 * Math.PI * MostrarAltura() * (Math.pow(RadioMayor, 2) + Math.pow(MostrarRadio(), 2) + RadioMayor + MostrarRadio() ));
				System.out.println("El Volumen del Tronco del Cono es: "+Volumen);
		} catch (InputMismatchException e) {
			    System.out.println("Por favor, ingrese un dato valido");
			    	  sc.next();
			    	  System.out.println();
			    	  Continuar = true;
	}
} while (Continuar);
	}

public void Tridimensional() {
			System.out.println("La figura es Tridimensional");
		}
			
public double MostrarRadioMayor() {
			return this.RadioMayor;
		}

public void CambiarRadioMayor(double radioMayor) {
			this.RadioMayor = radioMayor;
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

public void CambiarVolumen(double Volumen) {
			this.Volumen = Volumen;
		}

public double MostrarGeneratriz() {
			return this.Generatriz;
		}

public void CambiarGeneratriz(double Generatriz) {
			this.Generatriz = Generatriz;
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