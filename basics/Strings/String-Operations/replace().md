# replace()

### What is `replace()`?

> The `replace()` method replaces characters or text within a String.
>
> All matching occurrences are replaced.
>
> The method returns a new String containing the modified result.

---

### General Syntax

```java
string.replace("oldValue", "newValue");
```

---

### Replace Characters

The following example replaces all occurrences of `"a"` with `"o"`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Java";

        System.out.println(text.replace("a", "o"));

    }
}
```

**Output:**

```text
Jovo
```

---

### Replace Text

The `replace()` method can also replace complete words.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "I like Java";

        System.out.println(text.replace("Java", "C#"));

    }
}
```

**Output:**

```text
I like C#
```

---

### Store the Result in a Variable

Since Strings are immutable, the returned value should be assigned to a variable if it will be reused.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Java";

        String modifiedText = text.replace("a", "o");

        System.out.println(modifiedText);

    }
}
```

**Output:**

```text
Jovo
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
> All matching occurrences are replaced.
>
> `replace()` does not use Regular Expressions (Regex).
>
> For pattern-based replacements, use `replaceAll()`.
