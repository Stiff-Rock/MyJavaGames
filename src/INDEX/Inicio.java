package INDEX;

import java.util.Scanner;

import CHESS.CHESS;
import HANOI.Hanoi;
import PPT.PPT;
import TER.TER;

public class Inicio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PPT piedraPapelTijera = new PPT();
		TER tresEnRaya = new TER();
		CHESS ajedrez = new CHESS();
		Hanoi hanoi = new Hanoi();
		int eleccion;
		do {
			eleccion = 0;
			System.out.println("1. PiedraPapelTijera");
			System.out.println("2. TresEnRaya");
			System.out.println("3. Ajedrez");
			System.out.println("4. Hanoi");
			System.out.println("5. Salir");
			System.out.print("Elige: ");
			eleccion = in.nextInt();
			System.out.println("");
			if (eleccion == 1) {
				piedraPapelTijera.inicio(in);
			} else if (eleccion == 2) {
				tresEnRaya.inicio(in);
			} else if (eleccion == 3){
				ajedrez.inicio(in);
			} else if (eleccion == 4) {
				hanoi.inicio(in);
			}
		} while (eleccion != 5);
		System.out.println("¡Gracias por jugar!");
		in.close();
	}
}
