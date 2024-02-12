package TER;

import java.util.Random;

public class CPU {
	public static int normal() {
		Random numAleatorio = new Random();
		int saqueCPU = numAleatorio.nextInt(9);

		return saqueCPU;
	}

	public static int dificil(String[] tablero) {
		//Sabe hacer lineas
		Random numAleatorio = new Random();
		int saqueCPU = numAleatorio.nextInt(9);

		return saqueCPU;
	}
	
	public static int imposible(String[] tablero) {
		//Sabe hacer lineas y cortarlas
		Random numAleatorio = new Random();
		int saqueCPU = numAleatorio.nextInt(9);

		return saqueCPU;
	}
}
