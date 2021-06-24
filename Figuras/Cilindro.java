package Figuras;
import java.util.InputMismatchException;

public class Cilindro extends F{
	
		private double Altura;
		private double AreaLateral;
		private double AreaTotal;
		private static double LongituddeLados;
		private double Radio;
		private double Volumen;
	
public Cilindro(double Altura, double Radio, double NLados, boolean Tridimensional, double AreaLateral, double AreaTotal, double Volumen) {
		super(Altura, Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.Altura = Altura;
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.LongituddeLados = LongituddeLados;
		this.Radio = Radio;
		this.Volumen = Volumen;
	}
	
public void CalcularCilindro() {
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
	    Radio = sc.nextDouble();
while(Radio <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		Radio = sc.nextDouble();
	}
		
		AreaLateral = Math.round(2 * Math.PI * Radio * MostrarAltura());
	    System.out.println("El Area Lateral del Cilindro es: "+AreaLateral);
	    AreaTotal = Math.round(2 * Math.PI * Radio * (MostrarAltura() + Radio));
	    System.out.println("El Area Total del Cilindro es: "+AreaTotal);
	    Volumen = Math.round(Math.PI * Math.pow(Radio, 2) * MostrarAltura());
	    System.out.println("El Volumen del Cilindro es: "+Volumen);
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
	
public double MRadio() {
		return this.Radio;
	}

public void CRadio(double Radio) {
		this.Radio = Radio;
	}

public double MrAreaLateral() {
		return this.AreaLateral;
	}

public void CAreaLateral(double AreaLateral) {
		this.AreaLateral = AreaLateral;
	}

public double MAreaTotal() {
		return this.AreaTotal;
	}

public void CAreaTotal(double AreaTotal) {
		this.AreaTotal = AreaTotal;
	}

public double MVolumen() {
		return this.Volumen;
	}

public void CVolumen(double Volumen) {
		this.Volumen = Volumen;
	}
}