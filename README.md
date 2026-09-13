# Builder Design Pattern — Doll Creation System

This project is an implementation of the **Builder Creational Design Pattern** in Java, developed for the *Software Design Patterns* course at Astana IT University.

## Project Overview

The project simulates a doll manufacturing and customization system. Constructing a complex object like a `Doll` requires step-by-step assembly of various optional attributes (name, hair color, outfit, accessories, and electronic modules).

The Builder Pattern separates the construction logic of a `Doll` from its representation, allowing the creation of different doll types (`PrincessDoll`, `SuperheroDoll`) using a unified build interface.

---

## Architectural Components

The implementation strictly follows the classic Builder Pattern structure:

1. **Product (`Doll`)**: The complex object representing a customizable doll.
2. **Builder Interface (`DollBuilder`)**: Defines uniform step-by-step construction methods and supports Fluent API (method chaining).
3. **Concrete Builders**:
   * `PrincessDollBuilder`: Assembles princess-style dolls with default royal attributes and custom validation.
   * `SuperheroDollBuilder`: Assembles superhero-style dolls with battle outfits and custom validation.
4. **Director (`DollDirector`)**: Defines predefined assembly routines for popular doll configurations (`makeRoyalPrincess`, `makeActionHero`).
5. **Client (`Main`)**: Demonstrates doll creation via the Director and through direct Fluent API builder calls.

## How to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/kokkokqqqo-cpu/BuilderPatternAssignment.git](https://github.com/kokkokqqqo-cpu/BuilderPatternAssignment.git)
   cd BuilderPatternAssignment
2. Compile the Java source files:
   ```bash
   javac -d bin src/*.java
3. Run the application:
   ```bash
   java -cp bin Main

## Clean Code Principles Applied

1. **Fluent API / Method Chaining**: Builder methods return `this` to enable readable, chained method calls.
2. **Single Responsibility Principle (SRP)**: Clean separation between product data (`Doll`), assembly steps (`DollBuilder`), and preset management (`DollDirector`).
3. **Validated Construction**: The `build()` method enforces object integrity by throwing an `IllegalStateException` if mandatory fields (such as name) are missing.
4. **Encapsulation**: Field mutations are restricted to package-private setters, ensuring objects are constructed via the builder interface.
5. **Intention-Revealing Names**: Class and method names clearly describe their specific architectural and domain roles.
