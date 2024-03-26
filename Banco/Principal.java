package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Clientes(args);
        Agencia(args);
        Investimentos(args);
        Conta(args);
    }

    // Teste de função do método "Clientes"
    private static void Clientes(String[] args) {

        Clientes c1 = new Clientes();
        c1.setNome("João");
        c1.setIdade(25);
        c1.setSexo("M");
        c1.setEndereco("Rua 1");
        c1.setCidade("São Paulo");
        System.out.println("\nDados do cliente ");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("Sexo: " + c1.getSexo());
        System.out.println("Endereço: " + c1.getEndereco());
        System.out.println("Cidade: " + c1.getCidade());

    }

    // Teste de função do método "Agencia"
    private static void Agencia(String[] args) {

        Agencia a1 = new Agencia();
        a1.setCodigo(1);
        a1.setEndereco("rua das flores 1");
        a1.setMovimentacao("null");
        a1.setNome_ag("Agencia 1");
        a1.setNome_gerente("Gerente 1");
        System.out.println("\nDados da Agencia ");
        System.out.println("Codigo: " + a1.getCodigo());
        System.out.println("Endereço: " + a1.getEndereco());
        System.out.println("Movimentação: " + a1.getMovimentacao());
        System.out.println("Nome da Agencia: " + a1.getNome_ag());
        System.out.println("Nome do Gerente: " + a1.getNome_gerente());

    }

    // Teste de função do método "Conta"
    private static void Conta(String[] args) {

        Conta co1 = new Conta();
        co1.setNumero(1);
        co1.setSaldo(1000); //Valor inicial do Saldo
        System.out.println("\nDados da Conta ");
        System.out.println("Numero: " + co1.getNumero());
        System.out.println("Saldo: " + co1.getSaldo());
        // Método sacar
        System.out.println("Digite o valor a ser sacado: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if(num < 0){ //Verifica se o valor é negativo, caso positivo realiza o saque
            System.out.println("Valor inválido para saque.");
        }else{
            co1.sacar(num);
        }
        // Método depositar
        System.out.println("Digite o valor a ser depositado: ");
        Scanner sd = new Scanner(System.in);
        double num2 = sd.nextDouble();
        if (num2 < 0) { //Verifica se o valor é negativo, caso positivo realiza o deposito
            System.out.println("Valor inválido para depósito.");
        } else {
            co1.depositar(num2);
        }
    }

    // Teste de função do método "Investimentos"
    private static void Investimentos(String[] args) {

        Investimentos inv1 = new Investimentos("0123", "João Silva", "123456", "Gerente 1", 1000, 100000);
        inv1.imprimir();
        inv1.imposto_investimento();
        inv1.verifica_saldo();


        
    }   
}
