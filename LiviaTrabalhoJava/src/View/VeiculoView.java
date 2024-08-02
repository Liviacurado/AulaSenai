package View;

import Controler.VeiculoController;
import Enum.CategoriaGasto;
import javax.swing.*;

public class VeiculoView {
    
 private VeiculoController veiculoController;

    public VeiculoController getVeiculoController() {
    return veiculoController;
}

public void setVeiculoController(VeiculoController veiculoController) {
    this.veiculoController = veiculoController;
}

    public VeiculoView(VeiculoController veiculoController) {
        this.veiculoController = veiculoController;
    }

    public void mostrarMenu() {
        String[] options = {"Cadastrar Veículo", "Registrar Gasto", "Registrar Abastecimento", "Relatório", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
       
        switch (escolha) {
            case 0:
                cadastrarVeiculo();
                break;
            case 1:
                registrarGasto();
                break;
            case 2:
                registrarAbastecimento();
                break;
            // case 3:
            //     mostrarRelatorio();
            //     break;
            case 4:
                System.exit(0);
                break;
            default:
                mostrarMenu();
                break;
        }
    }

    private void cadastrarVeiculo() {
        try {
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Ano de Fabricação:"));
            int anoModelo = Integer.parseInt(JOptionPane.showInputDialog("Ano do Modelo:"));
            String motorizacao = JOptionPane.showInputDialog("Motorização:");
            int capacidadeTanque = Integer.parseInt(JOptionPane.showInputDialog("Capacidade do Tanque (L):"));
            String combustiveis = JOptionPane.showInputDialog("Combustíveis:");
            String cor = JOptionPane.showInputDialog("Cor:");
            String placa = JOptionPane.showInputDialog("Placa:");
            String renavam = JOptionPane.showInputDialog("Renavam:");

            veiculoController.cadastrarVeiculo(marca, modelo, anoFabricacao, anoModelo, motorizacao, capacidadeTanque, combustiveis, cor, placa, renavam);
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar veículo: " + e.getMessage());
        }
        mostrarMenu();
    }

    private void registrarGasto() {
        try {
            String placa = JOptionPane.showInputDialog("Placa do Veículo:");
            CategoriaGasto categoria = CategoriaGasto.valueOf(JOptionPane.showInputDialog("Categoria do Gasto (MANUTENCAO, IMPOSTO, MULTA, OUTROS):").toUpperCase());
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Gasto:"));
            String descricao = JOptionPane.showInputDialog("Descrição do Gasto:");

            // veiculoController.registrarGasto(placa, categoria, valor, descricao);
            JOptionPane.showMessageDialog(null, "Gasto registrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar gasto: " + e.getMessage());
        }
        mostrarMenu();
    }

    private void registrarAbastecimento() {
        try {
            String placa = JOptionPane.showInputDialog("Placa do Veículo:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Abastecimento:"));
            double quantidadeCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Combustível (L):"));
            int quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Quilometragem Atual:"));

            // veiculoController.registrarAbastecimento(placa, valor, quantidadeCombustivel, quilometragem);
            JOptionPane.showMessageDialog(null, "Abastecimento registrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar abastecimento: " + e.getMessage());
        }
        mostrarMenu();
    }

//     private void mostrarRelatorio() {
//         String[] options = {"Geral", "Por Categoria"};
//         int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção de relatório", "Relatórios",
//                 JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

//         try {
//             String relatorio;
//             if (escolha == 0) {
//                 String placa = JOptionPane.showInputDialog("Placa do Veículo:");
//                 relatorio = veiculoController.gerarRelatorioGeral(placa);
//             } else {
//                 String placa = JOptionPane.showInputDialog("Placa do Veículo:");
//                 CategoriaGasto categoria = CategoriaGasto.valueOf(JOptionPane.showInputDialog("Categoria do Gasto (MANUTENCAO, IMPOSTO, MULTA, OUTROS):").toUpperCase());
//                 relatorio = veiculoController.gerarRelatorioPorCategoria(placa, categoria);
//             }
//             JOptionPane.showMessageDialog(null, relatorio);
//         } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + e.getMessage());
//         }
//         mostrarMenu();
// }
 }