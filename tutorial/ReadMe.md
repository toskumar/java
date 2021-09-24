# Java Tutorial

__Procedural Language__ is based on the concept of the procedure call. A procedure is a set of instruction which has one or more input parameters and output parameter.
```C
function float areaOfCircle(int radius) {
  return 3.14 * radius * radius;
}
```
__Object Oriented Language__ is a programming style which uses objects that contain both data and methods.

__Encapsulation__ refers to the bundling of data and methods
```java
class Circle {
 int radius;
 Circle (int radius) {
  this.radius = radius;
 }
 int area() {
  return 3.14 * this.radius * this.radius 
 }
}
```
__Abstraction__ is a process of hiding certain details and showing only essential information to the user.
```java
abstract class Bike {
 Engine engine;
 void start(){
  this.engine.start();
 }
 void stop() {
    this.engine.stop()
 }
}
```
__Inheritance__ is a process of extending the features and behaviour of one class to another class
```java
class MyBike extends Bike {
  Color color;
  Horn horn;
}
```
__polymorphism__ the ability of an object to take many forms
```java
class Printer {
   void print(Document doc) {
     //prints doc, docx, pdf and txt documents
   }
   void print(Scanned doc) {
     //prints scanned documents
   }
}
```
