# Factory vs Abstract Factory Design Pattern

## Factory Design Pattern
when we need to create an object based on some condition or parameter, we can use factory design pattern. it provides a way to create objects without exposing the instantiation logic to the client and refers to the newly created object using a common interface.

```java
interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();

    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw();
}
```

## Abstract Factory Design Pattern
when we need to create a family of related or dependent objects without specifying their concrete classes, we can use abstract factory design pattern. it provides an interface for creating families of related or dependent objects without specifying their concrete classes.

```java
interface Vehicale {
    void milage();
}
class LuxuryVehicaleV1 implements Vehicale {
    public void milage() {
        System.out.println("Luxury Vehicale V1 Milage: 15 km/l");
    }
}
class LuxuryVehicaleV2 implements Vehicale {
    public void milage() {
        System.out.println("Luxury Vehicale V2 Milage: 18 km/l");
    }
}
class EconomyVehicaleV1 implements Vehicale {
    public void milage() {
        System.out.println("Economy Vehicale V1 Milage: 20 km/l");
    }
}
class EconomyVehicaleV2 implements Vehicale {
    public void milage() {
        System.out.println("Economy Vehicale V2 Milage: 22 km/l");
    }
}
interface VehicalFactory {
    Vehicale createVehicale();
}
class LuxcuryVehical implements VehicalFactory {
    public Vehicale createVehicale() {
        return new LuxuryVehicaleV1();
    }
}
class EconomyVehical implements VehicalFactory {
    public Vehicale createVehicale() {
        return new EconomyVehicaleV1();
    }
}

