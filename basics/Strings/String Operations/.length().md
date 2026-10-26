# .length()

### What is `.length()`?

> The `length()` method returns the number of characters stored in a String.
>
> Every character is counted, including letters, numbers, spaces, and special characters.
>
> The method returns an `int` value.

---

### General Syntax

```java
string.length();
```

---

### Example

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "Thomas";

        System.out.println(name.length());

    }
}
```

**Output:**

```text
6
```

---

### Example with Spaces

Spaces are counted as characters.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Tom Smith";

        System.out.println(text.length());

    }
}
```

**Output:**

```text
9
```

---

### Important Notes

> The method returns an `int`.
>
> Spaces are counted as characters.
>
> Special characters are counted as characters.
>
> The method does not modify the original String.
>
> `length()` is one of the most commonly used String methods in Java.
