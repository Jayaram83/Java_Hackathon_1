class Parent
{
    int x=100;
    void display()
    {
        System.out.println(" i am a parent class");
    }
}
class child extends Parent
{
    int x=200;
    void print()
    {
        System.out.println(" i am a child class");
        System.out.println(x);
        System.out.println(x);
        display();
    }
}
class Test456
{
    public static void main(String args[])
    {
        child obj=new child();
        obj.print();
    }
}