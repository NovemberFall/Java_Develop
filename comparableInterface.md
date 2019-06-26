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
Since all Comparable objects have the compareTo method, 
the java.util.Arrays .sort(Object[]) method in the Java API 
uses the compareTo method to compare and sorts the objects in an array, 
provided that the objects are instances of the Comparable interface.
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
# example:
- since BankAccount implements Comparable, in the main method we can call sort
```java
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Comparable
{  
   private double balance;

   public BankAccount()
   {   
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   public double getBalance()
   {   
      return balance;
   }

   public int compareTo(Object otherObject)
   {
      BankAccount other = (BankAccount) otherObject;
      if (balance < other.balance) { return -1; }
      if (balance > other.balance) { return 1; }
      return 0;
   }
}

public class ComparableTester
{
   public static void main(String[] args)
   {
      BankAccount[] accounts = new BankAccount[3];
      accounts[0] = new BankAccount(10000);
      accounts[1] = new BankAccount(0);
      accounts[2] = new BankAccount(2000);      
      Arrays.sort(accounts);   
      // here can call the .sort method, since BankAccount implements Comparable
      for (int i = 0; i < accounts.length; i++)
      {
	 System.out.print(accounts[i].getBalance() + " ");
      }
      System.out.println();
      System.out.println("Expected: 0.0 2000.0 10000.0");
   }
}
```









