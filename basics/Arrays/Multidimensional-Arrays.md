# Multidimensional Arrays in Java

### What are Multidimensional Arrays?

> A multidimensional array is an array that contains other arrays.
>
> The most common type is a two-dimensional array, which can be visualized as a table consisting of rows and columns.
>
> Multidimensional arrays are useful for storing structured data such as matrices, game boards, or tabular information.

---

### Understanding Dimensions

A multidimensional array is simply an array containing other arrays.

Each additional dimension adds another level of nesting.

#### One-Dimensional Array (1D)

```text
[o] [o] [o]
```

Contains values.

```java
int[] array1D;
```

Access:

```java
array1D[index];
```

---

#### Two-Dimensional Array (2D)

```text
[o] [o] [o]
[o] [o] [o]
[o] [o] [o]
```

Contains multiple 1D arrays.

```java
int[][] array2D;
```

Access:

```java
array2D[row][column];
```

---

#### Three-Dimensional Array (3D)

```text
Layer 0

[o] [o] [o]
[o] [o] [o]

Layer 1

[o] [o] [o]
[o] [o] [o]
```

Contains multiple 2D arrays.

```java
int[][][] array3D;
```

Access:

```java
array3D[layer][row][column];
```

---

#### Four-Dimensional Array (4D)

```text
4D Array
│
├── Group 0
│   │
│   ├── Layer 0
│   │   ├── [o] [o] [o]
│   │   └── [o] [o] [o]
│   │
│   └── Layer 1
│       ├── [o] [o]
│       ├── [o] [o]
│       └── [o] [o]
│
└── Group 1
    │
    ├── Layer 0
    │   ├── [o] [o] [o] [o]
    │   └── [o] [o] [o] [o]
    │
    └── Layer 1
        ├── [o]
        ├── [o]
        ├── [o]
        └── [o]
```

Contains multiple 3D arrays.

```java
int[][][][] array4D;
```

Access:

```java
array4D[group][layer][row][column];
```

---

### Important Concept

A higher dimension contains all lower dimensions.

Examples:

- A 2D array contains multiple 1D arrays.
- A 3D array contains multiple 2D arrays.
- A 4D array contains multiple 3D arrays.

The more dimensions an array has, the more indexes are required to access a specific value.

```java
array1D[index];
```

```java
array2D[row][column];
```

```java
array3D[layer][row][column];
```

```java
array4D[group][layer][row][column];
```

```java
array5D[box][group][layer][row][column];
```

```java
array6D[container][box][group][layer][row][column];
```

```java
array7D[warehouse][container][box][group][layer][row][column];
```

```java
array8D[city][warehouse][container][box][group][layer][row][column];
```

```java
array9D[country][city][warehouse][container][box][group][layer][row][column];
```

```java
array10D[continent][country][city][warehouse][container][box][group][layer][row][column];
```

```java
array11D[planet][continent][country][city][warehouse][container][box][group][layer][row][column];
```

> Each additional dimension adds another level of nesting and requires an additional index.
>
> Multidimensional arrays do not need to have a fixed shape, so rows, columns, and layers can contain different numbers of elements.

---

### General Syntax

#### Two-Dimensional Array (2D)

```java
dataType[][] arrayName = new dataType[rows][columns];
```

or

```java
dataType[][] arrayName = {
    {value1, value2},
    {value3, value4}
};
```

#### Three-Dimensional Array (3D)

```java
dataType[][][] arrayName = new dataType[depth][rows][columns];
```

or

```java
dataType[][][] arrayName = {
    {
        {value1, value2},
        {value3, value4}
    },
    {
        {value5, value6},
        {value7, value8}
    }
};
```

---

### Example

The following example creates a two-dimensional array.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[][] names = {
                {"Tom", "Jerry"},
                {"Anna", "Lisa"}
        };

        System.out.println(names[0][0]);

    }
}
```

**Output:**

```text
Tom
```

---

### Two-Dimensional vs Three-Dimensional Arrays

```java
String[][] names = {
        {"Tom", "Jerry"},
        {"Anna", "Lisa"}
};
```

A 2D array can be visualized as a table consisting of rows and columns.

```java
String[][][] names = {
        {
                {"Tom", "Jerry"},
                {"Anna", "Lisa"}
        },
        {
                {"Max", "John"},
                {"Emma", "Sophia"}
        }
};
```

A 3D array adds another dimension and can be visualized as multiple tables stacked together.

---

### Understanding Rows and Columns

```java
String[][] names = {
        {"Tom", "Jerry"},
        {"Anna", "Lisa"}
};
```

```text
          Column
         0       1
       +-------+-------+
Row 0  |  Tom  | Jerry |
       +-------+-------+
Row 1  | Anna  | Lisa  |
       +-------+-------+
```

Accessing Values:

```text
names[0][0] -> Tom
names[0][1] -> Jerry
names[1][0] -> Anna
names[1][1] -> Lisa
```

---

### Modifying Values

Values can be modified by specifying the row and column index.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[][] names = {
                {"Tom", "Jerry"},
                {"Anna", "Lisa"}
        };

        names[0][0] = "Max";

        System.out.println(names[0][0]);

    }
}
```

**Output:**

```text
Max
```

---

### Iterating Through a Multidimensional Array

Nested loops can be used to access all elements.

```java
public class Main {

    // main Method
    public static void main(String[] args) {

        String[][] names = {
                {"Tom", "Jerry"},
                {"Anna", "Lisa"}
        };

        for (int row = 0; row < names.length; row++) {

            for (int column = 0; column < names[row].length; column++) {

                System.out.println(names[row][column]);

            }
        }
    }
}
```

**Output:**

```text
Tom
Jerry
Anna
Lisa
```

---

### Important Notes

> A multidimensional array is an array containing other arrays.
>
> The first index specifies the row.
>
> The second index specifies the column.
>
> Three-dimensional arrays use a third index to access an additional layer of data.
>
> Four-dimensional arrays use a fourth index to access groups of layers.
>
> Array indexes start at `0`.
>
> Values can be read and modified using row and column indexes.
>
> Nested loops are commonly used to iterate through multidimensional arrays.
>
> Accessing an invalid index will cause an `ArrayIndexOutOfBoundsException`.
