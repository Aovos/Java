# .trim()

### What is `.trim()`?

> The `trim()` method removes whitespace characters from the beginning and end of a String.
>
> Spaces located inside the String remain unchanged.
>
> The method returns a new String containing the trimmed result.

---

### General Syntax

```java
string.trim();
```

---

### Example

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "   Thomas   ";

        System.out.println(name.trim());

    }
}
```

**Output:**

```text
Thomas
```

---

### Example with Spaces Inside the String

Only leading and trailing spaces are removed.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "   Tom Smith   ";

        System.out.println(name.trim());

    }
}
```

**Output:**

```text
Tom Smith
```

---

### Trim Result Stored in a Variable

Since Strings are immutable, the returned value should be assigned to a variable if it will be used later.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "   Thomas   ";

        String trimmedName = name.trim();

        System.out.println(trimmedName);

    }
}
```

**Output:**

```text
Thomas
```

---

### Important Notes

> The method removes whitespace only at the beginning and end of a String.
>
> Spaces inside a String are not removed.
>
> The original String remains unchanged.
>
> `trim()` returns a new String.
>
> To remove all spaces, use `replaceAll("\\s+", "")` instead.
