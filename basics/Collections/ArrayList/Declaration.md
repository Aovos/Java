# ArrayList Declaration in Java

### What is an ArrayList?

> An ArrayList is a dynamic collection used to store multiple values.
>
> Unlike arrays, the size of an ArrayList can grow and shrink during runtime.
>
> Elements are stored in insertion order and can be accessed using indexes.

---

### Import Statement

```java
import java.util.ArrayList;
```

---

### General Syntax

```java
ArrayList<DataType> listName = new ArrayList<>();
```

---

### Example

The following example creates an empty ArrayList.

```java
import java.util.ArrayList;

public class Main {

    // main Method
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        System.out.println(names);

    }
}
```

**Output:**

```text
[]
```

---

### Example with Values

```java
import java.util.ArrayList;

public class Main {

    // main Method
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Anna");

        System.out.println(names);

    }
}
```

**Output:**

```text
[Tom, Jerry, Anna]
```

---

### Different Data Types

Strings

```java
ArrayList<String> names = new ArrayList<>();
```

Integers

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

Doubles

```java
ArrayList<Double> prices = new ArrayList<>();
```

Booleans

```java
ArrayList<Boolean> values = new ArrayList<>();
```

---

### Array vs ArrayList

Array

```java
String[] names = {"Tom", "Jerry", "Anna"};
```

ArrayList

```java
ArrayList<String> names = new ArrayList<>();
```

| Feature | Array | ArrayList |
|----------|----------|----------|
| Size | Fixed | Dynamic |
| Add Elements | Limited | Easy |
| Remove Elements | Difficult | Easy |
| Import Required | No | Yes |

---

### Important Notes

> `ArrayList` belongs to the `java.util` package.
>
> The size of an ArrayList can change during runtime.
>
> ArrayLists use indexes starting at `0`.
>
> Elements maintain their insertion order.
>
> Primitive types such as `int`, `double`, and `boolean` cannot be used directly. Use wrapper classes such as `Integer`, `Double`, and `Boolean` instead.
