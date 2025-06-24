# 📘 Problem 2 - Solving quadratic equations

This Java program solves quadratic equations of the form `ax² + bx + c = 0`, indicating whether the roots are real, equal or belong to the set of complex numbers.

## 📋 Problem description

Given the user enters the coefficients `a`, `b` and `c`, the program:

1. Calculates the **discriminant** `D = b² - 4ac`.
2. Determine the number of real solutions:
   - If `D > 0`: two distinct real roots.
   - If `D = 0`: a double real root.
   - If `D < 0`: complex roots.
3. Calculate and display the roots if they are real.

## ⚙️ Requirements

- Java JDK 8 or higher
- Compiler or IDE such as NetBeans, Eclipse or VS Code

## 🚀 Execution

Compile and run the file with:

```bash
javac Dos.java
java Dos
💡 Example of use
yaml
Copy
Edit
Enter the coefficient a:
1
Enter the coefficient b:
-3
Enter the coefficient c:
2
The equation has two real roots:
x1 = 2.0
x2 = 1.0
```

## 🛠️ Author
José Manuel Cortes Cerón

First semester collaborative project - ITSOEH

