import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n MENU ")
            System.out.println("1. Jugar con 2 dados");
            System.out.println("2. Jugar con 3 dados");
            System.out.println("3. Calcular IMC");
            System.out.println("4. (Vacío)");
            System.out.println("5. (Vacío)");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    jugarDosDados();
                    break;
                case 2:
                    jugarTresDados();
                    break;
                case 3:
                    IMC();
                    break;
                case 4:
                    System.out.println("Opción 4 aún no tiene nada");
                    break;
                case 5:
                    System.out.println("Opción 5 aún no tiene nada");
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 6);

        entrada.close();
    }

    public static void jugarDosDados() {
        Random aleatorio = new Random();
        int total1 = 0, total2 = 0;

        for (int ronda = 1; ronda <= 20; ronda++) {
            int d1 = aleatorio.nextInt(6) + 1;
            int d2 = aleatorio.nextInt(6) + 1;
            total1 += d1;
            total2 += d2;
            System.out.println("Ronda " + ronda + ": Dado1=" + d1 + " | Dado2=" + d2);
        }

        System.out.println("\nResultado final:");
        System.out.println("Total Dado1: " + total1);
        System.out.println("Total Dado2: " + total2);

        if (total1 > total2) {
            System.out.println("Ganó el Dado 1");
        } else if (total2 > total1) {
            System.out.println("Ganó el Dado 2");
        } else {
            System.out.println("Empate");
        }
    }

    public static void jugarTresDados() {
        Random aleatorio = new Random();
        int total1 = 0, total2 = 0, total3 = 0;

        for (int ronda = 1; ronda <= 20; ronda++) {
            int d1 = aleatorio.nextInt(6) + 1;
            int d2 = aleatorio.nextInt(6) + 1;
            int d3 = aleatorio.nextInt(6) + 1;
            total1 += d1;
            total2 += d2;
            total3 += d3;
            System.out.println("Ronda " + ronda + ": D1=" + d1 + " | D2=" + d2 + " | D3=" + d3);
        }

        System.out.println("\nResultado final:");
        System.out.println("Total Dado1: " + total1);
        System.out.println("Total Dado2: " + total2);
        System.out.println("Total Dado3: " + total3);

        if (total1 > total2 && total1 > total3) {
            System.out.println("Ganó el Dado 1");
        } else if (total2 > total1 && total2 > total3) {
            System.out.println("Ganó el Dado 2");
        } else if (total3 > total1 && total3 > total2) {
            System.out.println("Ganó el Dado 3");
        } else {
            System.out.println("Hubo empate");
        }
    }

    public static void IMC() {
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingresa tu peso (kg): ");
        double peso = datos.nextDouble();
        System.out.print("Ingresa tu altura (m): ");
        double altura = datos.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println ("Tu IMC es:");

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 26.9) {
            System.out.println("Sobrepeso de grado 1");
        } else if (imc >= 27 && imc <= 29.9){
            System.out.println("Sobrepeso de grado 2");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidad de tipo 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidad de tipo 2");
        } else if (imc >= 40 && imc <= 49.0) {
            System.out.println("Obesidad de tipo 3 (morbida)");
        } else if (imc > 50) {
            System.out.println("Obesidad de tipo 4 (Extrema)");
        }else{
            System.out.println("Obesidad extrema ");
        }
    }
}
