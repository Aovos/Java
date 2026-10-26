# replaceAll()

### What is `replaceAll()`?

> The `replaceAll()` method replaces parts of a String that match a specific pattern.
>
> It can be used to remove or replace characters such as spaces, numbers, or other character groups.
>
> The method returns a new String containing the modified result.

---

### General Syntax

```java
string.replaceAll("pattern", "replacement");
```

---

### Example

The following example replaces all occurrences of `"a"` with `"o"`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Java";

        System.out.println(text.replaceAll("a", "o"));

    }
}
```

**Output:**

```text
Jovo
```

---

### Remove All Spaces

A common use case is removing all whitespace characters from a String.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "Tom Smith";

        System.out.println(name.replaceAll("\\s+", ""));

    }
}
```

**Output:**

```text
TomSmith
```

---

### Remove All Numbers

Patterns can also be used to remove numbers from a String.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Java123";

        System.out.println(text.replaceAll("[0-9]", ""));

    }
}
```

**Output:**

```text
Java
```

---

### replace() vs replaceAll()

Both methods can be used to replace text inside a String.

Use `replace()` when you want to replace specific characters or text.

```java
String text = "Java";

System.out.println(text.replace("a", "o"));
```

**Output:**

```text
Jovo
```

Use `replaceAll()` when you want to replace groups of characters, such as all spaces or all numbers.

```java
String text = "Java123";

System.out.println(text.replaceAll("[0-9]", ""));
```

**Output:**

```text
Java
```

In this example, all numbers are removed from the String.

> Use `replace()` for simple text replacements.
>
> Use `replaceAll()` when you need to replace multiple characters that follow a specific pattern.

---

### Important Notes

> The original String remains unchanged.
>
> The method returns a new String.
>
> `\\s+` can be used to match one or more whitespace characters.
>
> `replaceAll()` supports Regular Expressions (Regex).
>
> For simple text replacements, `replace()` is usually easier to read.
