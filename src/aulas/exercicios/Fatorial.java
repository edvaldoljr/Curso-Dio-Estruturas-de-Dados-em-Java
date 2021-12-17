package aulas.exercicios;

import java.util.Scanner;

/**
 * Faça uma algoritmo que calcule a fatorial de um número inteiro
 * fornecido pelo usuário
 * EX: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int fatorial;

        System.out.println("Digite um número para calcularmos o FATORIAL: ");
        fatorial = scan.nextInt();

        int multiplicacao = 1;
        for (int i = 5 ; i >= 1 ; i--) {
           multiplicacao = multiplicacao * i;
        }
        System.out.printf("Fatorial de %d! = %d", fatorial, multiplicacao);
    }
}
