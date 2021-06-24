package Figuras;

import java.util.InputMismatchException;

public class Prisma extends F {
	
	private double AreaLateral, AreaTotal, Volumen, LongituddeLados, Apotema, PerimetroBase, AreaBase;
	private double NLados;
	
public Prisma(double Altura, double Radio, double NLados, boolean Tridimensional, double AreaLateral, double AreaTotal, double Volumen, double LongituddeLados, double Apotema, double PerimetroBase, double AreaBase) {
		super(Altura,  Radio, LongituddeLados, NLados, AreaLateral, AreaTotal, Volumen, Tridimensional);
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Volumen = Volumen;
		this.LongituddeLados = LongituddeLados;
		this.Apotema = Apotema;
		this.PerimetroBase = PerimetroBase;
		this.AreaBase = AreaBase;
		this.NLados = NLados;
	}
	
public void CalcularPrisma() {
	do {
		try {
			Continuar = false;
				
		System.out.print("Ingrese el Numero de Lados");
		System.out.print(": ");
		CambiarNLados(sc.nextInt());
while(MostrarNLados() <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		CambiarNLados(sc.nextInt());
	}
		
		System.out.print("Ingrese la Longitud de los Lados");
		System.out.print(": ");
		CambiarLongituddeLados(sc.nextDouble());
while(MostrarLongitudLados() <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		CambiarLongituddeLados(sc.nextDouble());
	}
		
		System.out.print("Ingrese la Altura");
		System.out.print(": ");
		CambiarAltura(sc.nextDouble());
while(MostrarAltura() <= 0) {
		System.out.println("Por favor, ingrese un numero valido");
		System.out.print("Opcion: ");
		CambiarAltura(sc.nextDouble());
	}
		
		PerimetroBase = NLados * LongituddeLados;
		AreaLateral = Math.round(PerimetroBase * MostrarAltura());
		System.out.println("El Area Lateral del prisma es: "+MostrarAltura());
		Apotema = Math.sqrt(3 * Math.pow(LongituddeLados, 2) / 4);
		AreaBase = PerimetroBase * Apotema / 2;
		AreaTotal = Math.round(AreaLateral + 2 * AreaBase);
		System.out.println("El Area Total del prisma es: "+MostrarAreaTotal());
		Volumen = Math.round(AreaBase * MostrarAltura());
		System.out.println("El Volumen del prisma es: "+Volumen);
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

public double MostrarLongitudLados() {
		return this.LongituddeLados;
	}
}