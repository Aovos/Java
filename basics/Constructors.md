# `Constructors` in Java

### What is a `Constructor`?

> A `constructor` is a special block of code in a class that is called when a new object of that class is created.
>
> The main purpose of a `constructor` is to set the initial states of the object's attributes and to initialize resources.
>
> `Constructors` always have the exact same name as the class and do not have any return type, not even `void`.

### General Syntax

```java
public class ClassName {
    // Class attributes
    private DataType attribute;

    // Constructor
    public ClassName(DataType parameter) {
        this.attribute = parameter;
    }
}
```

### Example: `Constructor`

`Constructors` allow parameters to be passed in to initialize the attributes of an object at the exact time of its creation.

```java
public class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating a new Car object using the constructor
        Car myCar = new Car("Volkswagen", "Golf", 2020);
        myCar.display();
    }
}
```

**Output:**
```text
Brand: Volkswagen, Model: Golf, Year: 2020
```

### Important Notes

> A `constructor` is automatically invoked when the `new` keyword is used to instantiate an object.
>
> If you do not write any `constructor`, Java automatically provides a hidden, no-argument **Default `Constructor`**.
>
> As soon as you define at least one custom `constructor`, the automatic default `constructor` disappears.
>
> The `this` keyword is used inside the `constructor` to differentiate between the class attributes and the incoming parameters if they share the same name.
>
> A class can have multiple `constructors` with different parameter lists (known as **`Constructor` Overloading**).
