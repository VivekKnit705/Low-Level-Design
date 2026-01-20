# What is Low Level Design (LLD)?
#### Low level design is lies between high level design and actual coding. It is the process of designing the components, modules, and classes of a system in detail. LLD focuses on the internal structure of the system and how the different components interact with each other.

### 1. Categories of Low Level Design:
- Creational Design Patterns: These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. Examples include Singleton, Factory Method, and Abstract Factory.
- Structural Design Patterns: These patterns deal with object composition and typically help ensure that if one part of a system changes, the entire system doesn't need to do the same. Examples include Adapter, Composite, and Decorator. 
- Behavioral Design Patterns: It focuses on how different objects communicate with each other. Like in other work we have above structural design pattern which creates the skeleton of the system, but skeleton will behave is all guided by behavioral design patterns.



### 2. is-a vs has-a

is-a Relationship:
- This relationship represents inheritance between classes.
- It indicates that one class is a specialized version of another class.
- Example: A Dog is an Animal. Here, Dog inherits from Animal.

has-a Relationship:
- show a link between classes.
- Example: A Car has an Engine. Here, Car contains an instance of Engine.
- Example: A Library has Books. Here, Library contains multiple instances of Book.

Association vs Aggregation vs Composition:
- Association: A general relationship between two classes where one class uses or interacts with another class.
- Aggregation: A specialized form of association where one class (the whole) contains instances of another class (the parts), but the parts can exist independently of the whole.
- Composition: A stronger form of aggregation where the parts cannot exist independently of the whole. If the whole is destroyed, the parts are also destroyed.