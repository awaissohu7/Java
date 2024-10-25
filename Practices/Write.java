import java.io.FileWriter;
import java.io.IOException;
public class Write {


 public static void main(String args[])
 throws IOException
 {

    try{    
        FileWriter fw=new FileWriter("/home/awais/abc.txt");
        fw.write("AWais is A Good Boy and He is Sohu By Caste");
        

    }
    catch(Exception e)
    {
            System.out.println("File not found");
 }
}
}
