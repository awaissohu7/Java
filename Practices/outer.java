public class outer 
{
int x=10;
void show()
{
    System.out.println(x);
}

class inner
{
    int y=5;
    void display(){
    System.out.println(x+y);
    }
}
public static void main(String[] args) {
    
outer out=new outer();
System.out.println(out.x);

outer.inner in= outer out.new inner();















}

    
}
