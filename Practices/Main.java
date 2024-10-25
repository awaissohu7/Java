class Outer{
    
    int a=10;
    public void displayOut(){
        System.out.println("A from outer class " + a);
    }
    class Inner{
        int b = 90;
        public void displayIn(){
            System.out.println("B from Inner class " + b);
        }
    }
}

public class Main{
    public static void main(String[] args){
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();

    }
}