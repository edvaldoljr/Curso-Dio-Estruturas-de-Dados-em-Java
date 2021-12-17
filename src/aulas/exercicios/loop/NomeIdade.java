package aulas.exercicios.loop;

import java.util.Scanner;

/**
*Faça um programa que leia duas variáveis, a primeira representando o nome do aluno,
*a segunda variável será sua idade.
*(Pare o programa inserindo o valor 0 no campo nome)
 **/
public class NomeIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")){
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }
        System.out.println("Parando....");
    }
}
