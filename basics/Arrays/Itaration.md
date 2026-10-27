# Array Iteration in Java

### What is Array Iteration?

> Array iteration is the process of accessing each element of an array one after another.
>
> This is commonly done using loops.
>
> Iteration is useful when all elements of an array need to be processed, displayed, or modified.

---

### Iteration with a `for` Loop

The most common way to iterate through an array is by using a `for` loop together with the `length` property.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
```

**Output:**

```text
Tom
Jerry
Anna
```

---

### How it Works

```java
for (int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
```

- `i = 0` starts at the first index.
- `i < names.length` prevents accessing invalid indexes.
- `i++` increases the index after each iteration.
- `names[i]` accesses the current element.

---

### Iteration with a `for-each` Loop

A `for-each` loop provides a simpler way to iterate through all array elements.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        for (String name : names) {
            System.out.println(name);
        }

    }
}
```

**Output:**

```text
Tom
Jerry
Anna
```

---

### `for` vs `for-each`

Both loops iterate through all elements of an array.

#### `for` Loop

```java
for (int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
```

Use a `for` loop when the index is needed.

#### `for-each` Loop

```java
for (String name : names) {
    System.out.println(name);
}
```

Use a `for-each` loop when only the values are needed.

---

### Example with Numbers

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }

    }
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

---

### Important Notes

> Iteration allows you to process all elements of an array.
>
> A `for` loop provides access to both indexes and values.
>
> A `for-each` loop provides access to values only.
>
> The `length` property is commonly used to prevent invalid array access.
>
> Accessing an invalid index will cause an `ArrayIndexOutOfBoundsException`.
>
> Iteration is one of the most common operations when working with arrays.
