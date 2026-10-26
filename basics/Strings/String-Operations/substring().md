# substring()

### What is `substring()`?

> The `substring()` method extracts a portion of a String.
>
> You can specify where the extraction should start and optionally where it should end.
>
> The method returns a new String containing the extracted text.

---

### General Syntax

```java
string.substring(startIndex);
```

or

```java
string.substring(startIndex, endIndex);
```

---

### Example

The following example extracts all characters starting from index `2`.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Thomas";

        System.out.println(text.substring(2));

    }
}
```

**Output:**

```text
omas
```

---

### Example with Start and End Index

The second parameter defines where the extraction should stop.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String text = "Thomas";

        System.out.println(text.substring(1, 4));

    }
}
```

**Output:**

```text
hom
```

---

### Understanding the Indexes

```java
String text = "Thomas";
```

```text
Character:  T  h  o  m  a  s
Index:      0  1  2  3  4  5
```

```java
text.substring(1, 4);
```

Starts at index `1` and stops before index `4`.

```text
hom
```

---

### Extract a File Extension

A common use case is extracting a specific part of a String.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String fileName = "report.pdf";

        System.out.println(fileName.substring(6));

    }
}
```

**Output:**

```text
.pdf
```

---

### Important Notes

> String indexes start at `0`.
>
> The start index is included in the result.
>
> The end index is excluded from the result.
>
> The original String remains unchanged.
>
> `substring()` returns a new String.
>
> An invalid index will cause a `StringIndexOutOfBoundsException`.
