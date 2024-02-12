package TER;

import java.util.Scanner;

public class TER {
	public void inicio(Scanner in) {
		int volverAJugar = 1;
		//TODO Configurar empate
		//TODO Que en vez de GAME OVER, ponga quien ha ganado
		do {
			int dificultadElegida = Reglas.Intro(in);

			Reglas.Rondas(dificultadElegida, in);

			System.out.println("¿Quieres jugar de nuevo?");
			System.out.println("1. Si");
			System.out.println("2. No");
			volverAJugar = in.nextInt();
		} while (volverAJugar == 1);

	}
}
