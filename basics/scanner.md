# `Scanner` in Java

### What is a `Scanner`?

> The `Scanner` class is part of the `java.util` package.
>
> It is commonly used to read input from the keyboard, files, or strings.
>
> The `Scanner` class can convert user input into different data types such as `String`, `int`, `double`, and `boolean`.

### Why Use a `Scanner`?

- Read user input from the console.
- Read and process data from files.
- Convert input into different data types.
- Simplify interactive programs.

### Importing `Scanner`

Before using a `Scanner`, it must be imported from the `java.util` package.

```java
import java.util.Scanner;
```

### General Syntax

```java
Scanner scanner = new Scanner(System.in);
```

### Example Reading a `String`

The `nextLine()` method reads an entire line of text entered by the user.

```java
import java.util.Scanner;

public class Person {

    // main Method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

        scanner.close();

    }

}
```

**Example Input:**

```text
Alex
```

**Output:**

```text
Hello Alex!
```

### Example Reading an `int`

The `nextInt()` method reads a whole number entered by the user.

```java
import java.util.Scanner;

public class Person {

    // main Method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old.");

        scanner.close();

    }

}
```

**Example Input:**

```text
25
```

**Output:**

```text
You are 25 years old.
```

### Example Reading Multiple Values

A `Scanner` can be used to read different types of input within the same program.

```java
import java.util.Scanner;

public class Person {

    // main Method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();

    }

}
```

**Example Input:**

```text
Alex
25
```

**Output:**

```text
Name: Alex
Age: 25
```

### Common Scanner Methods

| Method | Description |
|----------|-------------|
| `nextLine()` | Reads a complete line of text. |
| `next()` | Reads a single word. |
| `nextInt()` | Reads an integer value. |
| `nextDouble()` | Reads a decimal number. |
| `nextBoolean()` | Reads a boolean value (`true` or `false`). |

### Important Notes

> The `Scanner` class must be imported using `import java.util.Scanner`.
>
> `System.in` allows the `Scanner` to read input from the keyboard.
>
> Always close a `Scanner` when it is no longer needed by calling `scanner.close()`.
>
> Different methods are available for reading different data types.
>
> `nextLine()` reads an entire line, while `next()` reads only a single word.
>
> The `Scanner` class is one of the most commonly used tools for handling user input in Java console applications.
