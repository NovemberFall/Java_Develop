### `The Object and Class Concep`

### Objects are entities in a computer program that have three characteristic properties:
- State
  `The collection of all information held by an object is the object’s state.`
- Behavior
  `The behavior of an object is defined by the operations (or methods, as they are called in Java) that an object supports.  `
- Identiy




### `Identifying Classes`

- Class names should be nouns in the singular form: Message, Mailbox. 
- Sometimes the noun needs to be prefixed by an adjective or participle: RectangularShape, BufferedReader.


### Agent class
- The Scanner class is another example. Scanner is used to scan for numbers and strings in an input stream. Thus, the operation of parsing input is encapsulated in the Scanner agent.
- Agent classes often end in “er” or “or”.
- An example is a MouseEvent class, which remembers when and where the mouse was moved or clicked.








### `Relationships Between Classes`
1 Dependency (“uses”)
    - A class depends on another class if it manipulates objects of the other class in any way.
    - For example, the class Mailbox in a voice mail system uses the Message class because Mailbox objects manipulate Message objects.
    - It is almost easier to understand when a class doesn't depend on another. If a class can carry out all of its tasks without being aware that the other class even exists, then it doesn’t use that class.

    - One important design goal is to minimize the number of dependency relationships; that is, to minimize the coupling(耦合) between classes. If one class is unaware of the existence of another, it is also unconcerned about any changes in that other class. A low degree of coupling(耦合) tends to make it much easier to implement changes in the future.




2 Aggregation (“has”)
    - `Aggregation` takes place if objects of one class contain objects of another class over a period of time. For example, `MessageQueue` has `Message` objects, and we say that the `MessageQueue` class *aggregates* the Message class
    - Aggregation is a special case of dependency. Of course, if a class contains objects of another class, then it is acutely aware of the existence of that class.
    - Aggregation is usually implemented through instance fields. For example, if a mailbox has a greeting, then the Java implementation might look like this:
```java
public class Mailbox{
    ...
    private Greeting myGreeting;
}
```
    - This particular implementation can serve as a 1:1 or 1:0...1 relationship (if you allow myGreeting == null to indicate that there is no greeting for a particular mailbox).For a 1:n relationship, you need an array or a collection object. For example,
```java
public class MessageQueue{
    ...
    private ArrayList<Message> elements;
}
```

    - However, not all instance fields of a class correspond to aggregation. If an object contains a field of a very simple type such as a number, string, or date, it is considered merely an attribute, not aggregation. 
```java

/* For example, suppose a message has a time stamp of type Date */
public class Message{
    ...
    private Date timestamp;
}

/* 
We consider Date a foundational type, just like a number or a string. Thus, we don’t say that the Message class aggregates the Date class, but we consider the time stamp an attribute.
 */
```



3 Inheritance (“is”)






















### `Sequence Diagrams`

- Class diagrams are static—they display the relationships among the classes that exist throughout the lifetime of the system.
- In contrast, a sequence diagram shows the dynamics of a particular scenario. 

- Sequence diagrams describe interactions between objects. In UML, you use `underline` to distinguish object rectangles from class rectangles. 

    - objectName : ClassName (full description)
    - objectName (class not specified)
    - : ClassName (object not specified)


