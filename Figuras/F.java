package Figuras;

import java.util.Scanner;

public class F {

	static Scanner sc = new Scanner(System.in);
	static boolean Continuar;
	
		private double Altura;
		private double AreaLateral;
		private double AreaTotal;
		private double LongituddeLados;
		private double NLados;
		private double Radio;
		private double Volumen;
		private boolean Tridimensional;
	
public void TDM() {
		System.out.println("La figura es Tridimensional");
	}

public F(double Altura, double Radio, double LongituddeLados, double NLados, double AreaLateral, double AreaTotal, double Volumen, boolean Tridimensional) {
		this.Altura = Altura;
		this.AreaLateral = AreaLateral;
		this.AreaTotal =AreaTotal;
		this.LongituddeLados = LongituddeLados;
		this.NLados = NLados;
		this.Radio = Radio;
		this.Volumen = Volumen;
		this.Tridimensional = Tridimensional;
	}
	
public boolean MostrarTridimensional() {
	return this.Tridimensional;
	}
	
public void CambiarTridimensional(double Tridimensional) {
	Tridimensional = Tridimensional;
	}

public double MostrarAltura() {
	return this.Altura;
	}
	
public void CambiarAltura(double Altura) {
	Altura = Altura;
	}
	
public double MostrarAreaLateral() {
	return this.AreaLateral;
	}
	
public void CambiarAreaLateral(double AreaLateral) {
	AreaLateral = AreaLateral;
	}
	
public double MostrarAreaTotal() {
	return this.AreaTotal;
	}
	
public void CambiarAreaTotal(double AreaTotal) {
	AreaTotal = AreaTotal;
	}

public double MostrarRadio() {
	return this.Radio;
	}
	
public void CambiarRadio(double Radio) {
	LongituddeLados = LongituddeLados;
	}
	
public double MostrarLongituddeLados() {
	return this.LongituddeLados;
	}
	
public void CambiarLongituddeLados(double LongituddeLados) {
	LongituddeLados = LongituddeLados;
	}
public double MostrarNLados() {
	return this.NLados;
	}
	
public void CambiarNLados(double NLados) {
	this.NLados = NLados;
	}
	
public double MostrarVolumen() {
	return this.Volumen;
	}
	
public void CambiarVolumen(double Volumen) {
	Volumen = Volumen;
	}
}