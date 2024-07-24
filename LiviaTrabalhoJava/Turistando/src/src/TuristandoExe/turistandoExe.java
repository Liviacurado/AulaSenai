package src.TuristandoExe;

import java.util.ArrayList;
import java.util.List;
import src.turistandoModel.Abastecimento;
import src.turistandoModel.Despesa;
import src.turistandoModel.Veiculo;

public class turistandoExe {

private List<Veiculo> veiculos;

       public  turistandoExe() {
        veiculos = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) throws Exception {
        if (veiculo == null) {
            throw new Exception("Veículo não pode ser nulo.");
        }
        veiculos.add(veiculo);
    }

    public void registrarDespesa(String placa, Despesa despesa) throws Exception {
        Veiculo veiculo = buscarVeiculo(placa);
        if (veiculo == null) {
            throw new Exception("Veículo não cadastrado.");
        }
        veiculo.adicionarDespesa(despesa);
    }

    private Veiculo buscarVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public double calcularConsumoMedio(String placa) throws Exception {
        Veiculo veiculo = buscarVeiculo(placa);
        if (veiculo == null) {
            throw new Exception("Veículo não cadastrado.");
        }

        List<Abastecimento> abastecimentos = new ArrayList<>();
        for (Despesa despesa : veiculo.getDespesas()) {
            if (despesa instanceof Abastecimento) {
                abastecimentos.add((Abastecimento) despesa);
            }
        }

        if (abastecimentos.size() < 2) {
            throw new Exception("É necessário pelo menos dois abastecimentos completos.");
        }

        double totalQuilometragem = 0;
        double totalCombustivel = 0;

        for (int i = 1; i < abastecimentos.size(); i++) {
            Abastecimento atual = abastecimentos.get(i);
            Abastecimento anterior = abastecimentos.get(i - 1);

            totalQuilometragem += (atual.getQuilometragem() - anterior.getQuilometragem());
            totalCombustivel += atual.getQuantidadeCombustivel();
        }

        return totalQuilometragem / totalCombustivel;
    }
}
