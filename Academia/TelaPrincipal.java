import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JPanel TelaPrincipal1;
    private JMenuBar MenuBar;
    private JMenu JmenuMembros, MenuAulas, MenuEquipamentos, MenuPagamentos;
    private JMenuItem membrositem, AdicionarMembros, Funcionarios, AdicionarFuncionarios;
    private JMenuItem AulasDisponiveis;
    private JMenuItem VerEquipamentos, AddEquipamentos;
    private JMenuItem VerPagamentos, VerPlanos;
    private JButton fecharButton;
    private JLabel MenuAcademia;


    public TelaPrincipal() {
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void initListeners() {
        membrositem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaMembros();
            }
        });

        AdicionarMembros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaAdicionarMembros();
            }
        });

        Funcionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaFuncionarios();
            }
        });

        AdicionarFuncionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaAdicionarFuncionarios();
            }
        });

        AulasDisponiveis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaAulasDisponiveis();
            }
        });

        VerEquipamentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaVerEquipamentos();
            }
        });

        AddEquipamentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaAdicionarEquipamentos();
            }
        });

        VerPagamentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaVerPagamentos();
            }
        });

        VerPlanos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaVerPlanos();
            }
        });
    }

    // Funções para abrir as telas correspondentes
    private void abrirTelaMembros() {
        JOptionPane.showMessageDialog(this, "Membros Registrados:\n" +
                "\nNome: Kayque " +
                "\nEmail: kayque9868@gmail.com " +
                "\nCPF: 123456789-12 " +
                "\nTelefone: (31) 123456789 " +
                "\nData de Nascimento: 19/09/2003 " +
                "\nEndereço: Rua Das Flores 01");
    }
    private void abrirTelaAdicionarMembros() {
        // Pede as informações do cliente
        String nome = JOptionPane.showInputDialog(this, "Digite o Nome do novo membro:");
        String email = JOptionPane.showInputDialog(this, "Digite o Email do novo membro:");
        String cpf = JOptionPane.showInputDialog(this, "Digite o CPF do novo membro:");
        String telefone = JOptionPane.showInputDialog(this, "Digite o Telefone do novo membro:");
        String ddn = JOptionPane.showInputDialog(this, "Digite o Data de Nascimento do novo membro:");
        String endereco = JOptionPane.showInputDialog(this, "Digite o Endereço do novo membro:");

        // Se o usuário não cancelou a entrada de dados e inseriu algo
        if (nome != null && !nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Adicionando membro:\n" +
                    "\nNome: " +nome +
                    "\nEmail: " + email +
                    "\nCPF: " + cpf +
                    "\nTelefone: " + telefone +
                    "\nData de Nascimento " + ddn +
                    "\nEndereço " + endereco);
        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelada ou nome inválido.");
        }
    }

    private void abrirTelaFuncionarios() {
        JOptionPane.showMessageDialog(this, "Funcionários Registrados:\n" +
                "\nNome: Guilherme " +
                "\nCargo: Professor " +
                "\nEmail: guilherme@gmail.com " +
                "\nCPF: 987654321-21 " +
                "\nSalário: R$ 1.412 " +
                "\nTelefone: (31) 987654321 " +
                "\nData de Nascimento: 01/01/2001 " +
                "\nEndereço: Rua Das Flores 01");
    }

    private void abrirTelaAdicionarFuncionarios() {
        // Pede as informações do funcionario
        String nomeF = JOptionPane.showInputDialog(this, "Digite o Nome do novo Funcionário:");
        String cargo = JOptionPane.showInputDialog(this, "Digite o Cargo do novo Funcionário:");
        String emailF = JOptionPane.showInputDialog(this, "Digite o Email do novo Funcionário:");
        String cpfF = JOptionPane.showInputDialog(this, "Digite o CPF do novo Funcionário:");
        String salario = JOptionPane.showInputDialog(this, "Digite o Salário do novo Funcionário:");
        String telefoneF = JOptionPane.showInputDialog(this, "Digite o Telefone do novo Funcionário:");
        String ddnF = JOptionPane.showInputDialog(this, "Digite o Data de Nascimento do novo Funcionário:");
        String enderecoF = JOptionPane.showInputDialog(this, "Digite o Endereço do novo Funcionário:");

        // Se o usuário não cancelou a entrada de dados e inseriu algo
        if (nomeF != null && !nomeF.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Adicionando Funcionário:\n" +
                    "\nNome: " + nomeF +
                    "\nCargo: " + cargo +
                    "\nEmail: " + emailF +
                    "\nCPF: " + cpfF +
                    "\nSalário: " + salario +
                    "\nTelefone: " + telefoneF +
                    "\nData de Nascimento " + ddnF +
                    "\nEndereço: " + enderecoF);
        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelada ou nome inválido.");
        }
    }

    private void abrirTelaAulasDisponiveis() {
        JOptionPane.showMessageDialog(this, "Aulas Disponíveis:\n" +
                "\nDanças " +
                "\nSpinning " +
                "\nYoga " +
                "\nMuai Thay " +
                "\nJump");
    }

    private void abrirTelaVerEquipamentos() {
        JOptionPane.showMessageDialog(this, "Equipamentos na Academia:\n" +
                "\nCrucifixo Articulado " +
                "\nExtensora Unilateral " +
                "\nFlexora Unilateral " +
                "\nMesa Flexora " +
                "\nElevação Pélvica " +
                "\nHack Squat 45° " +
                "\nLeg Press 45° Guiado " +
                "\nLeg Press 90° Guiado " +
                "\nLeg Press Articulado " +
                "\nSmitch Press ");
    }

    private void abrirTelaAdicionarEquipamentos() {
        // Pede as informações dos Equipamentos
        String nomeE = JOptionPane.showInputDialog(this, "Digite o Nome do novo Equipamento:");
        String descricao = JOptionPane.showInputDialog(this, "Digite uma Descrição do Equipamento:");
        String quantidade = JOptionPane.showInputDialog(this, "Digite a Quantidade do Equipamento:");
        String preco = JOptionPane.showInputDialog(this, "Digite o Preço do Equipamento");

        // Se o usuário não cancelou a entrada de dados e inseriu algo
        if (nomeE != null && !nomeE.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Adicionando Equipamento:\n " +
                    "\nNome: " + nomeE +
                    "\nDescricao: " + descricao +
                    "\nQuantidade: " + quantidade +
                    "\nPreco: " + preco);
        } else {
            JOptionPane.showMessageDialog(this, "Operação cancelada ou nome inválido.");
        }
    }

    private void abrirTelaVerPagamentos() {
        JOptionPane.showMessageDialog(this, "Pagamentos:\n" +
                "Cliente: João Silva\n" +
                "Número da Conta: 1234567890\n" +
                "Período: Últimos 30 dias\n" +
                "\n" +
                "Últimos Pagamentos Realizados:\n" +
                "\n" +
                "Data: 2024-03-25\n" +
                "Valor: R$ 150,00\n" +
                "Descrição: Pago Via Cartão\n" +
                "\n" +
                "Data: 2024-03-28\n" +
                "Valor: R$ 200,00\n" +
                "Descrição: Pago Via Boleto\n" +
                "\n" +
                "Data: 2024-04-05\n" +
                "Valor: R$ 500,00\n" +
                "Descrição: Pago Via Pix");
    }

    private void abrirTelaVerPlanos() {
        JOptionPane.showMessageDialog(this, "\nPlano Básico:\n" +
                "Descrição: Este plano oferece acesso básico às instalações da academia, incluindo uso de equipamentos de cardio e musculação.\n" +
                "Valor: R$ 80,00 por mês.\n" +
                "\nPlano Premium:\n" +
                "Descrição: Com o Plano Premium, os membros têm acesso ilimitado a todas as áreas da academia, incluindo aulas em grupo, treinamento personalizado e uso de áreas de relaxamento, como sauna e piscina.\n" +
                "Valor: R$ 150,00 por mês.\n" +
                "\nPlano Familiar:\n" +
                "Descrição: Este plano é ideal para famílias, oferecendo descontos para múltiplos membros. Inclui acesso completo às instalações para todos os membros da família.\n" +
                "Valor: R$ 250,00 por mês para o primeiro membro, com descontos progressivos para membros adicionais.\n" +
                "\nPlano Corporativo:\n" +
                "Descrição: Projetado para empresas que desejam promover a saúde e o bem-estar de seus funcionários, este plano oferece tarifas especiais e benefícios exclusivos para grupos de funcionários.\n" +
                "Valor: Sob consulta, com descontos especiais baseados no tamanho e nas necessidades da empresa.");
    }

    public static void main(String[] args) {
        TelaPrincipal TP = new TelaPrincipal();
        TP.setContentPane(TP.TelaPrincipal1);
        TP.setLocationRelativeTo(null);
        TP.initListeners();
        TP.setTitle("Tela Pricipal");
        TP.setSize(400,300);
        TP.setVisible(true);
        TP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
