package Principal;

public class Conta {

    private int numero;

    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método sacar
    public void sacar(double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            double newSaldo = this.getSaldo() - valor;
            this.setSaldo(newSaldo);
            System.out.println("Novo saldo: " + this.getSaldo());
        }
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Novo saldo: " + this.getSaldo());
    }

}
