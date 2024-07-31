package Controler;


import Exception.InformacaoIncompletaException;
import Exception.ValorInvalidoException;
import Exception.VeiculoNaoCadastradoException;
import Turistandomodel.Despesa;
import Turistandomodel.Imposto;
import Turistandomodel.Manutencao;
import Turistandomodel.Multa;
import Turistandomodel.Outro;
import Turistandomodel.Veiculo;
import java.util.*;

import javax.swing.JOptionPane;

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
        if (!veiculo.equals(placa)) {
            throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
        }
        if (despesa.getValor() <= 0) {
            throw new ValorInvalidoException("O valor da despesa deve ser positivo.");
        }
        despesa.get(placa).add(despesa);
    }


            
           
            
        }

    

