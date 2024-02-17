package HANG;

import java.util.Scanner;

public class HANG {
    //TODO se elige la palabra aleatoriamente en el constructor y se saca la palabra del array y la metes en una variable propia
    private String palabra = "perro";
    private int numIntentos = 5;
    public void mostrarInfo(){

        System.out.println("Te quedan " + numIntentos + " intentos");
    }

    public boolean adivinarPalabra(){
    boolean isGuessed = false;
        return isGuessed;
    }

    public void inicio(Scanner in) {
        System.out.println("¡Bienvenido al Ahorcado!");

        do{

            if(adivinarPalabra()){
                System.out.println("¡Adivinaste la palabra!");
            }

        } while(!adivinarPalabra() || numIntentos > 0);
        if (numIntentos == 0){
            System.out.println("La palabra era: " + palabra);
        }
    }
}
