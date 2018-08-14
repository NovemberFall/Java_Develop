public class InterfaceDemoDefaultMethod{
	public static void main(String[] args){
		Person p = new Person("Antonio");

		p.display();
	}
}

/*
NOTE: One of the benefits of having default methods is that 
they allow you to add new methods to an existing interface 
without causing errors in the classes that already implement the interface. 
Prior to Java 8, when you added a new method header to an existing interface, 
all of the classes that already implement that interface 
had to be rewritten to override the new method. 
Now you can add default methods to an interface, 
and if an existing class (that implements the interface) 
does not need the new method, you do not have to rewrite the class.
*/