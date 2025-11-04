# Typewriter Text Animation in Java

This project demonstrates how to simulate a typewriter-style text output in the console by printing each character with a controlled delay. The implementation displays song lyrics line by line, with each character appearing sequentially to create a typing animation effect.

## Key Concepts Used

- **Character-by-character iteration**  
  Converting each string to a character array (`toCharArray()`) to print symbols one at a time.

- **Output flushing**  
  Using `System.out.flush()` to ensure characters are displayed immediately without buffering.

- **Thread delay**  
  Introducing controlled timing using `Thread.sleep()` to create the typewriter effect.

- **Multiline rendering**  
  Structured loops for handling multiple lines of text stored in an array.

## Pseudo-code

