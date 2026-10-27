# `for-each` Loops

### What is a `for-each` Loop?

> A `for-each` loop is a control structure that iterates through every element in an array or collection.
>
> It provides a simple and readable way to access each element without manually managing an index variable.

### General Syntax

```java
for (DataType item : collection) {
    // Code block
}
```

### Example: Basic `for-each` Loop

A `for-each` loop can be used to iterate through all elements of an array.

```java
String[] cars = { "Volkswagen", "BMW", "Audi" };

for (String car : cars) {
    System.out.println(car);
}
```

**Output:**

```text
Volkswagen
BMW
Audi
```

### Understanding the `for-each` Loop

```java
String[] cars = { "Volkswagen", "BMW", "Audi" };

for (String car : cars) {
    System.out.println(car);
}
```

#### Loop Components

- `String[] cars` is the collection being iterated.
- `String car` represents the current element.
- `:` connects the current element to the collection.

#### Choosing the Loop Variable Name

The loop variable should describe the type of element being processed.

A common convention is to use the singular form of the collection name.

```java
String[] cars = { "Volkswagen", "BMW", "Audi" };

for (String car : cars) {
    System.out.println(car);
}
```

- Collection: `cars`
- Current element: `car`

Another example:

```java
int[] numbers = { 10, 20, 30 };

for (int number : numbers) {
    System.out.println(number);
}
```

- Collection: `numbers`
- Current element: `number`

You can technically use any valid variable name:

```java
for (String x : cars) {
    System.out.println(x);
}
```

However, meaningful names such as `car`, `number`, `student`, or `person` make the code easier to read and understand.

#### How the Loop Executes

The loop follows these steps:

1. Take the first element from the collection.

```java
"Volkswagen"
```

2. Store it in the loop variable.

```java
car = "Volkswagen";
```

3. Execute the code block.

```java
System.out.println(car);
```

4. Move to the next element and repeat.

5. Stop when all elements have been processed.

#### Execution Example

```text
car = "Volkswagen" → Print Volkswagen
car = "BMW"        → Print BMW
car = "Audi"       → Print Audi
No more elements   → Loop stops
```

### Example: Iterating Through Numbers

A `for-each` loop can also be used with arrays of numbers.

```java
int[] numbers = { 10, 20, 30, 40, 50 };

for (int number : numbers) {
    System.out.println(number);
}
```

**Output:**

```text
10
20
30
40
50
```

### Example: Calculating a Sum

A common use case is processing every element in an array or collection.

```java
int[] numbers = { 10, 20, 30, 40 };

int sum = 0;

for (int number : numbers) {
    sum += number;
}

System.out.println("Sum: " + sum);
```

**Output:**

```text
Sum: 100
```

### `for` vs. `for-each`

| Loop | Best Used When |
|--------|-------------|
| `for` | You need access to the element index or want full control over the iteration |
| `for-each` | You simply need to process every element in an array or collection |

### Important Notes

> A `for-each` loop automatically iterates through all elements of an array or collection.
>
> No counter variable is required.
>
> The elements are processed in the order they appear in the collection.
>
> The loop stops automatically after the last element has been processed.
>
> By convention, the loop variable is usually the singular form of the collection name (e.g., `car` in `cars`, `student` in `students`).
>
> Use a `for-each` loop when you do not need the element index.
>
> The loop variable is read-only. Changing it does not modify the original array or collection element.
