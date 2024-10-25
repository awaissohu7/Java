public class L2T4 {
    public static void main(String[] args) {
        


//Write java code that creates an array named odds and stores all odd numbers between 1 and 30 into it using a for loop.

/*int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
for(int i=0;i<a.length;i++)
{
    if(i%2==0)
    {
        System.out.println(a[i]);
    }
}

*/

int a[]=new int[15];
int count=0;

for(int i=0;i<30;i++)
{
    if(i%2!=0)
    {
        a[count]=i;
        count++;
    }
    System.out.println("Odd numbers between 1 and 30:");
    for ( int j= 0; j < count; j++) 
    { 
        System.out.println(a[j]);
    }

    }
    }
}
