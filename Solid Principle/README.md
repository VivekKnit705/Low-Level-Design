# Solid Principle

### S - Single Responsibility Principle
 class have one and only one reason to change.
```java
class UserService {
    void saveUser(User user) {
        // save to database
    }

    void sendEmail(User user) {
        // send welcome email
    }

    void generateReport() {
        // create user report
    }
}
```
above class has two responsibilities: managing items and calculating the total. To adhere to SRP, we can separate these responsibilities into different classes.
```java
class UserRepository {
    void save(User user) {}
}

class EmailService {
    void sendWelcomeEmail(User user) {}
}

class ReportService {
    void generateUserReport() {}
}
```

### O - Open/Closed Principle
 Open for extension but closed for modification.
```java
class DiscountCalculator {
    double calculate(String customerType, double amount) {

        if(customerType.equals("Regular"))
            return amount * 0.05;

        if(customerType.equals("Premium"))
            return amount * 0.10;

        return 0;
    }
}
```
above class violates OCP because if we want to add a new way to save the invoice, we have to modify the existing class. To adhere to OCP, we can use interfaces and inheritance.
```java
interface DiscountStrategy {
    double calculate(double amount);
}

class RegularDiscount implements DiscountStrategy {
    public double calculate(double amount) {
        return amount * 0.05;
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double calculate(double amount) {
        return amount * 0.10;
    }
}
```
### L - Liskov Substitution Principle
If class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of the program.
class should extend the capability of parent class not narrow it down.
```java
class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {

    @Override
    void fly() {
        throw new UnsupportedOperationException(
                "Penguins cannot fly");
    }
}

public class Main {

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {

        Bird sparrow = new Bird();
        Bird penguin = new Penguin();

        makeBirdFly(sparrow);   // Works
        makeBirdFly(penguin);   // Runtime Exception
    }
}
```
Correct

```java
interface Bird {
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {

    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin implements Bird {

    void swim() {
        System.out.println("Swimming");
    }
}

public class Main {

    public static void makeBirdFly(FlyingBird bird) {
        bird.fly();
    }

    public static void main(String[] args) {

        FlyingBird sparrow = new Sparrow();

        makeBirdFly(sparrow);

        Bird penguin = new Penguin();

        // Cannot call makeBirdFly(penguin)
        // Compile-time safety
    }
}
```
### I - Interface Segregation Principle

Interface should be such that, client should not implement methods which they don't use.
```java
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {

    public void work() {}

    public void eat() {
        throw new UnsupportedOperationException();
    }
}
```
A robot doesn't eat.
```java
iinterface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {}
    public void eat() {}
}

class Robot implements Workable {
    public void work() {}
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
