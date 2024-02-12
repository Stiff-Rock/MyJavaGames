package PPT;

import java.util.Scanner;

public class PPT {
	public void inicio(Scanner in) {
		int saqueCPU, repetir = 1, victoriaCPU = 0, victoriaUSER = 0;
		String saqueTxt, saqueCPUTxt;
		
		System.out.print("");
		System.out.println("Bienvenido a PiedraPapelTijera");
		System.out.println("Elige una dificultad: ");
		System.out.println("1.Normal ");
		System.out.println("2.Difícil ");
		System.out.println("3.Imposible");

		int num = in.nextInt();
		System.out.println("");

		do {
			do {
				System.out.println("Elige: ");
				System.out.println("1.Piedra");
				System.out.println("2.Papel");
				System.out.println("3.Tijera");

				int saque = in.nextInt();
				System.out.println("");
				saqueCPU = Reglas.dificultad(num, saque);

				int resultado = Reglas.resultado(saque);

				if (saque == 1) {
					saqueTxt = "Piedra";
				} else if (saque == 2) {
					saqueTxt = "Papel";
				} else {
					saqueTxt = "Tijera";
				}

				if (saqueCPU == 1) {
					saqueCPUTxt = "Piedra";
				} else if (saqueCPU == 2) {
					saqueCPUTxt = "Papel";
				} else {
					saqueCPUTxt = "Tijera";
				}

				System.out.println("SAQUES: Usuario: " + saqueTxt + " | CPU: " + saqueCPUTxt);

				if (resultado == 1) {
					victoriaUSER++;
				} else if (resultado == 2) {
					victoriaCPU++;
				} else {
					System.out.println("Empate");
				}

				System.out.println("PUNTUACIÓN: Usuario: " + victoriaUSER + " | CPU: " + victoriaCPU);
				System.out.println("");
				
			} while (victoriaCPU != 3 && victoriaUSER != 3);

			if (victoriaUSER == 3) {
				System.out.println("Ganaste");
				System.out.println("");
			} else {
				System.out.println("Perdiste");
				System.out.println("");
			}
			
			System.out.println("¿Quieres jugar de nuevo?");
			System.out.println("1. Si");
			System.out.println("2. No");
			
			int eleccion = in.nextInt();
			System.out.println("");
			
			if (eleccion == 2) {
				repetir = 0;
			} else {
				repetir = 1;
				victoriaCPU = 0;
				victoriaUSER = 0;
			}
			
		} while (repetir != 0);
		
		System.out.println("GAME OVER");
		System.out.println("");
	}
}
