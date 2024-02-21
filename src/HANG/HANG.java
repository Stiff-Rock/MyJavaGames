package HANG;

import java.util.Scanner;

public class HANG {
    //TODO se elige la palabra aleatoriamente en el constructor y se saca la palabra del array y la metes en una variable propia
    private final String palabra = "perro"; // TODO hacer array
    private int numIntentos;

    public void mostrarInfo() {

        System.out.println("Te quedan " + numIntentos + " intentos");
    }

    public boolean adivinarPalabra() {
        boolean isGuessed = false;
        return isGuessed;
    }

    public void inicio(Scanner in) {
        numIntentos = 5;
        System.out.println("¡Bienvenido al Ahorcado!");
        do {


        } while (!adivinarPalabra() || numIntentos > 0);
        if (adivinarPalabra()) {
            System.out.println("¡Adivinaste la palabra!");
        }
        if (numIntentos == 0) {
            System.out.println("La palabra era: " + palabra);
        }
    }
}
