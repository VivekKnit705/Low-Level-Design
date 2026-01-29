# NULL OBJECT DESIGN PATTERN

Let's take an example

```java
public void printEmployeeDetails(Employee employee){
    System.out.println("Employee Name: "+ employee.name);
    System.out.println("Employee Department: "+ employee.department);
}
```

In above Example what if the Employee is null then it will throw NullPointerException.

```java
public void printEmployeeDetails(Employee employee){
    if(employee==null){
        return;
    }
    System.out.println("Employee Name: "+ employee.name);
    System.out.println("Employee Department: "+ employee.department);
}
```

above example is correct but what if we have big project then checking multiple null checks will make the code messy.

To avoid this we can use Null Object Design Pattern.

1. A null Objects will replace the Null return
2. No need to put null checks
3. Null check reflects to nothing or Default Behavior
