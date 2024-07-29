public class App {
    public static void main(String[] args) throws Exception {
        
        private static void gerarRelatorioDespesas() {
            try {
                String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
                String[] categorias = {"Manutenção", "Imposto", "Multa", "Outro", "Todos"};
                String categoria = (String) JOptionPane.showInputDialog(null, "Escolha a categoria do relatório", "Categoria", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
    
                List<Despesa> relatorio;
                if (categoria.equals("Todos")) {
                    relatorio = gestorDeVeiculos.gerarRelatorioDespesas(placa, "");
                } else {
                    relatorio = gestorDeVeiculos.gerarRelatorioDespesas(placa, categoria.toLowerCase());
                }
    
                StringBuilder sb = new StringBuilder("Relatório de Despesas:\n");
                for (Despesa despesa : relatorio) {
                    sb.append(despesa.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            } catch (VeiculoNaoCadastradoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    }

