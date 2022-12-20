package desafio_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        pares.forEach(System.out::println);
        impares.forEach(System.out::println);
    }

}
