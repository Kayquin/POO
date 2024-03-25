package Principal;

public class Principal {

    public static void main(String[] args) {
        Clientes(args);
        Agencia(args);
        Conta(args);
        Investimentos(args);
    }

    // Teste de função do método "Clientes"
    public static void Clientes(String[] args) {

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
    public static void Agencia(String[] args) {

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
    public static void Conta(String[] args) {

        Conta co1 = new Conta();
        co1.setNumero(1);
        co1.setSaldo(1000);
        System.out.println("\nDados da Conta ");
        System.out.println("Numero: " + co1.getNumero());
        System.out.println("Saldo: " + co1.getSaldo());

    }

    // Teste de função do método "Investimentos"
    public static void Investimentos(String[] args) {

        Investimentos i1 = new Investimentos();
        i1.setAgencia("1");
        i1.setCliente("João");
        i1.setConta("1");
        i1.setGerente("Gerente 1");
        i1.setInvestimento(1000000);
        i1.setSaldo(0);
        System.out.println("\nDados do Investimento ");
        System.out.println("Agencia: " + i1.getAgencia());
        System.out.println("Cliente: " + i1.getCliente());
        System.out.println("Conta: " + i1.getConta());
        System.out.println("Gerente: " + i1.getGerente());
        System.out.println("Investimento: " + i1.getInvestimento());
        System.out.println("Saldo: " + i1.getSaldo());

    }
}
