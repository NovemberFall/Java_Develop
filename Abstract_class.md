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

