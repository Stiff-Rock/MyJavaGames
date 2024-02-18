package INDEX;

import MIND.MIND;
import HANG.HANG;
import HANOI.HANOI;
import PPT.PPT;
import TER.TER;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PPT piedraPapelTijera = new PPT();
        TER tresEnRaya = new TER();
        HANOI hanoi = new HANOI();
        HANG ahoracado = new HANG();
        MIND mastermind = new MIND();

        int eleccion;

        do {
            System.out.println("1. PiedraPapelTijera");
            System.out.println("2. TresEnRaya");
            System.out.println("3. Ahorcado");
            System.out.println("4. Hanoi");
            System.out.println("5. Mastermind");
            System.out.println("6. Salir");
            System.out.print("Elige: ");

            eleccion = in.nextInt();

            switch (eleccion) {
                case 1:
                    piedraPapelTijera.inicio(in);
                    break;
                case 2:
                    tresEnRaya.inicio(in);
                    break;
                case 3:
                    ahoracado.inicio(in);
                    break;
                case 4:
                    hanoi.inicio(in);
                    break;
                case 5:
                    mastermind.inicio(in);
                    break;
                case 6:
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("Por favor, escoje una opción válida:");
                    break;
            }
        } while (eleccion != 6);
        in.close();
    }
}
