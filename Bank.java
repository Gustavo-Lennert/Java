package java_projects;

import java_projects.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

        Scanner rcb = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;

        int option;

        System.out.print("\n-- Este programa tem a função de simular a criação de uma conta bancária, com as funções de saque e depósito --\n\n");

        System.out.print("Insira seu nome: ");
        String name = rcb.nextLine();

        System.out.print("Inisira o número de sua conta bancária: ");
        int numAcct = rcb.nextInt();

        System.out.print("Deseja inserir um valor de depósito inicial (s/n)? ");
        char response = rcb.next().charAt(0);

        if(response == 's' || response == 'S'){
            System.out.print("Inisira o valor de depósito inicial: ");
            double depositInit = rcb.nextDouble();
            account = new Account(numAcct, name, depositInit);
        }else{
            account = new Account(numAcct, name);
        }


        System.out.println("\n\nDados da conta:");
        System.out.println(account.toString());

        do{
            System.out.print("\nSelecione a opção da ação que deseja realizar: \nDepositar[1]   Sacar[2]\n");
            option = rcb.nextInt();

            switch(option){

                case 1:
                    System.out.print("Insira um valor de depósito: ");
                    double depositValue = rcb.nextDouble();
                    account.deposit(depositValue);
                    break;

                case 2:
                    System.out.print("Insira um valor para saque: ");
                    double withdrawValue = rcb.nextDouble();
                    account.withdraw(withdrawValue);
                    break;

                default:
                    System.out.print("Opção inválida!");
                    break;
            }
        }while(option != 1 && option != 2);

        System.out.println("\nDados da conta:");
        System.out.println(account.toString());

       rcb.close();
    }
}
