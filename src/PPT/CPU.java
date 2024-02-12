package PPT;

import java.util.Random;

public class CPU {
	static Random numaleatorio = new Random();

	public static int normal() {
		int saqueCPU;
		int selecSaque = numaleatorio.nextInt(3);

		if (selecSaque == 0) {
			saqueCPU = 1;
		} else if (selecSaque == 1) {
			saqueCPU = 2;
		} else {
			saqueCPU = 3;
		}

		return saqueCPU;
	}

	public static int dificil(int saqueUSER) {
		int contadorPiedra = 0;
		int contadorPapel = 0;
		int contadorTijera = 0;
		int contadorSaques = 0;
		int saqueCPU;
		int randomAccion = numaleatorio.nextInt(2);

		if (saqueUSER == 1) {
			contadorPiedra++;
		} else if (saqueUSER == 2) {
			contadorPapel++;
		} else {
			contadorTijera++;
		}

		contadorSaques += contadorPiedra + contadorPapel + contadorTijera;
		double porcentajePiedra = (contadorPiedra / contadorSaques) * 100;
		double porcentajePapel = (contadorPapel / contadorSaques) * 100;
		double porcentajeTijera = (contadorTijera / contadorSaques) * 100;

		if (randomAccion == 0) {
			if ((porcentajePiedra > porcentajePapel) && (porcentajePiedra > porcentajeTijera)) {
				saqueCPU = 2;
			} else if ((porcentajePapel > porcentajePiedra) && (porcentajePapel > porcentajeTijera)) {
				saqueCPU = 3;
			} else if ((porcentajeTijera > porcentajePapel) && (porcentajeTijera > porcentajePiedra)) {
				saqueCPU = 1;
			} else {
				int selecSaque = numaleatorio.nextInt(3);

				if (selecSaque == 0) {
					saqueCPU = 1;
				} else if (selecSaque == 1) {
					saqueCPU = 2;
				} else {
					saqueCPU = 3;
				}
			}
		} else {
			int selecSaque = numaleatorio.nextInt(3);

			if (selecSaque == 0) {
				saqueCPU = 1;
			} else if (selecSaque == 1) {
				saqueCPU = 2;
			} else {
				saqueCPU = 3;
			}
		}
		return saqueCPU;
	}

	public static int imposible(int saqueUSER) {
		int saqueCPU;

		if (saqueUSER == 1) {
			saqueCPU = 2;
		} else if (saqueUSER == 2) {
			saqueCPU = 3;
		} else {
			saqueCPU = 1;
		}

		return saqueCPU;
	}

}
