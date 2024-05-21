# Object Oriented Introduction Lab II
Congratulations! You just applied the most important principles of Object-Oriented Programming, with Encapsulation you encapsulated the properties of each animal by defining private fields and providing public getter and setter methods, this ensures that the internal state of the object is securely controlled and accessible only through wanted sources, with Inheritance you created an Animal class that contains common properties and methods shared by all its subclasses, at the same time it serves as Abstraction, providing a common template for all animals which may include abstract/non-abstract methods that must be implemented by its subclasses, enforcing a consistent behavior across different animals, and lastly, through Polymorphism, you treated objects of different animals as instances of the common Animal class and overloaded/overrided its methods, this allows for flexibility in the program, as methods that work with Animal objects can be used with any subclass without knowing the specific type. 
These principles enhance flexibility and reusability, simplify code through abstraction, and promote extensibility with polymorphism. Encapsulation ensures data protection, contributing to improved security and integrity. Overall, these principles lead to a well-organized and maintainable codebase, facilitating the addition of new features without extensive modifications. 

It’s time for you to get hands-on with these concepts and use them to try and solve some exercises. The next exercise focuses on object-oriented concepts such as abstraction, polymorphism, inheritance, and interface implementation. You'll be working with a hierarchy of geometrical shapes represented by an abstract class called Shape. Each shape has common properties like color and class specific behaviors like calculating area and perimeter. 


## Helpful resources 
To complete this lab, you might find the following resources helpful: 

Object-Oriented Programming Concepts (Oracle): https://docs.oracle.com/javase/tutorial/java/concepts/

What is Object Orientation? (Pluralsight): https://app.pluralsight.com/ilx/video-courses/86714d19-8b08-404a-b24e-7fcff53fa426/af09bc2c-9029-42e9-8192-c12ebf543666/048dcc2a-2560-41a0-9884-8c96f5de009b

Working with Classes and Interfaces in Java 11 (Pluralsight): https://app.pluralsight.com/library/courses/working-classes-interfaces-java/table-of-contents

Math Class in Java (Oracle): https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

## Prerequisites:
#### 1. Download and install JDK 17 (at a minimum) from this link: https://www.oracle.com/java/technologies/downloads/
#### 2. Download and install Spring Tool Suite for Eclipse from this link: https://spring.io/tools
#### 3. Download and install Git from this link: https://git-scm.com/downloads

## Completing this lab:
#### 1. Clone this Git repository locally
#### 2. Open the repository in Spring Tool Suite by going to File/Open Projects From File System
#### 3. Navigate to the com.example.demo.exercise package. You'll see the Rectangle, Triangle, and Circle classes. Model them based on this diagram and overview:


##### Overview

 

Shape (Abstract Class): 

Properties: 
color (String): Represents the color of the shape. 

Abstract Methods: 
calculateArea(): double - To be implemented by subclasses for area calculation. 
calculatePerimeter(): double - To be implemented by subclasses for perimeter calculation. 
Ensure this implements the Drawable interface. 

 

Drawable (Interface): 

Methods: 
draw(): void - A method that shapes implementing this interface must provide. 

 

Rectangle, Triangle, and Circle (Concrete Classes): 
Each of these classes extends the Shape abstract class and implements the Drawable interface. 
They provide specific properties and implementations for calculating area, perimeter, and drawing the shape.  

Your tasks are: 
* Declare the Shape abstract class with the specified properties and methods. 
* Declare the Drawable interface and ensure the Shape class implements it. 
* Create concrete classes (Rectangle, Triangle, and Circle) that extend the Shape class. Provide specific implementations for calculating area, perimeter, and drawing the respective shapes (this can be just a text print, e.g. "Drawing a red circle"), it will require overriding. 
* Overload Rectangle and Triangle constructors, in the case all sides are equal in length you only need to provide one value for all their sides. 
* Override the toString() method from the Object class in each of the concrete classes. 

 

To complete the area and perimeter calculating methods, you may find useful the built-in Java class called Math, it contains methods for performing basic numeric operations. Search for the following: Math.PI, Math.pow() and Math.sqrt(). 

##### Diagram
![alt text](https://github.com/mentoring-acn/ObjectOrientedIntroductionII/blob/main/src/main/resources/static/ClassDiagram.png)

#### 4. Go to the com.example.demo package in the test packages, open the ObjectOrientedIntroduction2ApplicationTests class, and then go to Run/Run As/JUnit Test.
For this lab to be considered complete, please provide a screenshot off ALL the test cases passing to the person that assigned this lab to you.