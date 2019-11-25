### The Hierarchy of Exception Classes
- The Java library uses inheritance to categorize a large number of exception classes
![](img/2019-11-25-11-31-26.png)
---
![](img/2019-11-25-11-32-41.png)
---
- All subclasses of RuntimeException are **unchecked**
    - The compiler does not check whether your methods catch or declare them
    - You need to avoid this type of exceptions!
![](img/2019-11-25-11-33-30.png)
---
![](img/2019-11-25-11-34-51.png)
---
![](img/2019-11-25-11-35-58.png)
---
![](img/2019-11-25-11-36-49.png)
---




### Standard library or brand new? 
- When you encounter an error condition in your code, and you want to throw an exception, then you need to make a **decision** whether to **use an exception class in the standard library**, or whether to **design your own exception class** 
- If you design your own class, you first need to decide whether the exception should be `checked` or `unchecked`
- `Unchecked` exceptions must be subclasses of **RuntimeException**
---

- When you design an exception class, you should provide 2 constructors: 
    1. A `default constructor`
    2. A `constructor` with a `string parameter` that signifies the reason for the exception
        - This constructor should simply pass the reason string to the superclass constructor
---
- Example: You want to throw an `IIIegalFormatException` when a user enters information in the wrong format
    - Since user actions are beyond the control of the programmer, we design a `checked exception`
    - We inherit from the `Exception` class but not from `RuntimeException`
![](img/2019-11-25-11-42-21.png)
---




