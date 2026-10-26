# endsWith()

### What is `endsWith()`?

> The `endsWith()` method checks whether a String ends with a specific sequence of characters.
>
> It returns `true` if the String ends with the specified text.
>
> Otherwise, it returns `false`.

---

### General Syntax

```java
string.endsWith("text");
```

---

### Example

The following example checks whether the String ends with `"Java"`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.endsWith("Java"));

    }
}
```

**Output:**

```text
true
```

---

### Example with a Different Value

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.endsWith("Welcome"));

    }
}
```

**Output:**

```text
false
```

---

### Case Sensitivity

The `endsWith()` method is case-sensitive.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.endsWith("java"));

    }
}
```

**Output:**

```text
false
```

Because `"Java"` and `"java"` are not identical.

---

### Ignore Uppercase and Lowercase

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.toLowerCase().endsWith("java"));

    }
}
```

**Output:**

```text
true
```

Converting the String to lowercase before calling `endsWith()` can be used for case-insensitive comparisons.

---

### Common Use Case

A common use case is checking file extensions.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String fileName = "report.pdf";

        if (fileName.endsWith(".pdf")) {
            System.out.println("PDF file detected.");
        }

    }
}
```

**Output:**

```text
PDF file detected.
```

---

### Important Notes

> `endsWith()` returns a boolean value (`true` or `false`).
>
> The method is case-sensitive.
>
> The original String remains unchanged.
>
> The comparison always starts at the end of the String.
>
> `endsWith()` is commonly used for validation and file extension checks.
