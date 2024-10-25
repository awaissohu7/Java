/*public class Student {
    int rollno;
    String name;
    static String College="ITS";
    Student(int r, String n)
    {
        rollno=r;
        name=n;
    }
    
    void Display()
        {
            System.out.println(rollno + "  "+ name +"  "+College );
        }
    


public static void main(String[] args) {
    Student s1=new Student(111, "kamran");
    Student s2=new Student(123, "Awais ");

s1.Display();
s2.Display();

}
}
*/

class StudentS{
int rollno;
String name;
static String college = "ITS";

static void change()
{
college = "BBDIT";
}

StudentS(int r, String n )
{
rollno = r;
name = n;
}

void display()
{
    System.out.println(rollno+" "+name+" "+college);
}

public static void main(String args[])
{

StudentS s1 = new StudentS(111,"Karan");
StudentS s2 = new StudentS(222,"Aryan");
StudentS s3 = new StudentS(333,"Sonoo");
StudentS.change();

s1.display();
s2.display();
s3.display();
}
}