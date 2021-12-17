package aulas.exercicios;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int count = 1;

        System.out.printf("Informe o número para a tabuada de 1 a 10: ");
        numero = scan.nextInt();

        if (numero > 0 && numero <= 10) {
            System.out.printf("\n+--Resultado--+\n");
            for (count = 1; count <= 10; count++) {
                System.out.printf("| %2d * %d = %2d |\n", count, numero, (count * numero));
            }
            System.out.printf("+-------------+\n");
        } else {
            System.out.println("Numero não aceito");
        }
    }
}
