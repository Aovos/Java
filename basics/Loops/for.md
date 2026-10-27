# `for` Loops

### What are `for` Loops?

> A `for` loop is a control structure that repeatedly executes a block of code while a specified condition remains `true`.
>
> It is commonly used when the number of iterations is known in advance, making repetitive tasks easier and more efficient.

### General Syntax

```java
for (initialization; condition; update) {
    // Code block
}
```

### Example: Basic `for` Loop

A `for` loop can be used to execute a block of code a specific number of times.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
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

### Understanding the `for` Loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

#### Loop Components

- `int i = 0` initializes the loop variable and is executed only once.
- `i < 5` is the condition that must remain `true` for the loop to continue.
- `i++` increases the loop variable by `1` after each iteration.

#### How the Loop Executes

The loop follows these steps:

1. Execute the initialization statement (runs only once).

```java
int i = 0;
```

2. Check the condition.

```java
i < 5
```

3. If the condition is `true`, execute the code block.

```java
System.out.println(i);
```

4. Execute the update expression.

```java
i++;
```

5. Go back to step **2** and repeat until the condition becomes `false`.

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

A `for` loop can also count backwards by decreasing the loop variable.

```java
for (int i = 5; i > 0; i--) {
    System.out.println(i);
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

### Example: Incrementing by Different Values

The update expression can increase the loop variable by more than `1`.

```java
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}
```

**Output:**

```text
0
2
4
6
8
10
```

### Important Notes

> The initialization expression is executed only once before the loop starts.
>
> The condition is evaluated before every iteration.
>
> If the condition becomes `false`, the loop terminates.
>
> The update expression is executed after each iteration.
>
> Variables declared in the `for` statement are not accessible outside the loop.
