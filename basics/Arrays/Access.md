# Array Access in Java

### What is Array Access?

> Array access allows you to read or modify values stored inside an array.
>
> Each element in an array can be accessed using its index.
>
> Array indexes start at `0`.

---

### General Syntax

```java
array[index];
```

---

### Accessing Elements

The following example accesses the first element of an array.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        System.out.println(names[0]);

    }
}
```

**Output:**

```text
Tom
```

---

### Accessing Different Elements

Each element can be accessed using its corresponding index.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}
```

**Output:**

```text
Jerry
Anna
```

---

### Modifying Elements

Array elements can be replaced by assigning a new value to an index.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        names[0] = "Max";

        System.out.println(names[0]);

    }
}
```

**Output:**

```text
Max
```

---

### Understanding Indexes

```java
String[] names = {"Tom", "Jerry", "Anna"};
```

```text
Value:  Tom    Jerry   Anna
Index:   0       1       2
```

---

### Invalid Index

Accessing an index that does not exist will cause an exception.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        System.out.println(names[5]);

    }
}
```

**Output:**

```text
ArrayIndexOutOfBoundsException
```

---

### Important Notes

> Array indexes start at `0`.
>
> Elements are accessed using square brackets `[]`.
>
> Existing values can be modified by assigning a new value to an index.
>
> Array elements cannot be physically removed because the array size is fixed.
>
> Accessing an invalid index will cause an `ArrayIndexOutOfBoundsException`.
>
> Reading and modifying array elements are among the most common array operations.
