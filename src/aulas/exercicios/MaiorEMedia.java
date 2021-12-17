package aulas.exercicios;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia 5 números
 * e informe o maior número e a
 * média desses números.
 */
public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int count = 1;

        do {
            System.out.println("Numero " + count + ":");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) {
                maior = numero;
            }

            count++;
        } while (count < 6);

        System.out.println("Maior número digitado: " + maior);
        System.out.println("A media dos valores é: " + soma / 5);

    }
}
