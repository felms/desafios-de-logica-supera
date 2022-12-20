package desafio_04;

import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] frases = new String[n];

        for (int i = 0; i < n; i++) {
            frases[i] = scanner.nextLine();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            String s = frases[i];
            String esquerda = new StringBuilder(s.substring(0, s.length() / 2))
                    .reverse().toString();
            String direita = new StringBuilder(s.substring(s.length() / 2))
                    .reverse().toString();

            System.out.println(esquerda + direita);
        }
    }
}
