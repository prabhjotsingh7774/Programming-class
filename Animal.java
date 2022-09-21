package Lab10;

/* PARENT CLASS */
abstract class Animal
{
    private String name;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    abstract public void greets();
}

/* CHILD CLASS 1 - PARENT CLASS Animal*/
class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }
    
    public void greets()
    {
        System.out.println("Meow");
    }
}

/* CHILD CLASS 2  - PARENT CLASS Animal */
class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    
    public void greets()
    {
        System.out.println("Woof");
    }
    
    public void greets(Dog another)
    {
        System.out.println("Woooof");
    }
}

/* CHILD CLASS 3  - PARENT CLASS Dog */
class BigDog extends Dog
{
    public BigDog(String name)
    {
        super(name);
    }
    
    public void greets()
    {
        System.out.println("Wooow");
    }
    
    public void greets(Dog another)
    {
        System.out.println("Woooooow");
    }
    
    public void greets(BigDog another)
    {
        System.out.println("Wooooooooow");
    }
}


