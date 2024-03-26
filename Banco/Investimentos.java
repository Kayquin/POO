package Principal;

public class Investimentos {

    private String Agencia;

    private String Cliente;

    private String Conta;

    private String Gerente;

    private double Saldo;

    private double Investimento;


    public Investimentos(String agencia, String cliente, String conta, String gerente, double saldo, double investimento) {
        this.Agencia = agencia;
        this.Cliente = cliente;
        this.Conta = conta;
        this.Gerente = gerente;
        this.Saldo = saldo;
        this.Investimento = investimento;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getConta() {
        return Conta;
    }

    public void setConta(String conta) {
        Conta = conta;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String gerente) {
        Gerente = gerente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getInvestimento() {
        return Investimento;
    }

    public void setInvestimento(double investimento) {
        Investimento = investimento;
    }


    public void imposto_investimento() {
        double imposto = Investimento * 0.1; //Imposto de 10% sobre o valor do investimento
        System.out.println("Imposto do investimento: " + imposto);
    }


    public void verifica_saldo() {
        if (Saldo >=1000) {
            System.out.println("Saldo está acima do limite!");
        } else {
            System.out.println("Saldo está abaixo do limite!");
        }
    }

    public void imprimir() {
        System.out.println("\nDados do Investimento");
        System.out.println("Agência: " + Agencia);
        System.out.println("Cliente: " + Cliente);
        System.out.println("Conta: " + Conta);
        System.out.println("Gerente: " + Gerente);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Investimento: " + Investimento);
    }

}
