# Comparable Interface
### The Comparable interface defines the compareTo method for comparing objects.
```java
public interface Comparable<E> { 
    public int compareTo(E o);
}

/*
The Comparable interface has a single method:
    public interface Comparable {
        int compareTo(Object otherObject); 
    }
 */

/* 
Since all Comparable objects have the compareTo method, the java.util.Arrays .sort(Object[]) method in the Java API uses the compareTo method to compare and sorts the objects in an array, provided that the objects are instances of the Comparable interface.
 */
/*
    You cannot use the sort method to sort an array of Rectangle objects, 
    because Rectangle does not implement Comparable. 
    However, you can define a new rectangle class that implements Comparable.
*/

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
        public ComparableRectangle(double width, double height){
            super(width,  height);
        }
        @Override // Implement the compareTo method defined in Comparable
        public int compareTo(ComparableRectangle o){
            if(getArea() > o.getArea()){
                return 1;
            }else if(getArea() < o.getArea()){
                return -1;
            }else{
                return 0;
            }
        }
        @Override // Implement the toString method in GeometricObject
        public String toString(){
            return super.toString()+" Area: "+getArea();
        }
}


```










