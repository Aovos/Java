# Array Length in Java

### What is `length`?

> The `length` property returns the number of elements stored in an array.
>
> It can be used to determine the size of an array and is commonly used when iterating through its elements.
>
> Unlike String methods, `length` is a property and therefore does not use parentheses `()`.

---

### General Syntax

```java
array.length
```

---

### Example

The following example returns the number of elements stored in the array.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Anna"};

        System.out.println(names.length);

    }
}
```

**Output:**

```text
3
```

---

### Example with Numbers

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers.length);

    }
}
```

**Output:**

```text
5
```

---

### Common Use Case

The `length` property is commonly used when looping through an array.

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

### Array Length vs String Length

Arrays use the `length` property.

```java
String[] names = {"Tom", "Jerry", "Anna"};

System.out.println(names.length);
```

Strings use the `length()` method.

```java
String text = "Tom";

System.out.println(text.length());
```

**Output:**

```text
3
3
```

---

### Important Notes

> Array indexes start at `0`.
>
> The `length` property returns the total number of elements in the array.
>
> Arrays use `length` without parentheses.
>
> Strings use `length()` with parentheses.
>
> The size of an array cannot be changed after creation.
>
> The `length` property is commonly used when iterating through arrays.
