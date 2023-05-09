package ContaBancaria;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 50) {
            this.saldo += valor;
            System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
        }
        else{
            System.out.println("Valor abaixo do mínimo para depósito!");
        }
    }

    @Override
    public void sacar(double valor) {

        if(getSaldo() - valor < -50){
            System.out.println("\nATENÇÃO!\nImpossível realizar a ação.\nValor digitado  atingiu o limite de saque.\n");
            System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
            System.out.printf("Limite de saque até: R$ -50.00\n");
        }
        else{
            if(getSaldo() <= -50){
                System.out.println("\nATENÇÃO!\nImpossível realizar a ação pois seu saldo atingiu o limite no vermelho.\nReponha para realizar futuros saques.");
            }
            else{
                if (this.saldo <= valor) {
                    System.out.println("\n*CHEQUE ESPECIAL*");
                }
                this.saldo -= valor;
                System.out.printf("Valor em conta: R$ %.2f\n", this.getSaldo());
            }
        }
    }
}
