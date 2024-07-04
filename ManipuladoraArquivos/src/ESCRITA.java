
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ESCRITA {
public static void main(String[] args) {

    try { BufferedWriter writer = new BufferedWriter (new FileWriter ("output.txt"));
        writer.write("OLA ME CHAMO LIVIA");
        writer.close();
    } catch (Exception e) {
        System.err.println(e);
    }
    }
    
}

