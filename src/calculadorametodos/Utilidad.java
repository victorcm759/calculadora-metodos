package calculadorametodos;

import java.util.Scanner;

public class Utilidad {

    public Scanner sc;

    public Utilidad() {
        sc = new Scanner(System.in);
    }

    public int introducirValorEntero() {
        int num = 0;
        System.out.println("Introduce un n�mero: ");
        if (!sc.hasNextInt()) {
            System.out.println("Tiene que ser un n�mero entero");
        } else if (num < 0) {
            System.out.println("Tiene que ser un n�mero positivo");
        }
        num = sc.nextInt();
        return num;
    }

}
