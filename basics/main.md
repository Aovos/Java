# `main` Method in Java

### What is the `main` Method?

> The `main` method is the entry point of every standalone Java application.
>
> When a Java program is started, the Java Virtual Machine (JVM) searches for this method and executes it first.
>
> Without a valid `main` method, a Java application cannot be started directly.

### General Syntax

```java
public static void main(String[] args) {

    // Code to be executed

}
```

### Understanding the Keywords

```java
public static void main(String[] args)
```

- `public`
  - Makes the method accessible to the JVM.

- `static`
  - Allows the method to be called without creating an object of the class.

- `void`
  - Indicates that the method does not return a value.

- `main`
  - The predefined method name recognized by the JVM as the program entry point.

- `String[] args`
  - Stores command-line arguments passed to the program.

### Example `main` Method

The `main` method is the first method executed when a Java application starts.

```java
public class HelloWorld {

    // main Method
    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

}
```

**Output:**

```text
Hello World!
```

### Example with Variables

Variables can be declared and used inside the `main` method like in any other method.

```java
public class Person {

    // main Method
    public static void main(String[] args) {

        String name = "Alex";
        int age = 25;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}
```

**Output:**

```text
Name: Alex
Age: 25
```

### Example Calling Another Method

The `main` method is often used to start the application's logic by calling other methods.

```java
public class Application {

    // main Method
    public static void main(String[] args) {

        greetUser();

    }

    public static void greetUser() {

        System.out.println("Welcome!");

    }

}
```

**Output:**

```text
Welcome!
```

### Important Notes

> The `main` method is the starting point of every standalone Java application.
>
> The JVM automatically executes the `main` method when the program starts.
>
> The method signature is typically written as `public static void main(String[] args)`.
>
> The `main` method can contain statements, variables, loops, conditions, and method calls.
>
> A class can contain many methods, but program execution begins with the `main` method.
