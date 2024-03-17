import java.util.ArrayList;

public class Q2
{
    public static void main(String[] args)
   {

      ArrayList<Shape> Circles = new ArrayList<>();
      ArrayList<Shape> Rectangles = new ArrayList<>();

      Circles.add(new Circle());
      Circles.add(new Circle());
      Circles.add(new Circle());

      Rectangles.add(new Rectangle());
      Rectangles.add(new Rectangle());
      Rectangles.add(new Rectangle());



      Test test = new Test();

      test.Test(Circles);
      test.Test(Rectangles);




        
    }
       



}
   