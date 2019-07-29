# Using Interfaces for Callbacks

- When collecting rectangles, we might give it a method for computing the area of a rectangle. When collecting cars, we might give it a method for getting the car’s price.

- Such a method is called a **callback**. A callback is a mechanism for bundling up a block of code so that it can be invoked at a later time.

```java
public interface Measurer
{
    /**
      Computes the measure of an object.
      @param anObject the object to be measured
      @return the measure
   */
   double measure(Object anObject);
}

/**
   Objects of this class measure rectangles by area.
*/
public class AreaMeasurer implements Measurer
{
    //Such a method is called a **callback**.
   public double measure(Object anObject)
   {
      Rectangle aRectangle = (Rectangle) anObject;
      double area = aRectangle.getWidth() * aRectangle.getHeight();
      return area;
   }
}

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of objects
      @param meas the measurer for the objects
      @return the average of the measures
   */
   public static double average(Object[] objects, Measurer meas)
   {
      double sum = 0;
      for (Object obj : objects)
      {
         sum = sum + meas.measure(obj);
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
}

/**
   This program demonstrates the use of a Measurer.
*/
public class MeasurerTester
{
   public static void main(String[] args)
   {
      Measurer areaMeas = new AreaMeasurer();

      Rectangle[] rects = new Rectangle[] 
         {
            new Rectangle(5, 10, 20, 30),
            new Rectangle(10, 20, 30, 40),
            new Rectangle(20, 30, 5, 15)
         };

      double averageArea = Data.average(rects, areaMeas);
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 625");
   }
}
/*
output:
Average area: 625
Expected: 625 Í
 */
```
















