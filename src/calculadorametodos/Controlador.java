package calculadorametodos;

import java.util.Random;

public class Controlador {
    
    public Utilidad ut;
    public Operacion op;
    
    public Controlador() {
        ut = new Utilidad();
        op = new Operacion();
    }

    public void sumar() {
        int num1 = ut.introducirValorEntero();
        int num2 = ut.introducirValorEntero();
        int resultado = op.sumar(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultado);
    }

    public void restar() {
        int num1 = ut.introducirValorEntero();
        int num2 = ut.introducirValorEntero();
        int resultado = op.restar(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultado);
    }

    public void multiplicar() {
        int num1 = ut.introducirValorEntero();
        int num2 = ut.introducirValorEntero();
        double resultado = op.multiplicar(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultado);
    }

    public void dividir() {
        int num1 = ut.introducirValorEntero();
        int num2 = ut.introducirValorEntero();
        if (num1 == 0 || num2 == 0) {
            System.out.println("¡No se puede dividir entre 0!");
        } else {
            double resultado = op.dividir(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        }
    }

    void factorial() {
        int num = ut.introducirValorEntero();
        int resultado = op.factorial(num);
        System.out.println(num + "! = " + resultado);
    }

    void numeroPrimo() {
        int num = ut.introducirValorEntero();
        boolean resultado = op.numeroPrimo(num);
        System.out.println("¿" + num + " es primo? " + resultado);
    }

    void esPar() {
        int num = ut.introducirValorEntero();
        boolean resultado = op.esPar(num);
        System.out.println("¿" + num + " es par? " + resultado);
    }

    void yearBisiesto() {
        int year = ut.introducirValorEntero();
        boolean resultado = op.yearBisiesto(year);
        System.out.println("¿" + year + " es bisiesto? " + resultado);
    }

    void raizCuadrada() {
        int num = ut.introducirValorEntero();
        double resultado = Math.sqrt(num);
        System.out.println("La raíz cuadrada de " + num + " es: " + resultado);
    }

    void numAleatorio() {
        Random rnd = new Random();
        int from = ut.introducirValorEntero();
        int to = ut.introducirValorEntero();
        if ((from < 0 || to < 0) && to > from) {
            int num = rnd.nextInt(to - from + 1) + from;
            System.out.println("Número generado: " + num);
        } else {
            System.out.println("No se ha podido generar un número");
        }
    }

    void tablaMultiplicar() {
        int num = ut.introducirValorEntero();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " * " + num + " = " + (num * i));
        }
    }

    void matrizMultiplicar() {
        int valor = ut.introducirValorEntero();
        int [][] matriz = new int [valor][valor];
        op.llenarMatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - 1) {
                    System.out.print(matriz[i][j] + "\n");
                } else {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
    }

    void numMayorYMenor() {
        int num1 = ut.introducirValorEntero();
        int num2 = ut.introducirValorEntero();
        int resultado = op.numMayorYMenor(num1, num2);
        switch (resultado) {
            case -1:
                System.out.println(num1 + " es menor que " + num2);
                break;
            case 1:
                System.out.println(num1 + " es mayor que " + num2);
                break;
            default:
                System.out.println("Ambos números son iguales");
                break;
        }
    }
    
}
