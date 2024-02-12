package TER;

import java.util.Scanner;

public class Reglas {
	static String[] tablero = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public static int Intro(Scanner in) {

		System.out.print("");
		System.out.println("¡Bienvenido al TresEnRaya!");
		System.out.println("Elige una dificultad: ");
		System.out.println("1.Normal ");
		System.out.println("2.Difícil ");
		System.out.println("3.Imposible");

		int eleccionDificultad = in.nextInt();
		return eleccionDificultad;
	}

//Selección de dificultad
	public static int dificultad(int dificultadElegida) {
		int saqueCPU;
		if (dificultadElegida == 1) {
			saqueCPU = CPU.normal();
		} else if (dificultadElegida == 2) {
			saqueCPU = CPU.dificil(tablero);
		} else {
			saqueCPU = CPU.imposible(tablero);
		}
		return saqueCPU;
	}

	public static void Rondas(int dificultadElegida, Scanner in) {
		int numRondas = 1;
		int ganador;
		System.out.println("1. Usuario");
		System.out.println("2. CPU");
		System.out.print("Elige quien va primero: ");
		int orden = in.nextInt();
		do {
			Reglas.printTablero();
			if (orden == 1) {
				USER(in);
				numRondas++;
				CPU(dificultadElegida);
				numRondas++;
			} else {
				CPU(dificultadElegida);
				USER(in);
			}
			ganador = Reglas.victoria();
		} while (ganador == 0 && numRondas < 9);
		// Condición de empate
		if (numRondas == 9 && ganador == 0) {
			System.out.println("");
			System.out.println("¡Empate!");
			System.out.println("");
		}

		for (int i = 0; i < tablero.length - 1; i++) {
			tablero[i] = String.valueOf(i + 1);
		}
	}

	public static void printTablero() {
		System.out.println("");
		System.out.println(tablero[0] + "|" + tablero[1] + "|" + tablero[2]);
		System.out.println("-----");
		System.out.println(tablero[3] + "|" + tablero[4] + "|" + tablero[5]);
		System.out.println("-----");
		System.out.println(tablero[6] + "|" + tablero[7] + "|" + tablero[8]);
		System.out.println("");
	}

	public static void USER(Scanner in) {
		int saqueUSER;
		boolean correcto = true;
		do {
			System.out.print("Elige: ");
			saqueUSER = in.nextInt();
			if (tablero[saqueUSER - 1].equals("X") || tablero[saqueUSER - 1].equals("O")) {
				correcto = false;
				System.out.println("Esa casilla está ocupada");
			} else {
				correcto = true;
				tablero[(saqueUSER - 1)] = "X";
			}
		} while (!correcto);
	}

	public static void CPU(int dificultadElegida) {
		int saqueCPU;
		boolean correcto = true;
		do {
			saqueCPU = Reglas.dificultad(dificultadElegida);
			if (tablero[saqueCPU].equals("X") || tablero[saqueCPU].equals("O")) {
				correcto = false;
			} else {
				correcto = true;
				tablero[(saqueCPU)] = "O";
			}
		} while (!correcto);
	}

	public static int victoria() {
		int ganador = 0;
		// Chapuza para distinguir la victoria de X de la de O

		// Victoria de "X"
		if (tablero[0].equals("X") && tablero[0].equals(tablero[1]) && tablero[1].equals(tablero[2])
				|| tablero[3].equals("X") && tablero[3].equals(tablero[4]) && tablero[4].equals(tablero[5])
				|| tablero[6].equals("X") && tablero[6].equals(tablero[7]) && tablero[7].equals(tablero[8])
				// Lineas Horizontales
				|| tablero[0].equals("X") && tablero[0].equals(tablero[3]) && tablero[3].equals(tablero[6])
				|| tablero[1].equals("X") && tablero[1].equals(tablero[4]) && tablero[4].equals(tablero[7])
				|| tablero[2].equals("X") && tablero[2].equals(tablero[5]) && tablero[5].equals(tablero[8])
				// Lineas Verticales
				|| tablero[0].equals("X") && tablero[0].equals(tablero[1]) && tablero[1].equals(tablero[2])
				// Lineas Diagonales
				|| tablero[0].equals("X") && tablero[0].equals(tablero[4]) && tablero[4].equals(tablero[8])
				|| tablero[2].equals("X") && tablero[2].equals(tablero[4]) && tablero[4].equals(tablero[6])) {
			ganador = 1;
			System.out.println("");
			System.out.println("¡Has ganado!");
			System.out.println("");
		} else if (tablero[0].equals("O") && tablero[0].equals(tablero[1]) && tablero[1].equals(tablero[2])
				|| tablero[3].equals("O") && tablero[3].equals(tablero[4]) && tablero[4].equals(tablero[5])
				|| tablero[6].equals("O") && tablero[6].equals(tablero[7]) && tablero[7].equals(tablero[8])
				// Lineas Horizontales
				|| tablero[0].equals("O") && tablero[0].equals(tablero[3]) && tablero[3].equals(tablero[6])
				|| tablero[1].equals("O") && tablero[1].equals(tablero[4]) && tablero[4].equals(tablero[7])
				|| tablero[2].equals("O") && tablero[2].equals(tablero[5]) && tablero[5].equals(tablero[8])
				// Lineas Verticales
				|| tablero[0].equals("O") && tablero[0].equals(tablero[1]) && tablero[1].equals(tablero[2])
				// Lineas Diagonales
				|| tablero[0].equals("O") && tablero[0].equals(tablero[4]) && tablero[4].equals(tablero[8])
				|| tablero[2].equals("O") && tablero[2].equals(tablero[4]) && tablero[4].equals(tablero[6])) {
			ganador = 1;
			System.out.println("");
			System.out.println("¡Gano la CPU!");
			System.out.println("");
		}
		return ganador;
	}
}
