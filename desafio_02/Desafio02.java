package desafio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Trabalho com centavos (valores inteiros) em vez de trabalhar com 
        // valores quebrados.
        double v = scanner.nextDouble();
        long valor = Math.round(v * 100);

        List<Integer> notas = new ArrayList<>(List.of(10000, 5000, 2000, 1000, 500, 200));
        List<Integer> moedas = new ArrayList<>(List.of(100, 50, 25, 10, 5, 1));

        System.out.println("NOTAS:");

        while (valor > 100 && notas.size() > 0) {

            int nota = notas.remove(0);
            long quantidade = valor / nota;
            valor -= quantidade * nota;


            System.out.printf("%d nota(s) de R$ %d,00\n", quantidade, (nota / 100));
        }

        System.out.println("\nMOEDAS:");

        while (valor > 0) {

            int moeda = moedas.remove(0);
            long quantidade = valor / moeda;
            valor -= quantidade * moeda;

            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade, (moeda / 100.0));
        }

    }
}
