package MIND;

import java.util.Scanner;

public class MIND {
    public void inicio(Scanner in) {
        int contador = 1;
        MIND game = new MIND();
        //TODO Hacer CPU
        System.out.println("¡Bienvenido a Mastermind!");

        System.out.print("J1 - Introduce tu número: ");
        String inNumber = in.next();
        String numeroJ1 = inNumber;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("J2 - Introduce tu número: ");
        inNumber = in.next();
        String numeroJ2 = inNumber;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
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
            contador = comprarar(contador, numTry, numeroJ1, numeroJ2);
        } while (!isGuessed);
    }

    public boolean isGuessed(String numTry, String numeroJ1, String numeroJ2) {
        boolean isNumGuessed = false;
        if (numTry.equals(numeroJ2)) {
            isNumGuessed = true;
            System.out.println("J1 - Ganó");
        } else if (numTry.equals(numeroJ1)) {
            isNumGuessed = true;
            System.out.println("J2 - Ganó");
        }
        return isNumGuessed;
    }

    public int comprarar(int contador, String numTry, String numeroJ1, String numeroJ2) {
        int vistos = 0;
        int aciertos = 0;

        if (contador % 2 != 0) {
            for (int i = 0; i < numTry.length(); i++) {
                String[] nums = numTry.split("");
                if (numeroJ2.indexOf(nums[i]) == numTry.indexOf(nums[i])) {
                    aciertos++;
                } else if (numeroJ2.contains(nums[i])) {
                    vistos++;
                }
            }
        } else {
            for (int i = 0; i < numTry.length(); i++) {
                String[] nums = numTry.split("");
                if (numeroJ1.indexOf(nums[i]) == numTry.indexOf(nums[i])) {
                    aciertos++;
                } else if (numeroJ1.contains(nums[i])) {
                    vistos++;
                }
            }
        }
        contador++;
        System.out.println("Vistos: " + vistos + "\nAciertos: " + aciertos + "\n");
        return contador;
    }
}
