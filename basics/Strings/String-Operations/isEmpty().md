# isEmpty()

### What is `isEmpty()`?

> The `isEmpty()` method checks whether a String contains any characters.
>
> It returns `true` if the String length is `0`.
>
> Otherwise, it returns `false`.

---

### General Syntax

```java
string.isEmpty();
```

---

### Example

The following example checks whether a String is empty.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "";

        System.out.println(text.isEmpty());

    }
}
```

**Output:**

```text
true
```

---

### Example with Content

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Java";

        System.out.println(text.isEmpty());

    }
}
```

**Output:**

```text
false
```

---

### Relation to length()

The `isEmpty()` method is equivalent to checking whether the String length is `0`.

```java
String text = "";

System.out.println(text.isEmpty());
System.out.println(text.length() == 0);
```

**Output:**

```text
true
true
```

---

### Common Use Case

A common use case is validating user input.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String username = "";

        if (username.isEmpty()) {
            System.out.println("Username is required.");
        }

    }
}
```

**Output:**

```text
Username is required.
```

---

### Important Notes

> `isEmpty()` returns a boolean value (`true` or `false`).
>
> The method returns `true` only when the String length is `0`.
>
> The original String remains unchanged.
>
> A String containing spaces is not considered empty.
>
> `isEmpty()` is commonly used for input validation.
