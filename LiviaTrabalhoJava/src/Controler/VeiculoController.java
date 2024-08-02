package Controler;


import Exception.InformacaoIncompletaException;
import Exception.ValorInvalidoException;
import Exception.VeiculoNaoCadastradoException;
import Turistandomodel.Abastecimento;
import Turistandomodel.Gasto;
import Turistandomodel.Veiculo;
import java.util.*;

public class VeiculoController {
    private Map<String, Veiculo> veiculos = new HashMap<>();

    public void cadastrarVeiculo(String marca, String modelo, int anoFabricacao, int anoModelo, String motorizacao,
                                 int capacidadeTanque, String combustiveis, String cor, String placa, String renavam) throws InformacaoIncompletaException, VeiculoNaoCadastradoException {
        if (marca.isEmpty() || modelo.isEmpty() || motorizacao.isEmpty() || combustiveis.isEmpty() || cor.isEmpty() || placa.isEmpty() || renavam.isEmpty()) {
            throw new InformacaoIncompletaException("Todos os campos devem ser preenchidos.");
        }
        

        
    }

    public void registrarGasto(Gasto gastos, String placa, double valor) throws VeiculoNaoCadastradoException, ValorInvalidoException {
        Veiculo veiculo = veiculos.get(placa);
        if (veiculo == null) {
            throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
        }

        if (valor < 0) {
            throw new ValorInvalidoException("O valor do gasto não pode ser negativo.");
        }

        veiculo.getGastos().add(gastos);
    }

    public void registrarAbastecimento(Abastecimento abastecimento,String placa,double quantidadeCombustivel,double valor) throws VeiculoNaoCadastradoException, ValorInvalidoException {
        Veiculo veiculo = veiculos.get(placa);
        if (veiculo == null) {
            throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
        }

        if (valor < 0 || quantidadeCombustivel < 0) {
            throw new ValorInvalidoException("O valor ou a quantidade de combustível não pode ser negativa.");
        }

       veiculo.getAbastecimentos();
    }

}




















//     public String gerarRelatorioGeral(String placa) throws VeiculoNaoCadastradoException {
//         Veiculo veiculo = veiculos.get(placa);
//         if (veiculo == null) {
//             throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
//         }

//         StringBuilder relatorio = new StringBuilder("Relatório Geral\n");
//         relatorio.append("Marca: ").append(veiculo.getMarca()).append("\n");
//         relatorio.append("Modelo: ").append(veiculo.getModelo()).append("\n");
//         relatorio.append("Ano de Fabricação: ").append(veiculo.getAnoFabricacao()).append("\n");
//         relatorio.append("Ano do Modelo: ").append(veiculo.getAnoModelo()).append("\n");
//         relatorio.append("Motorização: ").append(veiculo.getMotorizacao()).append("\n");
//         relatorio.append("Combustíveis: ").append(veiculo.getCombustiveis()).append("\n");
//         relatorio.append("Cor: ").append(veiculo.getCor()).append("\n");
//         relatorio.append("Placa: ").append(veiculo.getPlaca()).append("\n");
//         relatorio.append("Renavam: ").append(veiculo.getRenavam()).append("\n\n");

//         relatorio.append("Abastecimentos:\n");
//         for (Abastecimento abastecimento : veiculo.getAbastecimentos()) {
//             relatorio.append("Valor: ").append(abastecimento.getValor()).append(" - Quantidade: ").append(abastecimento.getQuantidadeCombustivel()).append("L - Quilometragem: ").append(abastecimento.getQuilometragem()).append("\n");
//         }

//         relatorio.append("\nGastos:\n");
//         for (Gasto gasto : veiculo.getGastos()) {
//             relatorio.append("Categoria: ").append(gasto.getCategoria()).append(" - Valor: ").append(gasto.getValor()).append(" - Data: ").append(gasto.getData()).append(" - Descrição: ").append(gasto.getDescricao()).append("\n");
//         }

//         return relatorio.toString();
//     }

//     public String gerarRelatorioPorCategoria(String placa, CategoriaGasto categoria) throws VeiculoNaoCadastradoException {
//         Veiculo veiculo = veiculos.get(placa);
//         if (veiculo == null) {
//             throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
//         }

//         StringBuilder relatorio = new StringBuilder("Relatório por Categoria - ").append(categoria).append("\n");

//         relatorio.append("Gastos:\n");
//         for (Gasto gasto : veiculo.getGastos()) {
//             if (gasto.getCategoria() == categoria) {
//                 relatorio.append("Valor: ").append(gasto.getValor()).append(" - Data: ").append(gasto.getData()).append(" - Descrição: ").append(gasto.getDescricao()).append("\n");
//             }
//         }

//         return relatorio.toString();
//     }
// }

  
     
           
            
        



