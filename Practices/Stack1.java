public class Stack1 {

int[]a=new int [5];
int tos;
a()
{
tos==-1;
}

void push (int x)
{
    if(tos==5)
    {
        System.out.println("Stack is full");
    }
    else{
        a[++tos]=x;
    }
}
int pop ()
{
    if(tos<0)
    {
        System.out.println("Stack is empty");
        return 0;
    }
    else{
        return [tos--];
    }
}














    
}
