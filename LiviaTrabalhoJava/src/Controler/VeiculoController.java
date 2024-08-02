package Controler;


import Exception.AbastecimentosInsuficientesException;
import Exception.InformacaoIncompletaException;
import Exception.ValorInvalidoException;
import Exception.VeiculoNaoCadastradoException;
import Turistandomodel.Abastecimento;
import Turistandomodel.Gasto;
import Turistandomodel.Veiculo;
import java.time.LocalDate;
import java.util.*;

public class VeiculoController {
    
       private Veiculo veiculo;
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void cadastrarVeiculo(String marca, String modelo, int anoFabricacao, int anoModelo, String motorizacao,
                                 int capacidadeTanque, String combustiveis, String cor, String placa, String renavam) throws InformacaoIncompletaException, VeiculoNaoCadastradoException {
        if (marca.isEmpty() || modelo.isEmpty() || motorizacao.isEmpty() || combustiveis.isEmpty() || cor.isEmpty() || placa.isEmpty() || renavam.isEmpty()) {
            throw new InformacaoIncompletaException("Todos os campos devem ser preenchidos.");
        }
        

        
    }

    public void registrarGasto(Gasto gasto,String categoria, String descricao, double valor, LocalDate data) throws VeiculoNaoCadastradoException, ValorInvalidoException {
        if (veiculo == null) {
            throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
        }

        if (valor < 0) {
            throw new ValorInvalidoException("O valor do gasto não pode ser negativo.");
        }
      
        veiculo.getGastos().add(gasto);
    }


     public double calcularConsumoMedio( Veiculo veiculo,Abastecimento abastecimento) throws AbastecimentosInsuficientesException {

        List <Abastecimento> abastecimentos = veiculo.getAbastecimentos();
    
        
        if (abastecimentos.size() < 2) {
            throw new AbastecimentosInsuficientesException("Mínimo de dois abastecimentos completos necessários.");
        }

        double kmPercorridos = 0;
        double litrosConsumidos = 0;

        for (int i = 1; i < abastecimentos.size(); i++) {
            Abastecimento anterior = abastecimentos.get(i - 1);
            Abastecimento atual = abastecimentos.get(i);
            kmPercorridos += atual.getQuilometragem() - anterior.getQuilometragem();
            litrosConsumidos += atual.getQuantidadeCombustivel();
        }

        return kmPercorridos / litrosConsumidos;

    }

    public void registrarAbastecimento(Abastecimento abastecimento,String placa,double quantidadeCombustivel,double valor) throws VeiculoNaoCadastradoException, ValorInvalidoException {
        if 
        (veiculo == null) {
            throw new VeiculoNaoCadastradoException("Veículo não cadastrado.");
        }

        if (valor < 0 || quantidadeCombustivel < 0) {
            throw new ValorInvalidoException("O valor ou a quantidade de combustível não pode ser negativa.");
        }

       veiculo.getAbastecimentos();
    }

    public double GastoTotal() {
        List<Gasto> gastos = veiculo.getGastos();
        List<Abastecimento> abastecimentos = veiculo.getAbastecimentos();
        double gastoTotal = 0.0;

        for (Gasto gasto : gastos) {
            gastoTotal += gasto.getValor();
        }

        for (Abastecimento abastecimento : abastecimentos) {
            gastoTotal += abastecimento.getValor();
        }
        return gastoTotal;

    }

    
    }

  
     
           
            
        



