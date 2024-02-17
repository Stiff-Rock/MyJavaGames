package HANOI;

import java.util.Scanner;
import java.util.Stack;

//@Autor:Yago Pernas Gómez
public class HANOI {
	// Inicializamos los 3 stacks que representan el palo a,b y c.
	Stack<Integer> paloA = new Stack<>();
	Stack<Integer> paloB = new Stack<>();
	Stack<Integer> paloC = new Stack<>();
	// Creamos las variables "final int piezaX" ya que son valores constantes que
	// vamos a usar
	// a lo largo del el código y no queremos que puedan ser modificados
	final int pieza3 = 3; // Pieza "3" que se corresponde con la mas grande (la última)
	final int pieza2 = 2; // Pieza "2" que se corresponde con la mediana
	final int pieza1 = 1; // Pieza "1" que se corresponde con la pequeña (la primera)

	public void inicio(Scanner in) {
		HANOI hanoi = new HANOI();
		hanoi.paloA.push(hanoi.pieza3);
		hanoi.paloA.push(hanoi.pieza2);
		hanoi.paloA.push(hanoi.pieza1);
		// Se añaden todas las piezas al palo A en el órden correspondiente
		System.out.println(
				"Se deberá introducir el palo de donde se quiere coger la pieza y el palo donde se quiere depositar. \nPor ejemplo 'A B' cogera la ultima pieza del palo A y la apilará den el palo B.\nEl resultado final deberá ser las piezas colocadas de mayor a menor.");
		int numMov = 0;
		while (!hanoi.isStackedInC()) {
			hanoi.print(numMov);
			hanoi.movimiento(in);
			// Bucle que ejecuta el juego mientras no se consiga apilar todas las piezas
			// correctamente en el palo C

			numMov++;
		}
		hanoi.print(numMov);
		System.out.println("¡Lo completaste!");
	}

	void print(int numMov) {
		// Método encargado de imprimir la pantalla de juego con las piezas, los palos y
		// el número de movimientos. Los stacks se visualizarán horizontalmente, por lo
		// que la izquierda del todo del palo sería igual que abajo del todo del palo

		// Imprimimos cada palo y el número de movimientos
		System.out.println("A:" + paloA.toString());
		System.out.println("B:" + paloB.toString());
		System.out.println("C:" + paloC.toString());
		System.out.println("LLevas " + numMov + " movimientos.");
	}

	boolean isStackedInC() {
		boolean isStackedInC = false;
		// Método que comprueba en cada ronda si se ha cumplido la condición de
		// victoria, siendo que las piezas esten apiladas correctamente en el palo C
		Stack<Integer> paloFinal = new Stack<>();
		paloFinal.push(pieza3);
		paloFinal.push(pieza2);
		paloFinal.push(pieza1);
		// paloFinal servira como modelo de comparación de la forma en la que debrian
		// acabar colocadas
		// las piezas en el palo C para considerarlo una victoria
		if (paloA.isEmpty() && paloC.equals(paloFinal)) {
			isStackedInC = true;
		}
		return isStackedInC;
	}

	void movimiento(Scanner in) {
		// Método que interactua con el usuario para que introduzca los movimientos que
		// desea realizar. También comprobará si los movimientos son válidos.
		// Consistirá en un bucle que se repite hasta que se introduzcan movimientos
		// válidos

		// pila a otra

		boolean isPopValid = true;
		boolean isPushValid = true;
		int aux = 0; // Valor auxiliar que nos va permitir transportar el elemento escogido de una
		do {
			System.out.print("Introduce de donde quieres sacar: ");
			String paloPop = in.next(); // Palo del que se quiere sacar
			// Según lo introducido, se quita la pieza correspondiente si es legal
			if (paloPop.equalsIgnoreCase("A") && !paloA.isEmpty()) {
				aux = paloA.pop();
			} else if (paloPop.equalsIgnoreCase("B") && !paloB.isEmpty()) {
				aux = paloB.pop();
			} else if (paloPop.equalsIgnoreCase("C") && !paloC.isEmpty()) {
				aux = paloC.pop();
			} else {
				System.out.println("Movimiento no válido");
				isPopValid = false;
			}
		} while (!isPopValid);
		do {
			System.out.print("Introduce donde quieres introducir: ");
			String paloPush = in.next(); // Palo en el que se quiere apilar
			// Según lo introducido, se apila la pieza correspondiente si es legal, luego
			// comprueba si está vacio para poder comprobar el primero elemento en caso de
			// que no. Si el elemento a introducir es menor al elemento ya existente, se
			// permite la acción.
			if (paloPush.equalsIgnoreCase("A")) {
				if (paloA.isEmpty() || aux < paloA.peek()) {
					paloA.push(aux);
				} else {
					System.out.println("Movimiento no válido");
					isPushValid = false;
				}
			} else if (paloPush.equalsIgnoreCase("B")) {
				if (paloB.isEmpty() || aux < paloB.peek()) {
					paloB.push(aux);
				} else {
					System.out.println("Movimiento no válido");
					isPushValid = false;
				}
			} else if (paloPush.equalsIgnoreCase("C")) {
				if (paloC.isEmpty() || aux < paloC.peek()) {
					paloC.push(aux);
				} else {
					System.out.println("Movimiento no válido");
					isPushValid = false;
				}
			} else {
				System.out.println("Movimiento no válido");
				isPushValid = false;
			}
		} while (!isPushValid);
	}
}
