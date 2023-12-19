package br.com.tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Teste01Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String teste;
        boolean preencherNovamente = true;

        while (preencherNovamente) {
            try {
                String nome;
                String apelido;
                int idade;
                long cpf;
                double altura;
                System.out.println("Digite o seu nome: ");
                nome = sc.nextLine();
                // Verificação do nome.
                if (nome.matches("[a-zA-Z ]+")) {
                    System.out.println("Digite o nome que gostaria de ser chamado(a) ");
                    apelido = sc.nextLine();
                    System.out.printf("Esta certo %s qual seria a sua idade? \n", apelido);
                    idade = sc.nextInt();
                    System.out.println("E a sua altura?");
                    altura = sc.nextDouble();

                    System.out.println("Dados Cadastrais");
                    System.out.println("Meu nome é " + nome.toUpperCase());
                    System.out.printf("Apelido: %s \n", apelido.toUpperCase());
                    System.out.println("Minha idade é " + idade + " anos ");
                    System.out.println("Minha altura é " + altura);

                    System.out.println("Os dados estão corretos, Digite S ou N");
                    String resposta = sc.next();
                    if (resposta.equalsIgnoreCase("S")) {
                        System.out.println("Obrigado por chegar até aqui.");
                        preencherNovamente = false;
                    }else if (resposta.equalsIgnoreCase("N")){
                        sc.nextLine();
                        System.out.println("Ok, vamos preencher novamente..");
                    }else {
                        System.out.println("Opção invalidade. Vamos preencher novamente..");
                        sc.nextLine();
                    }


                } else {
                    System.err.println("Nome inválido! Digite somente letras e espaços.");

                }
            } catch (InputMismatchException e) {
                System.err.println("O campos idade e altura precisam ser numéricos");
            }
        }

        sc.close();
    }
}
