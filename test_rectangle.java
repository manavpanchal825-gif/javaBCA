abstract class Shape 
{
    abstract void draw();
}

class Rectangle extends Shape
{
    void draw()
      {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape 
{
    void draw() 
    {
        System.out.println("drawing circle");
    }
}
public class test_ractangle 
{
    public static void main(String[] args)
    {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}
