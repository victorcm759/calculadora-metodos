package calculadorametodos;

import java.util.Scanner;

public class CalculadoraGestion {
    public Controlador co;
    public Scanner sc;
    
    public CalculadoraGestion() {
        co = new Controlador();
        sc = new Scanner(System.in);
    }

    public void menu() {
        boolean continuar = true;
        int opcion = 0;
        do {
            System.out.println("MENÚ DE OPCIONES\n"
                    + "\t1. Sumar\n"
                    + "\t2. Restar\n"
                    + "\t3. Multiplicar\n"
                    + "\t4. Dividir\n"
                    + "\t5. Factorial\n"
                    + "\t6. Número primo\n"
                    + "\t7. Par o impar\n"
                    + "\t8. Año bisiesto\n"
                    + "\t9. Raíz cuadrada\n"
                    + "\t10. Números aleatorios\n"
                    + "\t11. Tabla de multiplicar\n"
                    + "\t12. Matriz de multiplicación\n"
                    + "\t13. Mayor y menor\n"
                    + "\t99. Salir");
            System.out.print("Introduzca una opción: ");
            if (!sc.hasNextInt()) {
                System.out.println("¡Tiene que ser un número entero!");
                sc.nextLine();
            }
            if (opcion < 0) {
                System.out.println("¡Tiene que ser un número positivo!");
                sc.nextLine();
            }
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    co.sumar();
                    break;
                case 2:
                    co.restar();
                    break;
                case 3:
                    co.multiplicar();
                    break;
                case 4:
                    co.dividir();
                    break;
                case 5:
                    co.factorial();
                    break;
                case 6:
                    co.numeroPrimo();
                    break;
                case 7:
                    co.esPar();
                    break;
                case 8:
                    co.yearBisiesto();
                    break;
                case 9:
                    co.raizCuadrada();
                    break;
                case 10:
                    co.numAleatorio();
                    break;
                case 11:
                    co.tablaMultiplicar();
                    break;
                case 12:
                    co.matrizMultiplicar();
                    break;
                case 13:
                    co.numMayorYMenor();
                    break;
                case 99:
                    System.out.println("¡Adiós!");
                    continuar = false;
                    break;
                default:
                    System.out.println("¡Opción no válida o no implementada!");
                    break;
            }
        } while (continuar);
    }
    
}
