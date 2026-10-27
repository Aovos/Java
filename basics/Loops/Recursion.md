# `Recursion`

### What is `Recursion`?

> Recursion is a programming technique where a method calls itself.
>
> It is commonly used to solve a problem by breaking it down into smaller versions of the same problem until a stopping condition is reached.

### General Syntax

```java
public static void methodName(parameter) {
    if (baseCondition) {
        return;
    }

    // Code block

    methodName(modifiedParameter);
}
```

### Example: Basic Recursion

A recursive method can perform a task repeatedly by calling itself.

```java
public static void countDown(int number) {
    if (number == 0) {
        return;
    }

    System.out.println(number);
    countDown(number - 1);
}
```

```java
countDown(5);
```

**Output:**

```text
5
4
3
2
1
```

### Understanding `Recursion`

```java
public static void countDown(int number) {
    if (number == 0) {
        return;
    }

    System.out.println(number);
    countDown(number - 1);
}
```

#### Method Components

- `number` is the value used by the recursive method.
- `if (number == 0)` is the **base case** that stops the recursion.
- `countDown(number - 1)` is the **recursive call** that calls the method again with a modified value.

#### How the Recursion Executes

The method follows these steps:

1. Check the base case.

```java
if (number == 0) {
    return;
}
```

2. If the base case is not met, execute the code block.

```java
System.out.println(number);
```

3. Call the method again with a modified value.

```java
countDown(number - 1);
```

4. Repeat until the base case is reached.

#### Execution Example

```text
countDown(5)
→ Print 5
→ countDown(4)

countDown(4)
→ Print 4
→ countDown(3)

countDown(3)
→ Print 3
→ countDown(2)

countDown(2)
→ Print 2
→ countDown(1)

countDown(1)
→ Print 1
→ countDown(0)

countDown(0)
→ Base case reached
→ Stop
```

### Example: Repeating a Message

Recursion can be used to repeat an action a specific number of times.

```java
public static void printMessage(int times) {
    if (times == 0) {
        return;
    }

    System.out.println("Hello World");
    printMessage(times - 1);
}
```

```java
printMessage(3);
```

**Output:**

```text
Hello World
Hello World
Hello World
```

### Important Notes

> Every recursive method should have a **base case** that stops the recursion.
>
> Without a base case, the method will continue calling itself indefinitely.
>
> Each recursive call should move closer to the base case.
>
> Recursive solutions can often be replaced with loops.
>
> Recursion is useful when a problem can be divided into smaller versions of itself.
