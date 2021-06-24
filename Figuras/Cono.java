package Figuras;
import java.util.InputMismatchException;

public class Cono extends F {
	
		private static double LongituddeLados;
		private static double NLados;
		private double Generatriz, AreaLateral, AreaTotal, Volumen;
	
public Cono(double Altura, double Radio, boolean Tridimensinal, double Generatriz, double AreaLateral, double AreaTotal, double Volumen ) {
		super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensinal);
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Generatriz = Generatriz;
		this.Volumen = Volumen;
	}
	
public void CalcularCono() {
	do {
		try {
			Continuar = false;
			
			System.out.print("Ingrese la Altura");
			System.out.print(": ");
			CambiarAltura(sc.nextDouble());
	while(MostrarAltura() <= 0) {
			System.out.println("Por favor, ingrese un numero valido");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		System.out.print("Ingrese el Radio");
		System.out.print(": ");
		CambiarRadio(sc.nextDouble());
while(MostrarRadio() <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		CambiarRadio(sc.nextDouble());
	}
		
		Generatriz = Math.sqrt(Math.pow(MostrarAltura(), 2) + Math.pow(MostrarRadio(), 2));
		AreaLateral = Math.round(Math.PI * MostrarRadio() * Generatriz);
		System.out.println("El Area Lateral del Cono es: "+AreaLateral);
		AreaTotal = Math.round(Math.PI * MostrarRadio() * (Generatriz + MostrarRadio()));
		System.out.println("El Area Total del Cono es: "+AreaTotal);
		Volumen = Math.round(Math.PI * Math.pow(MostrarRadio(), 2) * MostrarAltura() / 3);
		System.out.println("El Volumen del Cono es: "+Volumen);
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
}