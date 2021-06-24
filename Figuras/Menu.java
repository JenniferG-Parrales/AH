package Figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static boolean Continuar;
	static int Opcion, Opcio;
	static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
		
do {
	do {
		try {
			Continuar = false;
		System.out.println("¡Bienvenid0!");
		System.out.println("Por favor ingrese su opcion");
		System.out.println("Opcion 1: Ingresar al Programa");
		System.out.println("Opcion 2: Salir del programa");
		System.out.print("Opcion: ");
		Opcion = sc.nextInt();
		
while(Opcion <= 0 || Opcion >= 3) {
			System.out.println("Por favor, ingrese un dato valida");
			System.out.print("Opcion: ");
			Opcion = sc.nextInt();
		}
} catch (InputMismatchException e) {
            System.out.println("Por favor, ingrese solo numeros");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
	}
} while (Continuar);

switch(Opcion) {
	case 1:
		do {
			try {
				Continuar = false;
			String Figuras[] = new String[13];
			Figuras[0] = "Opcion 1: Prisma";
			Figuras[1] = "Opcion 2: Cilindro";
			Figuras[2] = "Opcion 3: Piramide";
			Figuras[3] = "Opcion 4: Cono";
			Figuras[4] = "Opcion 5: Esfera";
			Figuras[5] = "Opcion 6: Tronco del Cono";
			Figuras[6] = "Opcion 7: Tronco de la Piramide";
			Figuras[7] = "Opcion 8: Ortoedro";
			Figuras[8] = "Opcion 9: Tetraedro";
			Figuras[9] = "Opcion 10: Hexaedro";
			Figuras[10] = "Opcion 11: Octaedro";
			Figuras[11] = "Opcion 12: Dodecaedro";
			Figuras[12] = "Opcion 13: Icosaedro";
			System.out.println("A continuacion se le mostrara las figuras disponibles");
			System.out.println("");
			System.out.println("FIGURAS");
for(int i = 0 ; i < Figuras.length ; i++) {
			System.out.println(Figuras[i]);	
		}
			System.out.print("Opcion : ");
			Opcio = sc.nextInt();
while(Opcio <= 0 || Opcio >= 14) {
				System.out.println("Por favor, ingrese un numero valido");
				System.out.print("Opcion: ");
				Opcio = sc.nextInt();
		}
} catch (InputMismatchException e) {
	            System.out.println("Por favor, ingrese un numero valido");
	            sc.next();
	            System.out.println();
	             Continuar = true;
	}
} while (Continuar);
			
switch(Opcio) {
	case 1:
			Prisma Prisma = new Prisma(0.0, 0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			Prisma.CalcularPrisma();
			Prisma.Tridimensional();
	break;
				
	case 2:
			Cilindro Cilindro = new Cilindro(0.0, 0.0, 0.0, true, 0.0, 0.0, 0.0);
			Cilindro.CalcularCilindro();
			Cilindro.Tridimensional();
	break;
				
	case 3:
			Piramide Piramide = new Piramide(0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			Piramide.CalcularPiramide();
			Piramide.Tridimensional();
	break;
			
	case 4:
			Cono Cono = new Cono(0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0);
			Cono.CalcularCono();
			Cono.Tridimensional();
	break;
				
	case 5:
			Esferas Esferas = new Esferas( 0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			Esferas.CalcularEsferas();
			Esferas.Tridimensional();
	break;
				
	case 6:
			TroncoDelCono TroncoDelCono = new TroncoDelCono(0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			TroncoDelCono.CalcularTroncoDelCono();
			TroncoDelCono.Tridimensional();
	break;
				
	case 7:
			TroncoDePiramide TronodelPiramide = new TroncoDePiramide(0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0 ,0.0 ,0.0 ,0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			TronodelPiramide.CalcularTroncoPiramide();
			TronodelPiramide.Tridimensional();
	break;
				
	case 8:
			Ortoedro Ortoedro = new Ortoedro(0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			Ortoedro.CalcularOrtoedro();
			Ortoedro.Tridimensional();
	break;
				
	case 9:
			Tetraedro Tetraedro = new Tetraedro(0.0, 0.0, true , 0.0, 0.0, 0.0);
			Tetraedro.CalcularTetraedro();
			Tetraedro.Tridimensional();
	break;
				
	case 10:
			Hexaedro Hexaedro = new Hexaedro(0.0, 0.0, true , 0.0, 0.0, 0.0, 0.0);
			Hexaedro.CalcularHexaedro();
			Hexaedro.Tridimensional();
	break;
				
	case 11:
		 Octaedro Octaedro = new Octaedro(0.0, 0.0, true, 0.0, 0.0, 0.0);
		 Octaedro.CalcularOctaedro();
		Octaedro.Tridimensional();
	break;
				
	case 12:
			Dodecaedro Dodecaedro = new Dodecaedro(0.0, 0.0, true, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
			Dodecaedro.CalcularDodecaedro();
			Dodecaedro.Tridimensional();
	break;
				
	case 13:
			Icosaedro Icosaedro = new Icosaedro(0.0, 0.0, true, 0.0, 0.0, 0.0);
			Icosaedro.CalcularIcosaedro();
			Icosaedro.Tridimensional();
	break;
	}
			
	case 2:
		System.out.println("Gracias por utilizar programa, que tenga buen dia");
break;
		}
}while(Opcion == 1);
	}
}
