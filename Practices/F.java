import java .io.File;
public class F {
    public static void main(String[] args)  {
        File f = new File("\\home\\awais\\kamran.txt");
       try{
        f.createNewFile();
          }
          catch(exce[])
        System.out.println(f.exists());
        System.out.println(f.delete());

        
    }
}
