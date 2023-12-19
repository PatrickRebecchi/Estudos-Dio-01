package br.com.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class TryCatch {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = sc.next();
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite a sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Minha idade é " + idade + " anos ");
            System.out.println("Minha altura é " + altura);
        }
        catch (InputMismatchException e){
            System.err.println("O campos idade e altura precisam ser numéricos");
        }
    }
}
