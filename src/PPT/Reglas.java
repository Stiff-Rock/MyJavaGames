package PPT;

public class Reglas {
	static int saqueCPU;

	public static int dificultad(int opcion, int saqueUSER) {
		if (opcion == 1) {
			saqueCPU = CPU.normal();
		} else if (opcion == 2) {
			saqueCPU = CPU.dificil(saqueUSER);
		} else {
			saqueCPU = CPU.imposible(saqueUSER);
		}
		return saqueCPU;
	}

	public static int resultado(int saqueUSER) {
		int resultado = 0;
		
		if ((saqueUSER == 1 && saqueCPU == 3) || (saqueUSER == 2 && saqueCPU == 1)
				|| (saqueUSER == 3 && saqueCPU == 2)) {
			resultado = 1;
			return resultado;

		} else if ((saqueCPU == 1 && saqueUSER == 3) || (saqueCPU == 2 && saqueUSER == 1)
				|| (saqueCPU == 3 && saqueUSER == 2)) {
			resultado = 2;
			return resultado;

		} else {
			resultado = 3;
			return resultado;

		}
	}
}
