
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Exception.AbastecimentosInsuficientesException;
import Exception.CombustivelInvalidoException;
import Exception.InformacaoIncompletaException;
import Exception.ValorInvalidoException;
import Exception.VeiculoNaoCadastradoException;
import Turistandomodel.Abastecimento;
import Turistandomodel.Despesa;
import Turistandomodel.Imposto;
import Turistandomodel.Manutencao;
import Turistandomodel.Multa;
import Turistandomodel.Outro;
import Turistandomodel.Veiculo;


public class App {

    public static void main(String[] args) throws Exception {

        while (true) {
            String[] Op = {"Cadastrar Veículo", "Registrar Despesa", "Registrar Abastecimento", "Calcular Consumo Médio", "Gerar Relatório de Despesas", "Sair"};
            int escolha= JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, Op
            , Op[0]);
            
            try {
                switch (escolha) {
                    case 0 -> cadastrarVeiculo();
                    case 1 -> registrarDespesa();
                    case 2 -> registrarAbastecimento();
                    case 3 -> calcularConsumoMedio();
                    case 4 -> gerarRelatorioGeral();
                    case 5 -> System.exit(0);
                    default -> {}
                }
            } catch (Exception e) {
                System.err.println(e);
            }
                  
        }
    }

    // private static void cadastrarVeiculo() throws InformacaoIncompletaException, VeiculoNaoCadastradoException {
    //     Map<String, String> dados = getDadosVeiculo();

    //     Veiculo veiculo = new Veiculo(
    //             dados.("marca"), dados.get("modelo"), Integer.parseInt(dados.get("anoFabricacao")),
    //             Integer.parseInt(dados.get("anoModelo")), dados.get("motorizacao"),
    //             Double.parseDouble(dados.get("capacidadeTanque")), dados.get("combustivel"),
    //             dados.get("cor"), dados.get("placa"), dados.get("renavam")
    //     );
    //     gestorDeVeiculos.cadastrarVeiculo(veiculo);
    //     showMessage("Veículo cadastrado com sucesso!");
    // }

    // private static void registrarDespesa() throws InformacaoIncompletaException, VeiculoNaoCadastradoException, ValorInvalidoException {
    //     String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
    //     double valor = getValorNumerico("Informe o valor da despesa:");
    //     String descricao = JOptionPane.showInputDialog("Informe a descrição da despesa:");
    //     String data = JOptionPane.showInputDialog("Informe a data da despesa (dd/mm/aaaa):");
    //     String categoria = escolherCategoria();

    //     Despesa despesa = criarDespesaPorCategoria(valor, descricao, data, categoria);
    //     gestorDeVeiculos.registrarDespesa(placa, despesa);
    //     showMessage("Despesa registrada com sucesso!");
    // }

    // private static void registrarAbastecimento() throws InformacaoIncompletaException, CombustivelInvalidoException, VeiculoNaoCadastradoException {
    //     String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
    //     double valor = getValorNumerico("Informe o valor do abastecimento:");
    //     double quantidadeCombustivel = getValorNumerico("Informe a quantidade de combustível abastecido (em litros):");
    //     double quilometragem = (double) getValorNumerico("Informe a quilometragem atual do veículo:");

    //     Abastecimento abastecimento = new Abastecimento(null, valor, placa, null, quantidadeCombustivel, quilometragem );
    //     gestorDeVeiculos.registrarAbastecimento(placa, abastecimento);
    //     showMessage("Abastecimento registrado com sucesso!");
    // }

    // private static void calcularConsumoMedio() throws VeiculoNaoCadastradoException, AbastecimentosInsuficientesException {
    //     String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
    //     double consumoMedio = gestorDeVeiculos.calcularConsumoMedio(placa);
    //     showMessage("O consumo médio do veículo é: " + consumoMedio + " km/l");
    // }

    // private static void gerarRelatorioDespesas() throws VeiculoNaoCadastradoException {
    //     String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
    //     String categoria = escolherCategoriaRelatorio();

    //     List<Despesa> relatorio = gestorDeVeiculos.gerarRelatorioDespesas(placa, categoria);
    //     StringBuilder sb = new StringBuilder("Relatório de Despesas:\n");
    //     for (Despesa despesa : relatorio) {
    //         sb.append(despesa.toString()).append("\n");
    //     }
    //     showMessage(sb.toString());
    // }

    private static Map<String, String> getDadosVeiculo() {

        Map<String, String> dados = new HashMap<>();
        dados.put("marca", JOptionPane.showInputDialog("Informe a marca do veículo:"));
        dados.put("modelo", JOptionPane.showInputDialog("Informe o modelo do veículo:"));
        dados.put("anoFabricacao", JOptionPane.showInputDialog("Informe o ano de fabricação do veículo:"));
        dados.put("anoModelo", JOptionPane.showInputDialog("Informe o ano do modelo do veículo:"));
        dados.put("motorizacao", JOptionPane.showInputDialog("Informe a motorização do veículo:"));
        dados.put("capacidadeTanque", JOptionPane.showInputDialog("Informe a capacidade do tanque do veículo (em litros):"));
        dados.put("cor", JOptionPane.showInputDialog("Informe a cor do veículo:"));
        dados.put("placa", JOptionPane.showInputDialog("Informe a placa do veículo:"));
        dados.put("renavam", JOptionPane.showInputDialog("Informe o RENAVAM do veículo:"));

        String[] TIPO = { "Gasolina", "Etanol", "Diesel", "Biodiesel", "Eletrico" };
        JComboBox CombustivelBox = new JComboBox<>(TIPO);
        CombustivelBox.setSelectedIndex(4);
    

        return dados;
    }

    private static String escolherCategoria() {
        String[] categorias = {"Manutenção", "Imposto", "Multa", "Outro"};
        return (String) JOptionPane.showInputDialog(null, "Escolha a categoria da despesa", "Categoria", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
    }

    private static String escolherCategoriaRelatorio() {
        String[] categorias = {"Manutenção", "Imposto", "Multa", "Outro", "Todos"};
        return (String) JOptionPane.showInputDialog(null, "Escolha a categoria do relatório", "Categoria", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
    }
    //consumo médio por abastecimento 
    // consumo medio (arraylist)  ultimo abastecimento - primeiro abastecimento / 1 abastecimento + 2 abastecimento.....abastecimentoN = KM/L
    //KMTOTALRODADO / ABSTOTAL = KM/L
}
        