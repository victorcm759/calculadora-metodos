package calculadorametodos;

public class Operacion {
    public Utilidad ut;
    public int resultado;
    public Operacion() {
        ut = new Utilidad();
    }

    int sumar(int num1, int num2) {
        return resultado = num1 + num2;
    }

    int restar(int num1, int num2) {
        return resultado = num1 - num2;
    }

    double multiplicar(int num1, int num2) {
        return resultado = num1 * num2;
    }

    double dividir(int num1, int num2) {
        return resultado = num1 / num2;
    }

    int factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    boolean numeroPrimo(int num) {
        return num % num == 1 && num % 1 == 0;
    }

    boolean esPar(int num) {
        return num % 2 == 0;
    }

    boolean yearBisiesto(int year) {
        return year % 4 == 0 || (year % 100 != 0 && year % 400 == 0);
    }

    void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i+1) * (j+1);
            }
        }
    }

    int numMayorYMenor(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num2 > num1) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
