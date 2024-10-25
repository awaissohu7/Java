//Task 4. Write code that creates an array named odds and stores all odd numbers between 1 and 30 into it using a for loop.

public class L2T4 {
    int[] odds = new int[15];
    int count = 0;

    for (int i = 1; i <= 30; i++) {
        if (i % 2 != 0) {
            odds[count] = i;
            count++;
        }
    }

    public static void main(String[] args) {
        L2T4 obj = new L2T4();
        for (int i = 0; i < obj.count; i++) 
        {
            System.out.println(obj.odds[i]);
        }
    }

}
