# reverse() in Java

### What is `reverse()`?

> The `reverse()` method reverses the order of characters within a `StringBuilder`.
>
> Since the `String` class does not provide a `reverse()` method, a `StringBuilder` must be used when reversing a String.
>
> The method returns the characters in reverse order.

---

### General Syntax

```java
StringBuilder stringBuilder = new StringBuilder(text);

String reversedText = stringBuilder.reverse().toString();
```

---

### Example

The following example reverses a String.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "Tom";

        StringBuilder stringBuilder = new StringBuilder(name);

        String reversedName = stringBuilder.reverse().toString();

        System.out.println(reversedName);

    }
}
```

**Output:**

```text
moT
```

---

### Example with a Sentence

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Hello World";

        StringBuilder stringBuilder = new StringBuilder(text);

        String reversedText = stringBuilder.reverse().toString();

        System.out.println(reversedText);

    }
}
```

**Output:**

```text
dlroW olleH
```

---

### How it Works

```java
StringBuilder stringBuilder = new StringBuilder(text);

String reversedText = stringBuilder.reverse().toString();
```

1. A `StringBuilder` is created from the original String.
2. The `reverse()` method reverses all characters.
3. The `toString()` method converts the result back into a String.
4. The reversed String is stored in a new variable.

---

### Important Notes

> The `reverse()` method belongs to the `StringBuilder` class.
>
> The `String` class does not provide a `reverse()` method.
>
> The method reverses all characters, including spaces and special characters.
>
> `toString()` is required if the result should be stored as a String.
>
> The original String remains unchanged.
>
> `reverse()` is commonly used for text processing and palindrome checks.
