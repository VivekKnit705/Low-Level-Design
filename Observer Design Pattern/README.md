# Observer Design Pattern

```java

interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}

public class EmailAlertObserver implements StockObserver {
    private String email;
    private Observable observable;

    public EmailAlertObserver(String email, Observable observable) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("Email to " + email + ": Stock " + stockSymbol + " is now $" + stockPrice);
    }
}


public class SMSAlertObserver implements StockObserver {
    private String phoneNumber;
    private Observable observable;

    public SMSAlertObserver(String phoneNumber, Observable observable) {
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("SMS to " + phoneNumber + ": Stock " + stockSymbol + " is now $" + stockPrice);
    }
}

````

```java
interface Observable {
    List<Observer> observers;
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
    void setData(String data);
    void getData();
}

public class iPhoneObservable implements Observable {
    private List<Observer> observers;
    private int data;

    public iPhoneObservable() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void setData(int data) {
        if(data ==0){
            notifyObservers(data);
        }
        this.data+= data;
        
    }

    @Override
    public void getData() {
        System.out.println("Current stock: " + news);
    }
}

public class GooglePixcelObservable implements Observable {
    private List<Observer> observers;
    private int data;

    public GooglePixcelObservable() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void setData(int data) {
        if(data ==0){
            notifyObservers(data);
        }
        this.data+= data;
        
    }

    @Override
    public void getData() {
        System.out.println("Current Stock: " + news);
    }
}
```