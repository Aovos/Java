# add()

### What is `add()`?

> The `add()` method inserts an element into an `ArrayList`.
>
> New elements are added to the end of the list by default.
>
> The size of the `ArrayList` automatically increases when new elements are added.

---

### General Syntax

```java
listName.add(value);
```

---

### Example

The following example adds a value to an `ArrayList`.

```java
import java.util.ArrayList;

public class Main {

    // main Method
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");

        System.out.println(names);

    }
}
```

**Output:**

```text
[Tom]
```

---

### Adding Multiple Elements

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

### Adding Different Data Types

Strings

```java
ArrayList<String> names = new ArrayList<>();

names.add("Tom");
```

Integers

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
```

Doubles

```java
ArrayList<Double> prices = new ArrayList<>();

prices.add(19.99);
```

Booleans

```java
ArrayList<Boolean> values = new ArrayList<>();

values.add(true);
```

---

### Adding an Element at a Specific Index

The `add()` method can also insert an element at a specific position.

```java
listName.add(index, value);
```

Example:

```java
import java.util.ArrayList;

public class Main {

    // main Method
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Anna");

        names.add(1, "Jerry");

        System.out.println(names);

    }
}
```

**Output:**

```text
[Tom, Jerry, Anna]
```

---

### Before and After

```text
Before:
[Tom, Anna]
```

```java
names.add(1, "Jerry");
```

```text
After:
[Tom, Jerry, Anna]
```

---

### Important Notes

> The `add()` method increases the size of the ArrayList.
>
> Elements are added to the end of the list by default.
>
> Elements can also be inserted at a specific index.
>
> Existing elements are shifted to the right when inserting at an index.
>
> ArrayLists maintain insertion order.
>
> An invalid index will cause an `IndexOutOfBoundsException`.
