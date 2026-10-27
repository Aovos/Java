# `while` Loops

### What is a `while` Loop?

> A `while` loop is a control structure that repeatedly executes a block of code as long as a specified condition remains `true`.
>
> It is commonly used when the number of iterations is not known in advance and the loop should continue until a condition becomes `false`.

### General Syntax

```java
while (condition) {
    // Code block
}
```

### Example: Basic `while` Loop

A `while` loop can be used to execute a block of code repeatedly while a condition is `true`.

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

**Output:**

```text
0
1
2
3
4
```

### Understanding the `while` Loop

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

#### Loop Components

- `int i = 0` initializes the loop variable.
- `i < 5` is the condition that controls the loop.
- `i++` increases the loop variable by `1` after each iteration.

#### How the Loop Executes

The loop follows these steps:

1. Check the condition.

```java
i < 5
```

2. If the condition is `true`, execute the code block.

```java
System.out.println(i);
i++;
```

3. Return to step **1** and check the condition again.

4. Repeat until the condition becomes `false`.

#### Execution Example

```text
i = 0 → Check condition → true  → Print 0 → i becomes 1
i = 1 → Check condition → true  → Print 1 → i becomes 2
i = 2 → Check condition → true  → Print 2 → i becomes 3
i = 3 → Check condition → true  → Print 3 → i becomes 4
i = 4 → Check condition → true  → Print 4 → i becomes 5
i = 5 → Check condition → false → Loop stops
```

### Example: Counting Backwards

A `while` loop can also count backwards by decreasing the loop variable.

```java
int i = 5;

while (i > 0) {
    System.out.println(i);
    i--;
}
```

**Output:**

```text
5
4
3
2
1
```

### Example: Waiting for a Car Door to Close

A `while` loop can be used to prevent an action until a required condition is met.

```java
boolean doorIsOpen = true;

while (doorIsOpen) {
    System.out.println("Cannot drive. Close the door first.");

    // Simulate closing the door
    doorIsOpen = false;
}

System.out.println("Door closed. Driving...");
```

**Output:**

```text
Cannot drive. Close the door first.
Door closed. Driving...
```

### Example: User Input Validation

A common use case for a `while` loop is repeating an action until a valid condition is met.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "";

        while (!password.equals("Java123")) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }

        System.out.println("Access granted.");

        scanner.close();
    }
}
```

### Important Notes

> A `while` loop checks its condition before each iteration.
>
> If the condition is `false` from the beginning, the code block will never execute.
>
> The condition should eventually become `false`; otherwise, an infinite loop may occur.
>
> Unlike a `for` loop, the initialization, condition, and update expressions are typically written separately.
>
> Use a `while` loop when the number of iterations is not known in advance.
