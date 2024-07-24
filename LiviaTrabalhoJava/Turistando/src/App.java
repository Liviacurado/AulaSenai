
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import src.TuristandoExe.turistandoExe;
import src.turistandoModel.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        turistandoExe app = new turistandoExe ();
        while (true) {
            String[] options = {"Cadastrar Veículo", "Registrar Despesa", "Calcular Consumo Médio", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Turistando",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            try {
                switch (choice) {
                    case 0 -> cadastrarVeiculo(app);
                    case 1 -> registrarDespesa(app);
                    case 2 -> System.exit(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void cadastrarVeiculo(turistandoExe app) throws Exception {

        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação:"));
        int anoModelo = Integer.parseInt(JOptionPane.showInputDialog("Ano do modelo:"));
        String motorizacao = JOptionPane.showInputDialog("Motorização:");
        double capacidadeTanque = Double.parseDouble(JOptionPane.showInputDialog("Capacidade do tanque:"));
        List<String> combustiveis = new ArrayList<>(List.of(JOptionPane.showInputDialog("Combustíveis (separados por vírgula):").split(",")));
        String cor = JOptionPane.showInputDialog("Cor:");
        String placa = JOptionPane.showInputDialog("Placa:");
        String renavam = JOptionPane.showInputDialog("Renavam:");

        Veiculo veiculo = new Veiculo(marca, modelo, anoFabricacao, anoModelo, motorizacao, capacidadeTanque, combustiveis, cor, placa, renavam);
        app.cadastrarVeiculo(veiculo);
    }

    private static void registrarDespesa(turistandoExe app) throws Exception {
        String placa = JOptionPane.showInputDialog("Placa do veículo:");
        String tipoDespesa = JOptionPane.showInputDialog("Tipo de despesa (Abastecimento, Manutenção, Imposto, Multa, Outro):");
        String valor = JOptionPane.showInputDialog("Valor: ");
    }
}
