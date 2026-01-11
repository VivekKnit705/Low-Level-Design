# Solid Principle

### S - Single Responsibility Principle
 class have one and only one reason to change.
```java
public class Invoice {
    private List<Item> items;
    private Customer customer;

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
```
above class has two responsibilities: managing items and calculating the total. To adhere to SRP, we can separate these responsibilities into different classes.
```java
public class Invoice {
    private List<Item> items;
    private Customer customer;

    public void addItem(Item item) {
        items.add(item);
    }
}
```
```java
public clas InvoiceCalculator{
    public double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
```

### O - Open/Closed Principle
 Open for extension but closed for modification.
```java
public class InovoiceDao{
    Inovoice inovoice;
    public void saveToDataBase(){
        //code to save inovoice to database
    }
    public void saveToFile(){
        //code to save inovoice to file
    }
}
```
above class violates OCP because if we want to add a new way to save the invoice, we have to modify the existing class. To adhere to OCP, we can use interfaces and inheritance.
```java
public interface InovoiceSaver{
    void save(Inovoice inovoice);
}

public class DatabaseInovoiceSaver implements InovoiceSaver{
    public void save(Inovoice inovoice){
        //code to save inovoice to database
    }
}

public class FileInovoiceSaver implements InovoiceSaver{
    public void save(Inovoice inovoice){
        //code to save inovoice to file
    }
}
```
### L - Liskov Substitution Principle
If class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of the program.
class should extend the capability of parent class not narrow it down.
```java
interface Bike {
    int accelerate;
    void startEngine();
    void accelerateSpeed();
}

public class MotorCycle implements Bike {
    public void startEngine() {
        System.out.println("bike started");
    }

    public void accelerateSpeed() {
        Bike.accelerate += 10;
        System.out.println("bike accelerated");
    }
}
public class ByCycle implements Bike {
    public void startEngine() {
        System.out.println("bike does not have engine");
    }

    public void accelerateSpeed() {
        Bike.accelerate += 5;
        System.out.println("bike accelerated");
    }
}
```
### I - Interface Segregation Principle

Interface should be such that, client should not implement methods which they don't use.
```java
interface RestaurantEmployee{
    cookFood();
    serveCustomer();
    washDishes();
}

class Waiter implements RestaurantEmployee{
    public void cookFood(){
        //not applicable
    }
    public void serveCustomer(){
        //code to serve customer
    }
    public void washDishes(){
        //not applicable
    }
}
```
above Waiter class is forced to implement cookFood and washDishes methods which are not applicable to it. To adhere to ISP, we can split the interface into smaller interfaces.
```java
interface Cook{
    cookFood();
}
interface Server{
    serveCustomer();
}
interface Dishwasher{
    washDishes();
}

class Waiter implements Server{
    public void serveCustomer(){
        //code to serve customer
    }
}
class Chef implements Cook{
    public void cookFood(){
        //code to cook food
    }
}
class Cleaner implements Dishwasher{
    public void washDishes(){
        //code to wash dishes
    }
}
```

### D - Dependency Inversion Principle

class should depend on interface rather than concrete implementation.
```java

class MacBook{
    private final WiredMouse mouse;
    private final WiredKeyboard keyboard;
    public MacBook(WiredMouse mouse,WiredKeyboard keyboard){
        this.mouse = new WiredMouse();
        this.keyboard = new WiredKeyboard();
    }
}
```

above MacBook class depends on concrete implementations of WiredMouse and WiredKeyboard. To adhere to DIP, we can use interfaces.
in future if we want to use wireless mouse or keyboard, we don't have to modify MacBook class.
```java
class MacBook{
    private final Mouse mouse;
    private final Keyboard keyboard;
    public MacBook(Mouse mouse,Keyboard keyboard){
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}
```
above MacBook class depends on Mouse and Keyboard interfaces rather than concrete implementations.
I can use any implementation of Mouse and Keyboard interfaces. either wired or wireless.

#### Advantages of SOLID Principles:
1. Help us to write better code
2. Reduce duplication
3. Easier to maintain
4. Easier to understand
5. Flexible software
6. Reduce complexity
7. Easier to test