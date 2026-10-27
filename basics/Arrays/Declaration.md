# Array Declaration in Java

### What is an Array?

> An array is a data structure used to store multiple values of the same data type.
>
> Each value is stored at a specific index.
>
> Array indexes start at `0`.

---

### General Syntax

```java
dataType[] arrayName = new dataType[size];
```

or

```java
dataType[] arrayName = {value1, value2, value3};
```

---

### Example

The following example creates an array containing three names.

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

### Example with Numbers

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        System.out.println(numbers[1]);

    }
}
```

**Output:**

```text
20
```

---

### Declaration with a Fixed Size

An array can also be created with a predefined size.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(numbers[1]);

    }
}
```

**Output:**

```text
20
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

### Important Notes

> Arrays can only store values of the same data type.
>
> Array indexes start at `0`.
>
> The size of an array cannot be changed after creation.
>
> Accessing an invalid index will cause an `ArrayIndexOutOfBoundsException`.
>
> Arrays can store primitive data types as well as objects.
