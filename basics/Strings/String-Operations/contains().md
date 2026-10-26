# contains()

### What is `contains()`?

> The `contains()` method checks whether a String contains a specific sequence of characters.
>
> It returns `true` if the specified text is found.
>
> Otherwise, it returns `false`.

---

### General Syntax

```java
string.contains("text");
```

---

### Example

The following example checks whether the String contains the word `"Java"`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.contains("Java"));

    }
}
```

**Output:**

```text
true
```

---

### Example with a Missing Value

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.contains("Python"));

    }
}
```

**Output:**

```text
false
```

---

### Case Sensitivity

The `contains()` method is case-sensitive.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.contains("java"));

    }
}
```

**Output:**

```text
false
```

Because `"java"` and `"Java"` are not identical.

---

### Common Use Case

A common use case is checking user input or text content.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String email = "admin@example.com";

        if (email.contains("@")) {
            System.out.println("Valid email format.");
        }

    }
}
```

**Output:**

```text
Valid email format.
```

---

### Important Notes

> `contains()` returns a boolean value (`true` or `false`).
>
> The method is case-sensitive.
>
> The original String remains unchanged.
>
> The method checks for an exact sequence of characters.
>
> `contains()` is commonly used for validation and text searching.
