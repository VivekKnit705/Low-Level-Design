# Structural Design Pattern

Structural Design pattern is a way to combine or arrange different classes and object to form a complex or bigger structure to solve a particular Problem

**Type:**

### Decorator Design Pattern

It helps to add more functionality to the Existing object without changing its original structure.

### Proxy Design Pattern

Proxy gives you the Control to the object access

### Composite Design Pattern

This Pattern help when we have Object inside Object (tree Like Structure)

### Adapter Design Pattern

this Pattern act as Bridge between two incompatible interface.


### Bridge Design Pattern

This design pattern decouple the abstraction from its implementation

### Facade Design Pattern

this help to hide the complexity from the user.

Example 1: Expose Only the necessary method to client<br>
Example 2: Hide the system complexity

### Flyweight Design Pattern

this pattern helps to reduce the memory by sharing data among other objects

**Intrinsic Data:** shared among all the data and remain same for all the object<br>
**Extrinsic Data:** change base on the client Input

- From the class remove all the Extrinsic data keep only Intrinsic data
- Extrinsic data can be passes to the Flyweight class.
- Caching can be used for Flyweight object and use whenever required.