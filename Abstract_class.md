### Abstract Classes

- assume the interface type:
![](img/2019-11-25-11-04-33.png)
---
- We'll then define classes CarShape and HouseShape that implement this interface type
- Because every shape needs to keep a selection flag, the naive approach would be to supply the selection flag separately in each class:
![](img/2019-11-25-11-05-10.png)
---
- Clearly, it is a better idea to design a class that expresses this commonality
- We will call this class SelectableShape
![](img/2019-11-25-11-05-41.png)
---
![](img/2019-11-25-11-05-53.png)
---
- However, there is a problem with the `SelectableShape` class. It does not define all of the methods of the `SceneShape` interface type. 
- Four methods are left undefined in this class
```java
void draw(Graphics2D g2)
void drawSelection(Graphics2D g2)
void translate(double dx , double dy)
boolean contains(Point2D aPoint)
```
- We say that these methods are undefined or abstract in the `SelectableShape` class
- It is the job of further subclasses to define them
- For that reason, the `SelectableShape` class must be tagged as `abstract`:
```java
public abstract class SelectableShape implements SceneShape {

}
```
- The `HouseShape` and `CarShape` classes are `concrete subclasses` that define the remaining methods
- `Abstract classes` are convenient placeholders for **factoring out common behavior**
- They behave exactly the same as any other classes, with a single exception: **You cannot instantiate an abstract class**
![](img/2019-11-25-11-14-57.png)
- However, having variables whose type is an abstract class is legal
- Naturally, they **must contain a reference to an object of a concrete subclass (or null)**:
```java
SelectableShape shape = new HouseShape(); // OK
```







