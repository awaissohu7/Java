
//Task 3.Write a Java program to copy an array into another array by iterating the first array.

public class L2T3 {
    
    public static void main(String[] args) {

        int a[]={2,4,6,8,10};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        {

            b[i]=a[i];

        }

        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

    }
}