
import javax.swing.JFrame;


public class Snakegame extends JFrame
{

    Snakegame()
    {
        super("Awais Snake Game");
        new Board();
        pack()







        setVisible(true);
        setSize(700,400);
        setLocationRelativeTo(null);
















    }


    public static void main(String[] args)
    {
        new Snakegame();
    }

}