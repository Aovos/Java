# Javadoc

### What is Javadoc?

> Javadoc is a documentation tool built into Java that generates HTML documentation directly from special comments written in the source code.
>
> It helps developers understand classes, methods, fields, and their usage without reading the implementation details.
>
> Javadoc comments are written using the `/** ... */` syntax and can include various tags to provide additional information.

### Javadoc Class

```java
/**
 * The Javadoc class represents a brief description of the class.
 *
 * @author Author Name
 * @version 1.0.0
 */
class Javadoc {

    //...

}
```

### Javadoc Method

```java
//...

/**
 * Adds two numbers together.
 * This method takes two double values as parameters and returns their sum.
 * It can be used for basic arithmetic operations in a calculator application.
 *
 * @param num1 the first number to be added
 * @param num2 the second number to be added
 * @return the sum of num1 and num2
 */
public double add(double num1, double num2) {
    return num1 + num2;
}

//...
```

### Javadoc Tags

| Tag | Description |
|------|------------|
| `@param` | Describes a method's parameters |
| `@return` | Describes the return value of a method |
| `@throws` | Describes an exception that may be thrown by the method |
| `@exception` | Alternative to `@throws` |
| `@author` | Specifies the name of the author of the class or method |
| `@version` | Specifies the version number of the class or method |
| `@since` | Indicates the version in which the class or method was introduced |
| `@see` | Refers to related classes, methods, or documentation |
| `{@link}` | *Inline Tag:* Inserts a link to another class or method in the Javadoc documentation |
| `@deprecated` | Marks a method or class as deprecated and suggests an alternative |
| `{@inheritDoc}`| *Inline Tag:* Inherits documentation from the superclass or interface |
| `{@code}` | *Inline Tag:* Marks a code snippet that should be displayed in the Javadoc |
| `{@value}` | *Inline Tag:* Used to document the value of a static field |
| `@apiNote` | Provides additional information about the API |
| `@implSpec` | Describes the implementation specification of a method or class |
| `@implNote` | Provides additional implementation notes |


### Important Notes

> Javadoc comments begin with `/**` and end with `*/`.
>
> Javadoc can be generated into HTML documentation using the `javadoc` tool via the command line or an IDE.
>
> Not every tag is valid in every context. For example, `@param` is used for methods and constructors, while `@author` is typically used for classes.
>
> Inline tags (like `{@link}` or `{@code}`) must always be enclosed in curly braces `{}` to render correctly.
>
> Clear and well-written Javadoc improves code readability and maintainability.
>
> Javadoc documents what a class or method does, not how it is implemented.
