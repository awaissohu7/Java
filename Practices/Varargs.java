public class Varargs {
    
    void add(int...a)
    {
        for(int x:a)
        {
        int sum=0;
        sum=sum+x;
        System.out.println(sum);
    }
    }

    public static void main(String[] args) {
        

        Varargs v=new Varargs();
        v.add(10,20);
        v.add(40,50);
      




    }





}












