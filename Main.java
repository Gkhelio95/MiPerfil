package TareaEvaluable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[] numeroAleatorio = {5, 12, 18, 7, 20};
        boolean acerto = false;

        System.out.println("¡Bienvenido a \"Adivina el Número Secreto\"!");
        Thread.sleep(2000);
        limpiarPantalla();

        System.out.println("Intenta adivinar un número entre 1 y 20. Tienes 3 intentos.");
        Thread.sleep(2000);
        limpiarPantalla();

        for (int intento = 1; intento <= 3; intento++) {
            int numeroUsuario = 0;
            boolean entradaValida = false;
            
            // Pedir al usuario que ingrese un número hasta que la entrada sea válida
            while (!entradaValida) {
                System.out.print("Intento " + intento + " - Introduce tu número: ");
                try {
                    numeroUsuario = scanner.nextInt(); // Intentar leer un número
                    if (numeroUsuario < 1 || numeroUsuario > 20) {
                        System.out.println("Por favor, introduce un número entre 1 y 20.");
                    } else {
                        entradaValida = true; // Si la entrada es válida, salir del bucle
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Debes introducir un número.");
                    scanner.nextLine(); // Limpiar el buffer
                }
            }

            for (int numero : numeroAleatorio) {
                if (numeroUsuario == numero) {
                    acerto = true;
                    break;
                }
            }

            if (acerto) {
                System.out.println("¡Correcto! Has adivinado un número secreto.");
                break;
            } else if (intento < 3) {
                System.out.println("No has acertado. Intenta de nuevo.");
            }
        }

        if (!acerto) {
            System.out.println("Lo siento, no adivinaste ningún número secreto.");
            System.out.print("Los números eran: [");
            for (int i = 0; i < numeroAleatorio.length; i++) {
                System.out.print(numeroAleatorio[i]);
                if (i < numeroAleatorio.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
