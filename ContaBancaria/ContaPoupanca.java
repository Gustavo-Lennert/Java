package ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 500) {
            this.saldo += valor + (valor * 0.5);
            System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
        }
        else{
            this.saldo += valor;
            System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
        }
    }

    @Override
    public void sacar(double valor) {

        if(getSaldo() - valor < 250){
            System.out.println("\nATENÇÃO!\nImpossível realizar a ação.\nValor digitado  atingiu o limite de saque.\n");
            System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
            System.out.printf("Limite de saque até: R$250.00\n");
        }

       else{
            if(getSaldo() == 0){
                System.out.println("\nATENÇÃO!\nImpossível realizar a ação.\nReponha para realizar futuros saques.");
            }
            else{
                this.saldo -= valor;
                System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
            }
        }
    }
}
