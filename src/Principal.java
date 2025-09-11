import java.util.Random;
import java.util.Scanner;

public class Principal {
    private static Object Carreraentredosjugadore;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n MENU ");
            System.out.println("1. Jugar con 2 dados");
            System.out.println("2. Jugar con 3 dados");
            System.out.println("3. Calcular IMC");
            System.out.println("4. Adivina el numero");
            System.out.println("5. Carrera entre dos jugadores");
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
                    AdivinaelNumero();
                    break;
                case 5:
                    Carreraentredosjugadore();
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


    public static void AdivinaelNumero() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int intento;

        System.out.println(" Bienvenido al juego de Adivinar el Número ");
        System.out.println("Piensa un número entre 1 y 50. ¡Adivina cuál es!");

        do {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es más grande ");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es más pequeño ");
            } else {
                System.out.println("Has adivinado el número");
            }
        } while (intento != numeroSecreto);

    }
    public static void Carreraentredosjugadore() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random ();

        int c1 = 0;
        int c2 = 0;
        int meta = 50;

        System.out.println("Bienvenidos al juego de las carreras");
        System.out.println("¡Ha ganar!");

        while (c1 < meta && c2 < meta) {

            int dado1 = random.nextInt(6) + 1;
            if (dado1 == 6) {
                c1 -= 2;
            } else if (dado1 == 3) {
                c1 += 3;
            } else {
                c1 += dado1;
            }
            if (c1 < 0) c1 = 0;

            int dado2 = random.nextInt(6) + 1;
            if (dado2 == 6) {
                c2 -= 2;
            } else if (dado2 == 3) {
                c2 += 3;
            } else {
                c2 += dado2;
            }
            if (c2 < 0) c2 = 0;


            System.out.println("Corredor 1 lanzó " + dado1 + "  pasos: " + c1);
            System.out.println("Corredor 2 lanzó " + dado2 + " pasos: " + c2);

        }


        if (c1 >= meta && c2 >= meta) {
            System.out.println("¡Empate! Ambos corredores llegaron a la meta.");
        } else if (c1 >= meta) {
            System.out.println("Corredor 1 gana la carrera con " + c1 + " pasos!");
        } else {
            System.out.println("¡Corredor 2 gana la carrera con " + c2 + " pasos!");
        }
    }
}

