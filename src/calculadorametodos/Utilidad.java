package calculadorametodos;

import java.util.Scanner;

public class Utilidad {

    public Scanner sc;

    public Utilidad() {
        sc = new Scanner(System.in);
    }

    public int introducirValorEntero() {
        int num = 0;
        System.out.println("Introduce un número: ");
        if (!sc.hasNextInt()) {
            System.out.println("Tiene que ser un número entero");
        } else if (num < 0) {
            System.out.println("Tiene que ser un número positivo");
        }
        num = sc.nextInt();
        return num;
    }

}
