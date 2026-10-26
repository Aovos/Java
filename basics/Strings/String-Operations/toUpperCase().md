# toUpperCase()

### What is `toUpperCase()`?

> The `toUpperCase()` method converts all lowercase characters in a String to uppercase.
>
> Characters that are already uppercase remain unchanged.
>
> The method returns a new String containing the converted text.

---

### General Syntax

```java
string.toUpperCase();
```

---

### Example

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "Thomas";

        System.out.println(name.toUpperCase());

    }
}
```

**Output:**

```text
THOMAS
```

---

### Example with Mixed Case

All letters are converted to uppercase.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "JaVa Programming";

        System.out.println(text.toUpperCase());

    }
}
```

**Output:**

```text
JAVA PROGRAMMING
```

---

### Store the Result in a Variable

Since Strings are immutable, the returned value should be assigned to a variable if it will be reused.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "Thomas";

        String upperCaseName = name.toUpperCase();

        System.out.println(upperCaseName);

    }
}
```

**Output:**

```text
THOMAS
```

---

### Important Notes

> The method converts all lowercase letters to uppercase.
>
> The original String remains unchanged.
>
> `toUpperCase()` returns a new String.
>
> Numbers, spaces, and special characters are not affected.
>
> The method is commonly used when case-sensitive comparisons should be avoided.
