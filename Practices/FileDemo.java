import java.io.File;

class FileDemo{

public static void main(String[] args) {
    
File f1= new File("/home/awais/abc.txt");


System.out.println(f1.exists());
System.out.println(f1.length());
//System.out.println(f1.delete());
System.out.println(f1.exists());

}
}
