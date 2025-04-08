package TareaEvaluable;
import java.util.Scanner;

public class juego {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[] numeroAleatorio = new int[5];
        numeroAleatorio[0] = 5;
        numeroAleatorio[1] = 12;
        numeroAleatorio[2] = 18;
        numeroAleatorio[3] = 7;
        numeroAleatorio[4] = 20;
        
        scanner.close();

        System.out.println("¡Bienvenido a \"Adivina el Número Secreto\"!");
        Thread.sleep(2000);
        limpiarPantalla();

        System.out.println("Intenta adivinar un número entre 1 y 20. Tienes 3 intentos.");
        Thread.sleep(2000);
        limpiarPantalla();

        System.out.print("Introduce tu número: ");
        int numeroUsuario = scanner.nextInt();

        boolean acerto = false;

        for (int i = 0; i < numeroAleatorio.length; i++) {
            if (numeroUsuario == numeroAleatorio[i]) {
                acerto = true;
                break;
            }
        }

        if (acerto) {
            System.out.println("¡Correcto! Has adivinado un número secreto.");
        } else {
            System.out.println("Lo siento, no adivinaste ningún número secreto.");
            System.out.println("Los números eran: [5, 12, 18, 7, 20]");
        }
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
