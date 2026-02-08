# Memento Design Pattern
this is also called Snapshot design pattern

- It is a Behavioral Design Pattern
- Why is Required and when to use<br>
  - Provide an ability revert an object to it's previous stage (UNDO Capability)
  - and it does not expose object internal implementation.


## Memento Pattern component
1. Originator
2. Memento
3. CareTaker

### Originator
- It represents the object for which state need to be saved or restored. 
- Expose method to save and restore it's state using Memento Object

### Memento
- It's represent the object which hold the state of the originator

### Caretaker
- Manage all the list of state (i.e. List of Memento)

