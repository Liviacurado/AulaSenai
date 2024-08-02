
import Exception.InformacaoIncompletaException;
import Turistandomodel.Veiculo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class App {

    private static List<Veiculo> veiculos = new ArrayList<>();


    public static void main(String[] args) throws Exception {
         
        
      JFrame jf= new JFrame();
      jf.setLayout(new BorderLayout(10,5));
      jf.setTitle("Turistando");
      jf.setSize(300,620);
      jf.setLocationRelativeTo(null);
      jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      jf.add(panel,BorderLayout.CENTER);
          
          
          
          String[] options = new String[] { "Cadastrar Veiculo", "Abastecer Veículo", "Mostrar Despesas Cadastradas", "Voltar" };
          
          int escolha = JOptionPane.showOptionDialog(
            null,
            "Selecione",
            "Turistando",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.CLOSED_OPTION,
            null,
            options,
            options[0]);

            for (int i = 0; i < options.length; i++) {
            JButton button = new JButton(options[i]);
            int choice = i;
            button.addActionListener(e -> {
                try {
                    executarOpcao(choice);
                } catch (InformacaoIncompletaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada numérica inválida: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "Data inválida: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado: " + ex.getMessage(), "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
            jf.add(button);
        }

        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }


            private static void executarOpcao(int escolha) throws Exception {

              switch (escolha) {
                  case 0:
                  CadastrarVeiculo();
                      break;
              
                  case 1:
                      registrarAbastecimento();
                      break;
                  // case 2:
                  //     registrarGasto();
                  //     break;
                  // case 3:
                  //     calcularConsumoMedio();
                  //     break;
                  // case 4:
                  //     relatorio();
                  //     break;
                  case 5:
                      System.exit(0);
                      break;
                  default:
                      throw new InformacaoIncompletaException("Opção inválida selecionada.");
              }
          }
      
            
          private static void CadastrarVeiculo() throws Exception {
              JPanel panel = new JPanel();
              JFrame jf1= new JFrame();
              jf1.setLayout(new BorderLayout(10,5));
              jf1.setTitle("Turistando");
              jf1.setSize(300,800);
              jf1.setLocationRelativeTo(null);
              jf1.setDefaultCloseOperation(jf1.EXIT_ON_CLOSE);
              
              
          JLabel titulo = new JLabel("          Cadastro Veiculo           ");
          
          JLabel Marca = new JLabel("Marca: ");
          JTextField texto1 = new JTextField(15); 
          JLabel Modelo = new JLabel("Modelo: ");
          JTextField texto2 = new JTextField(15);
          JLabel AnoModelo = new JLabel("Ano do modelo ");
          JTextField texto3 = new JTextField(15);
          JLabel AnoFabricacao = new JLabel("Ano de Fabricação: ");
          JTextField texto4 = new JTextField(15);
          JLabel Motorizacao = new JLabel("Motorização: ");
          JTextField texto5 = new JTextField(15);
          JLabel cor  = new JLabel("Cor: ");
          JTextField texto6 = new JTextField(15);
          JLabel placa = new JLabel("Placa");
          JTextField texto7 = new JTextField (15);
          JLabel Combustivel = new JLabel("Combustiveis: ");
          String[] opcoes = {"Gasolina", "Alcool", "Diesel", "Biodiesel","Flex"};
          JComboBox<String> CombustivelBox= new JComboBox<>(opcoes);
		      JLabel RENAVAN = new JLabel("RENAVAN");
          JTextField texto8 = new JTextField(15);
          JButton btnIns = new JButton();
          btnIns.setBounds(70, 70, 60, 20);
          btnIns.setText("Inserir");


           panel.add(titulo);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(placa);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(texto7);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(RENAVAN);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(texto8);
           panel.add(Box.createHorizontalStrut(8000)); 
           panel.add(Marca);
           panel.add(Box.createHorizontalStrut(1000));
           panel.add(texto1);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(Modelo); 
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(texto2);  
           panel.add(Box.createHorizontalStrut(8000));
           panel.add (AnoFabricacao);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(texto3);
           panel.add(Box.createHorizontalStrut(8000)); 
           panel.add(AnoModelo);
           panel.add(Box.createHorizontalStrut(1000));
           panel.add(texto4);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(Motorizacao); 
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(texto5);  
           panel.add(Box.createHorizontalStrut(8000));
           panel.add (cor);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(texto6);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(Combustivel);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(CombustivelBox);
           panel.add(Box.createHorizontalStrut(8000));
           panel.add(btnIns);
           
           jf1.setVisible(true);
             }

             
              private static void registrarAbastecimento() throws Exception{

              
                if (veiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo registrado. Registre um veículo primeiro.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

      

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField quilometragemField = new JTextField(10);
        JTextField valorField = new JTextField(10);
        JTextField quantidadeField = new JTextField(10);



        panel.add(new JLabel("Quilometragem:"));
        panel.add(quilometragemField);
        panel.add(Box.createVerticalStrut(15));

        panel.add(new JLabel("Valor (R$):"));
        panel.add(valorField);
        panel.add(Box.createVerticalStrut(15));

        panel.add(new JLabel("Quantidade de combustível (litros):"));
        panel.add(quantidadeField);
        panel.add(Box.createVerticalStrut(15));

        // panel.add(new JLabel("Tipo de Combustível:"));
        // panel.add(CombustivelBox);

        int result = JOptionPane.showConfirmDialog(null, panel, "Registrar Abastecimento", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);


                

                
      }
          }
             
  




    