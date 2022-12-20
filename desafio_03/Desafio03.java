package desafio_03;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int numeroDePares = 0;
        int esquerda = 0;
        int direita = 1;

        while (direita < n) {
            int diferenca = arr[direita] - arr[esquerda];
            if (diferenca == k) {
                numeroDePares++;
                direita++;
            } else if (diferenca < k) {
                direita++;
            } else {
                esquerda++;
            }
        }

        System.out.println(numeroDePares);
    }


}
