package ArquivoJson;
import java.io.FileReader;
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
                                .add("reserveItems", Json.createArrayBuilder())
                        )
                        
                )
                        
                        .add("Grupo",Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("id", 2)
                                .add("name", "Item2")
                                .add("bool", false)
                                .add("reserveItems", Json.createArrayBuilder())
                        )
                        )
                        
               .build();

               

       System.out.println(value);
	}
        
    }


