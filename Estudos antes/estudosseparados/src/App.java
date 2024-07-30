
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {

        JFrame jf= new JFrame();
          jf.setLayout(new BorderLayout(10,5));
          jf.setTitle("Turistando");
          jf.setSize(300,800);
          jf.setLocationRelativeTo(null);
          jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
          
          
          
          JPanel panel = new JPanel();
           panel.setLayout(new FlowLayout(FlowLayout.CENTER));
           jf.add(panel,BorderLayout.CENTER);
           panel.setLayout(new FlowLayout(FlowLayout.LEFT));
          
            
          JLabel labelc = new JLabel("          Cadastro Veiculo           ");
          
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
          


           panel.add(labelc);
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
          
           
           

           jf.setVisible(true);

       
    }
  }
      