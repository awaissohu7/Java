class Animal
{
    public void eat()
    {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog drinks  milk");
    }
}

class Test{
    public static void main(String[] args) {
    
    
    
    Animal d=new Dog();
        d.eat();
    
    }
}