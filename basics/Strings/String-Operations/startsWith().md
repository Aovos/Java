# startsWith()

### What is `startsWith()`?

> The `startsWith()` method checks whether a String begins with a specific sequence of characters.
>
> It returns `true` if the String starts with the specified text.
>
> Otherwise, it returns `false`.

---

### General Syntax

```java
string.startsWith("text");
```

---

### Example

The following example checks whether the String starts with `"Welcome"`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.startsWith("Welcome"));

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

        System.out.println(text.startsWith("Java"));

    }
}
```

**Output:**

```text
false
```

---

### Case Sensitivity

The `startsWith()` method is case-sensitive.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Welcome to Java";

        System.out.println(text.startsWith("welcome"));

    }
}
```

**Output:**

```text
false
```

Because `"Welcome"` and `"welcome"` are not identical.

---

### Common Use Case

A common use case is checking file names or URLs.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String fileName = "report.pdf";

        if (fileName.startsWith("report")) {
            System.out.println("Matching file found.");
        }

    }
}
```

**Output:**

```text
Matching file found.
```

---

### Important Notes

> `startsWith()` returns a boolean value (`true` or `false`).
>
> The method is case-sensitive.
>
> The original String remains unchanged.
>
> The comparison always starts at the beginning of the String.
>
> `startsWith()` is commonly used for validation and filtering.
