package ArquivoJson;
import java.io.FileWriter;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonObject;
public class ibgeCnae {
    public static void main(String[] args) {
       
        JsonObject value = Json.createObjectBuilder()
                .add("items", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("id", 1)
                                .add("name", "Item1")
                                .add("bool", true)
                                .add("descrição", Json.createArrayBuilder())
                        )
                        
                )
                        
                        .add("Grupo",Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("id", 2)
                                .add("name", "Item2")
                                .add("bool", false)
                                .add("observações", Json.createArrayBuilder())
                        )
                
                       
                        )
                        
               .build();
  
               try{
               FileWriter writeFile = new FileWriter("\\saida2.txt");
                //Escreve no arquivo conteudo do Objeto JSON
                writeFile.write(value.toString());
                writeFile.close();
        }
        catch(IOException e){
           e.printStackTrace();
        }

       System.out.println(value);

	}
        
    }


