package aulas.exercicios;

import java.util.Scanner;

/**
 *Construa um algoritmo que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso valor estiver invalido e
 * continue, pedindo até que o usuário informe um valor válido.
 **/
public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor entre zero e dez: ");
        n = scan.nextInt();

        while (n < 0 || n > 10 ) {
            System.out.println("Nota inválida digite novamente: ");
            n = scan.nextInt();
        }
        System.out.println("Nota válida");
    }
}
