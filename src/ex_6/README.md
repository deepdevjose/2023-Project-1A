# 🧠 Problem 6 - Boolean Expression Generation from Truth Table

This Java program generates a **boolean expression** from a user-defined truth table, using combinations of bits that produce a logical result equal to 1.

## 📋 Problem Description.

Given a number of bits `n`, the program:

1. generates all possible binary input combinations (2ⁿ combinations).
2. Prompts the user for the output (0 or 1) for each combination.
3. Creates a **simplified Boolean expression** representing the combinations with output 1, using letters (A, B, C, ...) to represent the bits.

## ⚙️ Requirements

- Java JDK 8 or higher
- Compiler or IDE such as NetBeans, Eclipse or VS Code

## 🚀 Execution

Compile and run the file with:

````bash
javac Seis.java
java Seis
💡 Example of use
yaml
Copy
Edit
Enter the number of bits: 
2

Combinations:
A B | Output
0 0 | ? 
0 1 | ? 
1 0 | ? 
1 1 | ?

Enter the outputs:
0 1 1 1 0

Result:
Boolean Expression: (¬A ∧ B) ∨ (A ∧ ¬B)
````

## 🛠️ Author
José Manuel Cortes Cerón

First semester collaborative project - ITSOEH