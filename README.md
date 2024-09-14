# Assignment Responses

The following project contains the answers to the eighth test required for my training as a Junior Fullstack Developer.

## Prerequisites
To run these exercises, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- IntelliJ IDEA or another Java IDE
- Maven or Gradle (if using dependency management)


## List of Exercises

#### 1. Encapsulation Exercise
- **Objective:** Create a `Product` class with private attributes and public methods for access and modification. Ensure price and quantity are never negative.
- **Files:**
  - `Product.java`
  - `Main.java`

#### 2. Inheritance Exercise
- **Objective:** Define an abstract `Employee` class and create subclasses `Manager` and `Developer`. Implement a `calculateBonus` method that returns different bonus values for each employee type.
- **Files:**
  - `Employee.java`
  - `Manager.java`
  - `Developer.java`
  - `Main.java`

#### 3. Polymorphism with Interfaces
- **Objective:** Create an `IMeioTransporte` interface with methods `acelerar()` and `frear()`. Implement this interface in `Car`, `Bicycle`, and `Train` classes. Use polymorphism to manage different transportation types.
- **Files:**
  - `IMeioTransporte.java`
  - `Car.java`
  - `Bicycle.java`
  - `Train.java`
  - `Main.java`

#### 4. Polymorphism with Abstract Classes
- **Objective:** Create an abstract `Animal` class with an abstract method `emitirSom()`. Implement `Dog`, `Cat`, and `Cow` subclasses, each with a specific implementation of `emitirSom()`.
- **Files:**
  - `Animal.java`
  - `Dog.java`
  - `Cat.java`
  - `Cow.java`
  - `Main.java`

#### 5. Abstraction in Payment Systems
- **Objective:** Define an abstract `PaymentMethod` class with abstract methods `processPayment(double amount)` and `validatePayment()`. Implement this class in `CreditCard`, `Boleto`, and `Pix` classes.
- **Files:**
  - `PaymentMethod.java`
  - `CreditCard.java`
  - `Boleto.java`
  - `Pix.java`
  - `Main.java`

#### 6. Employee Management System
- **Objective:** Create a system to manage different types of employees (`Manager`, `Developer`, `Intern`). Calculate salaries and bonuses, handle promotions, and utilize a combination of inheritance, polymorphism, and encapsulation.
- **Files:**
  - `Employee.java`
  - `Manager.java`
  - `Developer.java`
  - `Intern.java`
  - `PayrollSystem.java`


## How to Run Locally

1. **Clone the Repository**

   Clone the repository to your local machine:
   
   ```bash
   git clone https://github.com/isaallama/list08.git
    ```
2. **Navigate to the Project Directory**

    Change to the project directory:

    ```bash
    cd list08
    ```

3. **Run the Application**
   Run the specific Java class for each exercise. For example:

     1. Compile
   ```bash
   javac Product.java Main.java
   ```
   2. Run
   ```bash
   java Main
   ```
   
