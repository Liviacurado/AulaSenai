package ArquivoJson;

import org.json.*;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;
import org.json.simple.JsonArray;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

 @SuppressWarnings("deprecation")
public class EscritaJson {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException{
        JSONObject jsonObject ;

        //JsonArray array = new JsonArray();

        JSONParser parse = new JSONParser ();

          String nome;
          String ultimoNome;
          String cidade;
          String estado;


           // como inserir de diversas vezes ( usar array )
          try {
              
            jsonObject = (JSONObject) parse.parse(new FileReader("ManipuladoraArquivos\\src\\ArquivoJson\\saida.json"));
             nome = (String)jsonObject.get("Nome");
             ultimoNome = (String)jsonObject.get("Ultimo Nome");
             cidade =  (String)jsonObject.get("Cidade");
             estado =  (String)jsonObject.get("Estado");
              
             System.out.println("O nome completo da pessoa é"+ nome +","+ ultimoNome + "\nNascido em:" + cidade + " No estado de(o)" + estado+ ".");
           
              
          } catch (FileNotFoundException e) {
            e.printStackTrace();
          }
           catch (IOException e ){
            e.printStackTrace();
          
             
           }
          
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // FileWriter fw = null;
        // jsonObject.put("Nome"," Livia ");
        // jsonObject.put ("Ultimo Nome ", " Curado ");
        // jsonObject.put("Cidade", " Destrito Federal");
        // jsonObject.put(" Estado "," Brasilia ");

        // try {
        //     fw = new FileWriter("ManipuladoraArquivos\\src\\ArquivoJson\\saida.json");
        //     fw.write(jsonObject.toString());
        //     fw.close();
            
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        
        // System.out.println(jsonObject);


    }

}
