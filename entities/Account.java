package java_projects.entities;

public class Account{

        //Atributos (encapsulados)
        private int numAcct;
        private String name;
        private double value;


        //Construtor obrigatório
        public Account(int numAcct, String name){
                this.numAcct = numAcct;
                this.name = name;
        }

        //Construtor opcional
        public Account(int numAcct, String name, double initDeposit){
                this.numAcct = numAcct;
                this.name = name;
                deposit(initDeposit);
        }


        //Getters e Setters
        public String getName(){
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getNumAcct() {
                return numAcct;
        }

        public double getValue() {
                return value;
        }


        /*            -- Métodos --           */
        //Depósito
        public void deposit(double value){
                this.value += value;
        }
        //Saque (taxa de $5)
        public void withdraw(double value){
                this.value -= (value + 5);
        }

        public String toString(){
                return  "\nConta: " + getNumAcct() +
                        "\nTitular: " + getName() +
                        "\nSaldo: " + String.format("%.2f", getValue())
                ;
        }
}
