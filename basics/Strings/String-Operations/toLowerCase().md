# toLowerCase()

### What is `toLowerCase()`?

> The `toLowerCase()` method converts all uppercase characters in a String to lowercase.
>
> Characters that are already lowercase remain unchanged.
>
> The method returns a new String containing the converted text.

---

### General Syntax

```java
string.toLowerCase();
```

---

### Example

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "THOMAS";

        System.out.println(name.toLowerCase());

    }
}
```

**Output:**

```text
thomas
```

---

### Example with Mixed Case

All uppercase letters are converted to lowercase.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "JaVa ProGramMing";

        System.out.println(text.toLowerCase());

    }
}
```

**Output:**

```text
java programming
```

---

### Store the Result in a Variable

Since Strings are immutable, the returned value should be assigned to a variable if it will be reused.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String name = "THOMAS";

        String lowerCaseName = name.toLowerCase();

        System.out.println(lowerCaseName);

    }
}
```

**Output:**

```text
thomas
```

---

### Common Use Case

Converting Strings to lowercase is often useful when performing case-insensitive comparisons.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String userInput = "JAVA";

        System.out.println(userInput.toLowerCase().equals("java"));

    }
}
```

**Output:**

```text
true
```

---

### Important Notes

> The method converts all uppercase letters to lowercase.
>
> The original String remains unchanged.
>
> `toLowerCase()` returns a new String.
>
> Numbers, spaces, and special characters are not affected.
>
> The method is commonly used for case-insensitive comparisons and text normalization.
