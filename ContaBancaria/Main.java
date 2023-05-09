package ContaBancaria;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt, acao;
        String exit;

        ContaBancaria cb = new ContaBancaria(1, "Gustavo", 150.80);
        ContaBancaria cc = new ContaCorrente(2, "Gustavo", 210.50);
        ContaBancaria cp = new ContaPoupanca(3, "Gustavo", 300.60);

        System.out.println("\n- Este programa simula transações de saque e depósito em contas bancárias de poupança e corrente -");
        do {
            System.out.printf("\nSelecione a opção de conta que gostaria de executar as ações - [1]Conta Corrente / [2]Conta Poupança: ");
            opt = input.nextInt();

            switch(opt){
                case 1:
                    do {
                        System.out.printf("\nSelecione a ação que quer executar [1]Depósito / [2]Saque / [3]Exibir saldo / [4]Sair: ");
                        acao = input.nextInt();

                        switch(acao){
                            case 1:
                                System.out.printf("\nInsira o valor de depósito (Mínimo - R$50.00): ");
                                cc.depositar(input.nextDouble());
                                break;

                            case 2:
                                System.out.printf("\nInsira o valor de saque (Máximo - R$ -50.00): ");
                                cc.sacar(input.nextDouble());
                                break;

                            case 3:
                                System.out.printf("Saldo: R$ %.2f\n", cc.getSaldo());
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("\nOpção inválida!");
                                break;
                        }
                    }while(acao != 4);
                    break;

                case 2:
                    do {
                        System.out.printf("\nSelecione a ação que quer executar [1]Depósito / [2]Saque / [3]Exibir saldo / [4]Sair: ");
                        acao = input.nextInt();

                        switch(acao){
                            case 1:
                                System.out.printf("\n* Depósitos acima de R$500.00 acrescentam 5 por cento de rentabilidade instantânea*\nInsira o valor de depósito: ");
                                cp.depositar(input.nextDouble());
                                break;

                            case 2:
                               if(cp.getSaldo() < 251){
                                    System.out.println("\nATENÇÃO!\nImpossível realizar a ação.\nSaldo atingiu o limite de saque.\n");
                                    System.out.printf("Valor em conta: R$ %.2f\n", cp.getSaldo());
                                }
                               else{
                                   System.out.printf("\n* Limite minimo de saldo de R$250.00 *\nSaldo: R$ %.2f\nInsira o valor de saque: ",  cp.getSaldo());
                                   cp.sacar(input.nextDouble());
                               }
                                break;
                            case 3:
                                System.out.printf("Saldo: R$ %.2f\n", cp.getSaldo());
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("\nOpção inválida!");
                                break;
                        }
                    }while(acao != 4);
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
            System.out.printf("\n\n- Deseja simular novamente? [S]Sim / [N]Não: ");
            exit = input.next();

        }while (exit.equals("s") || exit.equals("S"));

    }
}
