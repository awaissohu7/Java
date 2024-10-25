class Human{
 int age;
int marks;
String remarks;


 int getAge() {
    return age;
}
void setAge(int a)
{
    age=a;
}





}


class Settergetter{

    public static void main(String[] args) {
        
Human Awais=new Human();

Awais.marks=25;
Awais.remarks="good";
Awais.setAge(17);

System.out.println(Awais.getAge());
System.out.println(Awais.marks);
System.out.println(Awais.remarks);
















    }
}
