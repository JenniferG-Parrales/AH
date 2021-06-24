package Figuras;
import java.util.InputMismatchException;

public class Piramide extends F {

		private static double LongituddeLados;
		private double LongituddeBase, AreaLateral, AreaTotal, Volumen, PerimetroBase, ApotemaBase, Apotema, AreaBase;
		private double NLados;
	
public Piramide(double Altura, double Radio, boolean Tridimensional, double LongituddeBase, double AreaLateral, double AreaTotal, double Volumen, double PerimetroBase, double ApotemaBase, double Apotema, double AreaBase, double NLados ) {
		super(Altura, Radio, LongituddeLados,  NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.LongituddeBase = LongituddeBase;
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Volumen = Volumen;
		this.PerimetroBase = PerimetroBase;
		this.ApotemaBase = ApotemaBase;
		this.Apotema = Apotema;
		this.AreaBase = AreaBase;
		this.NLados = NLados;
	}
	
public void CalcularPiramide() {
	do {
		try {
			Continuar = false;
				
		System.out.print("Ingrese el Numero de lados");
		System.out.print(": ");
		NLados = sc.nextInt();
		while(NLados <= 0) {
			System.out.println("Por favor, ingrese un numero valido");
			System.out.print("Opcion: ");
			NLados = sc.nextInt();
		}
		
		System.out.print("Ingrese la Longitud de la Base");
		System.out.print(": ");
		LongituddeBase = sc.nextDouble();
while(LongituddeBase <= 0) {
			System.out.println("Por favor, ingrese un numero valido");
			System.out.print("Opcion: ");
			LongituddeBase = sc.nextDouble();
		}
		
		System.out.print("Ingrese la Altura");
		System.out.print(": ");
		CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Por favor, ingrese un numero valido");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
		PerimetroBase = LongituddeBase * NLados;
		ApotemaBase = NLados / 2;
		Apotema = MostrarAltura() * MostrarAltura() + ApotemaBase * ApotemaBase;
		AreaLateral = Math.round(PerimetroBase * Apotema / 2);
		System.out.println("El Area Lateral de la Piramide es: "+AreaLateral);
		AreaBase = NLados * LongituddeBase * ApotemaBase / 2;
		AreaTotal = Math.round(AreaLateral + AreaBase);
		System.out.println("El Area Total de la Piramide es: "+AreaTotal);
		Volumen = Math.round(AreaBase * MostrarAltura() / 3);
		System.out.println("El Volumen de la Piramide es: "+Volumen);
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

public double MostrarLongituddeBase() {
		return this.LongituddeBase;
	}

public void CambiarLongituddeBase(double LongituddeBase) {
		this.LongituddeBase = LongituddeBase;
	}

public double MostrarPerimetroB() {
		return this.PerimetroBase;
	}

public void CambiarPerimetroB(double PerimetroBase) {
		this.PerimetroBase = PerimetroBase;
	}

public double MostrarApotemaBase() {
		return this.ApotemaBase;
	}

public void CambiarApotemaB(double ApotemaBase) {
		this.ApotemaBase = ApotemaBase;
	}

public double MostrarApotema() {
		return this.Apotema;
	}

public void CambiarApotema(double Apotema) {
		this.Apotema = Apotema;
	}

public double MostrarNLados() {
		return this.NLados;
	}

public void CambiarNLados(int NLados) {
		this.NLados = NLados;
	}

public double MostrarAreaBase() {
		return AreaBase;
	}

public void CambiarAreaBase(double AreaBase) {
		AreaBase = AreaBase;
	}
}