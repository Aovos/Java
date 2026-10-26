# equalsIgnoreCase()

### What is `equalsIgnoreCase()`?

> The `equalsIgnoreCase()` method compares the content of two Strings while ignoring uppercase and lowercase differences.
>
> It returns `true` if both Strings contain the same characters, regardless of their casing.
>
> Otherwise, it returns `false`.

---

### General Syntax

```java
string1.equalsIgnoreCase(string2);
```

---

### Example

The following example compares two Strings with different casing.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "JAVA";

        System.out.println(text1.equalsIgnoreCase(text2));

    }
}
```

**Output:**

```text
true
```

---

### Example with Different Values

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "Python";

        System.out.println(text1.equalsIgnoreCase(text2));

    }
}
```

**Output:**

```text
false
```

---

### equals() vs equalsIgnoreCase()

Both methods compare the content of Strings.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "JAVA";

        System.out.println(text1.equals(text2));
        System.out.println(text1.equalsIgnoreCase(text2));

    }
}
```

**Output:**

```text
false
true
```

| Method | Case-Sensitive |
|----------|----------|
| `equals()` | Yes |
| `equalsIgnoreCase()` | No |

`equals()` treats uppercase and lowercase characters as different.

`equalsIgnoreCase()` ignores character casing during the comparison.

---

### Common Use Case

A common use case is validating user input.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String userInput = "java";

        if (userInput.equalsIgnoreCase("JAVA")) {
            System.out.println("Match found!");
        }

    }
}
```

**Output:**

```text
Match found!
```

---

### Important Notes

> `equalsIgnoreCase()` compares the content of two Strings.
>
> Uppercase and lowercase differences are ignored.
>
> The method returns a boolean value (`true` or `false`).
>
> The original Strings remain unchanged.
>
> Use `equals()` if case-sensitive comparison is required.
