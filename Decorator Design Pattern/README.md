# Decorator Design Pattern

Decorator design pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It is a structural pattern that acts as a wrapper to existing class.

```java
public abstract class BasePizza{
    public abstract int getCost();
}
public class MargheritaPizza extends BasePizza{
    @Override
    public int getCost(){
        return 500;
    }
}   

public class FarmHousePizza extends BasePizza{
    @Override
    public int getCost(){
        return 700;
    }
}

public class VegDeluxePizza extends BasePizza{
    @Override
    public int getCost(){
        return 800;
    }
}

public abstract class ToppingDecorator extends BasePizza{
    protected BasePizza basePizza;
    public ToppingDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
}

public class CheeseTopping extends ToppingDecorator{
    public CheeseTopping(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int getCost(){
        return basePizza.getCost() + 100;
    }
}
public class OlivesTopping extends ToppingDecorator{
    public OlivesTopping(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int getCost(){
        return basePizza.getCost() + 150;
    }
}
class Main {
    public static void main(String[] args) {
        BasePizza pizza = new MargheritaPizza();
        System.out.println("Cost of Margherita Pizza: " + pizza.getCost());

        pizza = new CheeseTopping(pizza);
        System.out.println("Cost of Margherita Pizza with Cheese Topping: " + pizza.getCost());

        pizza = new OlivesTopping(pizza);
        System.out.println("Cost of Margherita Pizza with Cheese and Olives Topping: " + pizza.getCost());
    }
}
```
