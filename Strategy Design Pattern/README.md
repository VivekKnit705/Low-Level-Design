# Strategy Design Pattern

```java
class vehicle {
    void dive() {
        System.out.println("Normal Driving Capability");
    }
}

class SportsVehicle extends vehicle {
    @Override
    void dive() {
        System.out.println("Sports Driving Capability");
    }
}

class OffRoadVehicle extends vehicle {
    @Override
    void dive() {
        System.out.println("Sport Driving Capability");
    }
}

class GoodsVehicle extends vehicle {
    @Override
    void dive() {
        System.out.println("Normal Driving Capability");
    }
}
```

above code is without strategy design pattern and we are writing dive method in each class. and this is causing code duplication. we can use strategy design pattern to avoid code duplication.

```java
interface DrivingStrategy {
    void drive();
}   
class NormalDrivingStrategy implements DrivingStrategy {
    public void drive() {
        System.out.println("Normal Driving Capability");
    }
}
class SportsDrivingStrategy implements DrivingStrategy {
    public void drive() {
        System.out.println("Sports Driving Capability");
    }
}

class Vehicle {
    private DrivingStrategy drivingStrategy;

    public Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void drive() {
        drivingStrategy.drive();
    }
}

class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDrivingStrategy());
    }
}
class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDrivingStrategy());
    }
}
class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDrivingStrategy());
    }
}  
```

In the above code, we have created a DrivingStrategy interface which has a drive method. We have created two classes NormalDrivingStrategy and SportsDrivingStrategy which implements the DrivingStrategy interface. The Vehicle class has a reference of DrivingStrategy interface and it is initialized through constructor. The drive method of Vehicle class calls the drive method of the strategy class. The SportsVehicle, OffRoadVehicle and GoodsVehicle classes extend the Vehicle class and pass the appropriate strategy class to the super class constructor