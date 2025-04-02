### **Enums in Java**

In Java, **`enum` (short for enumeration)** is a special data type used to define a collection of **fixed constants**. Enums are useful when you have a set of predefined values that a variable can take.

---

## **1. Basic Syntax of Enums**
An `enum` is declared using the `enum` keyword. Each constant inside an enum is **implicitly `public`, `static`, and `final`**.

### **Example: Defining an Enum**
```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY; // Assigning an enum value
        System.out.println("Today is: " + today);
    }
}
```
**Output:**
```
Today is: WEDNESDAY
```
Here, `Day` is an enum that contains the names of the days of the week.

---

## **2. Using Enums in a Switch Case**
Enums can be used in a `switch` statement, making the code more readable.

### **Example: Using Enums in a Switch Statement**
```java
enum TrafficSignal {
    RED, YELLOW, GREEN;
}

public class EnumSwitchExample {
    public static void main(String[] args) {
        TrafficSignal signal = TrafficSignal.RED;

        switch (signal) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Get Ready!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}
```
**Output:**
```
Stop!
```
---

## **3. Enum with Properties and Methods**
Enums can have **fields, constructors, and methods** just like normal classes.

### **Example: Enum with Constructor and Method**
```java
enum Planet {
    EARTH(5.97), MARS(0.64), JUPITER(1898);

    private double mass; // in 10^24 kg

    // Constructor
    Planet(double mass) {
        this.mass = mass;
    }

    // Getter Method
    public double getMass() {
        return mass;
    }
}

public class EnumWithMethods {
    public static void main(String[] args) {
        Planet p = Planet.EARTH;
        System.out.println(p + " has mass " + p.getMass() + " x 10^24 kg");
    }
}
```
**Output:**
```
EARTH has mass 5.97 x 10^24 kg
```
### **Key Points Here:**
- Enum constants **(EARTH, MARS, JUPITER)** are objects.
- Enum has a **constructor** that sets a mass value for each planet.
- A **getter method** `getMass()` returns the mass.

---

## **4. Enum Methods**
Enums come with some built-in methods:

| Method | Description |
|--------|------------|
| `values()` | Returns an array of all enum constants |
| `ordinal()` | Returns the position of an enum constant (starting from 0) |
| `name()` | Returns the name of the enum constant |

### **Example: Using Built-in Enum Methods**
```java
enum Color {
    RED, GREEN, BLUE;
}

public class EnumMethodsExample {
    public static void main(String[] args) {
        // Using values() method
        for (Color c : Color.values()) {
            System.out.println(c + " at index " + c.ordinal());
        }

        // Using name()
        Color color = Color.GREEN;
        System.out.println("Color name: " + color.name());
    }
}
```
**Output:**
```
RED at index 0
GREEN at index 1
BLUE at index 2
Color name: GREEN
```
---

## **5. Enum Implementing an Interface**
An enum **can implement an interface**, but it **cannot extend a class**.

### **Example: Enum Implementing an Interface**
```java
interface Vehicle {
    void showSpeed();
}

enum Car implements Vehicle {
    TOYOTA(180), BMW(250), AUDI(240);

    private int speed;

    Car(int speed) {
        this.speed = speed;
    }

    public void showSpeed() {
        System.out.println(this.name() + " has max speed: " + speed + " km/h");
    }
}

public class EnumInterfaceExample {
    public static void main(String[] args) {
        Car myCar = Car.BMW;
        myCar.showSpeed();
    }
}
```
**Output:**
```
BMW has max speed: 250 km/h
```
---

## **6. Enum Inside a Class**
Enums can be **declared inside a class**.

### **Example: Enum Inside a Class**
```java
class MobileStore {
    enum Mobile {
        APPLE, SAMSUNG, NOKIA;
    }
}

public class EnumInsideClass {
    public static void main(String[] args) {
        MobileStore.Mobile phone = MobileStore.Mobile.SAMSUNG;
        System.out.println("Selected phone: " + phone);
    }
}
```
**Output:**
```
Selected phone: SAMSUNG
```
---

## **7. Comparing Enum Values**
Enums should be **compared using `==` instead of `.equals()`** because they are **singleton objects**.

### **Example: Comparing Enum Values**
```java
enum Level {
    LOW, MEDIUM, HIGH;
}

public class EnumComparison {
    public static void main(String[] args) {
        Level l1 = Level.LOW;
        Level l2 = Level.LOW;

        // Using == for comparison
        if (l1 == l2) {
            System.out.println("Both are same");
        }
    }
}
```
**Output:**
```
Both are same
```
---
## **Key Takeaways**
1. **Enums define a fixed set of constants.**
2. **Each enum constant is a singleton object.**
3. **Enums can have properties, constructors, and methods.**
4. **Use `values()`, `ordinal()`, and `name()` to work with enums.**
5. **Enums can be used in switch statements.**
6. **They can implement interfaces but cannot extend classes.**
7. **Use `==` instead of `.equals()` for comparison.**

---

## **When to Use Enums?**
- When you have a fixed set of predefined values (e.g., days of the week, directions, user roles).
- When using switch statements to handle specific cases.
- When you need to associate additional properties with each constant.

