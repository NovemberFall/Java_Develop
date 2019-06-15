# An interface type is similar to a class, but there are several important differences:
- An interface type doesn't have instance variables
- Methods in an interface must be abstract(that is, without an implementation) 
- All methods in an interface type are automatically public
- An interface type has no constructor. Interface are not classes, and you cannot construct objects of an interface type.


# Implementing an Interface Type:
```java
public class BankAccount implements Measurable
{
        ...
    public double getMeasure()
    {
        return balance;
    } 
}
```
- Once the BankAccount class implements the Measurable interface type, BankAccount objects are instances of the Measurable type:
```java
Measurable obj = new BankAccount();  //OK
```
![](img/1.png)
### further on, the source code in bigjava section_1


---
# A class can implement more than one interface, for example
```java

public class Country implements Measurable, Named

public interface Named {
    String getName(); 
}

```

---
# Constants in Interfaces
- Interfaces cannot have instance variables, but it is legal to specify constants. When declaring a constant in an interface, you can (and should) omit the reserved words public static final, because all variables in an interface are automatically public static final. For example,
```java
public interface Named{
    String NO_NAME = "...";
    ...
}
```

---
# Static Methods in Interfaces
- Before Java 8, all methods in an interface had to be abstract. Java 8 allows static methods in interfaces that work exactly like static methods in classes. A static method of an interface does not operate on objects, and its purpose should relate to the interface that contains it.
```java
public interface Measurable
{
   double getMeasure();  // An abstract method

   static double average(Measurable[] objects) // A static method
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   } 
}
/*
To call this method, provide the name of of the interface and the method name: 
 */
double meanArea = Measurable.average(countries);
```

---
# default metonds
### A default method is a non-static method in an interface that has an implementation. A class that implements the method either inherits the default behavior or overrides it. By providing default methods in an interface, it is less work to define a class that implements an interface.
*For example, the Measurable interface can declare getMeasure as a default method:*
```java
public interface Measurable {
    default double getMeasure() { return 0; } 
}

```

