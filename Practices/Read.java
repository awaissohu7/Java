import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
class Read{
    public static void main(String args[]) throws IOException{

        File myFile=new File("/home/awais/abc.txt");
try{
Scanner sc=new Scanner(myFile);
while(sc.hasNextLine())
{
String line=sc.nextLine();
System.out.println(line);
}
sc.close();
}
catch(FileNotFoundException e){
    System.out.println(e);
}

    }

}