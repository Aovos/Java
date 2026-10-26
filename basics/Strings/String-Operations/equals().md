# equals()

### What is `equals()`?

> The `equals()` method compares the content of two Strings.
>
> It returns `true` if both Strings contain the same characters in the same order.
>
> Otherwise, it returns `false`.

---

### General Syntax

```java
string1.equals(string2);
```

---

### Example

The following example compares two Strings with identical content.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name1 = "Tom";
        String name2 = "Tom";

        System.out.println(name1.equals(name2));

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

        String name1 = "Tom";
        String name2 = "Jerry";

        System.out.println(name1.equals(name2));

    }
}
```

**Output:**

```text
false
```

---

### equals() vs ==

Both `equals()` and `==` can be used to compare Strings, but they check different things.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text1 = new String("Java");
        String text2 = new String("Java");

        System.out.println(text1.equals(text2));
        System.out.println(text1 == text2);

    }
}
```

**Output:**

```text
true
false
```

| Comparison | Checks |
|------------|---------|
| `equals()` | Content of the Strings |
| `==` | Object reference in memory |

Even though both Strings contain the same text (`"Java"`), they are different objects. Therefore, `equals()` returns `true`, while `==` returns `false`.

---

### Common Use Case

String comparisons should normally be performed with `equals()`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String userInput = "Java";

        if (userInput.equals("Java")) {
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

> `equals()` compares the content of two Strings.
>
> `==` compares object references.
>
> For String comparisons, `equals()` should usually be preferred.
>
> String comparisons are case-sensitive.
>
> To perform a case-insensitive comparison, use `equalsIgnoreCase()`.
