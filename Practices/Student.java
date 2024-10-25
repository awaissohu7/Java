public class Student {
    private String name;
    private int age;
    private char grade;

    public void setname(String name)
    {
        this.name=name;
    }
     public String getname()
    {
        return  name;
    }

    public void setage(int age)
   {
    this.age=age;
   }

   public char getage()
   {
    return age;
   }

   public void setgrade(char grade)
   {
    this.grade=grade;

   }
 
   public char getgrad()
   {
    return grade;
   }

static int studentcount=0;

public static void getStudentcount() 
{
    System.out.println("student count is   "+studentcount);
}
public Student()
{
    studentcount+=1;
}

}
