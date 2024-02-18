package MIND;

import java.util.Scanner;

public class MIND {
    public void inicio(Scanner in) {
        int contador = 1;
        MIND game = new MIND();
        System.out.println("¡Bienvenido a Mastermind!");

        System.out.print("J1 - Introduce tu número: ");
        int inNumber = in.nextInt();
        Numero numeroJ1 = new Numero(inNumber);

        System.out.print("J2 - Introduce tu número: ");
        inNumber = in.nextInt();
        Numero numeroJ2 = new Numero(inNumber);

        String numTry;
        boolean isGuessed;
        do {
            if (contador % 2 != 0) {
                System.out.print("J1: ");
            } else {
                System.out.print("J2: ");
            }
            numTry = in.next();
            isGuessed = game.isGuessed(numTry, numeroJ1, numeroJ2);
            contador= comprarar(contador, numTry, numeroJ1, numeroJ2);
        } while (!isGuessed);
    }
    public boolean isGuessed(String numTry, Numero numeroJ1, Numero numeroJ2) {
        boolean isNumGuessed = false;
        if (Integer.parseInt(numTry) == numeroJ2.getDigitos()) {
            isNumGuessed = true;
            System.out.println("J1 - Ganó");
        } else if (Integer.parseInt(numTry) == numeroJ1.getDigitos()) {
            isNumGuessed = true;
            System.out.println("J2 - Ganó");
        }
        return isNumGuessed;
    }

    public int comprarar(int contador, String numTry, Numero numeroJ1, Numero numeroJ2) {
        int vistos = 0;
        int aciertos = 0;

        if (contador % 2 != 0) {
            for (int i = 0; i < 4; i++) {
                String aux = "" + numTry.charAt(i);
                if (String.valueOf(numeroJ2.getDigitos()).indexOf(aux) == numTry.indexOf(aux)) {
                    aciertos++;
                } else if (String.valueOf(numeroJ2.getDigitos()).contains(aux)) {
                    vistos++;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                String aux = "" + numTry.charAt(i);
                if (String.valueOf(numeroJ1.getDigitos()).indexOf(aux) == numTry.indexOf(aux)) {
                    aciertos++;
                } else if (String.valueOf(numeroJ1.getDigitos()).contains(aux)) {
                    vistos++;
                }
            }
        }
        contador++;
        System.out.println("Vistos: " + vistos + "\nAciertos: " + aciertos + "\n");
        return contador;
    }
}
