package Controler;


import Exception.InformacaoIncompletaException;
import Exception.VeiculoNaoCadastradoException;
import Turistandomodel.Despesa;
import Turistandomodel.Veiculo;
import java.util.*;

public class GestorVeiculos {
  HashMap<Object,Object> veiculo = new HashMap<>();
    HashMap<Object, Object>despesa = new HashMap<>();
   HashMap<Object, Object> abastecimento = new HashMap<>();

    public void cadastrarVeiculo(Veiculo veiculo) throws  InformacaoIncompletaException, VeiculoNaoCadastradoException {

        if (veiculo.getMarca() == null || veiculo.getModelo() == null || veiculo.getAnoFabricacao() == 0 || 
        veiculo.getAnoModelo() == 0 || veiculo.getMotorizacao() == null || veiculo.getCapacidadeTanque() == 0 || 
        veiculo.getCombustiveis() == null || veiculo.getCor() == null || veiculo.getPlaca() == null || veiculo.getRenavam() == null) {
        throw new InformacaoIncompletaException("Todas as informações do veículo devem ser preenchidas.");
    }

    if (veiculo.equals(veiculo.getPlaca())) {
        throw new VeiculoNaoCadastradoException("Veículo já cadastrado.");
    }
    veiculo.put(veiculo.getPlaca(), veiculo);
    despesa.put(veiculo.getPlaca(), new ArrayList<>());
    abastecimento.put(veiculo.getPlaca(), new ArrayList<>());
            
    }

    public void registrarDespesa(String placa, Despesa despesa) throws VeiculoNaoCadastradoException {
        // Implementação do registro de despesa
    }



}
