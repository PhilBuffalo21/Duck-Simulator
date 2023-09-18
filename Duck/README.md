Duck class
Goal: - to deal with vary behaviours through subclasses:

- flying_behaviours
- quack_sound

Design Principle 1:
"Take what varies and “encapsulate” it"

if you’ve got some aspect of your code that is changing, saywith every new requirement, then you know you’ve got a behaviour that needsto be pulled out and separated from all the stuff that doesn’t change.
"take the parts that vary and encapsulate them, so that later you can alter or extend the parts that varywithout affecting those that don’t"

We know that fly() and quack() are the parts of the Duck class that vary across ducks.To separate these behaviours from the Duck class, we’ll pull both methods out of the Duck class and create a new set of classes to represent each behaviour.

Design Principle 2:
Use interfaces to represent these sets of behaviours

for instance, FlyBehavior and QuackBehavior — and each implementation of a behaviour will implement one of those interfaces.

See files to see the implementation of these two principles.

Addtionally, in an ideal situation, there isn't a need to create an instance of a subclass like in DuckClient. We also do not need for a hardcode (e.g., RubberDuck class). We have already have concrete implemenations (the sets of behaviours classes: FlywithWings, ..., etc).

We can use "dependency injection".

Directly injecting behaviors into a superclass or any class is typically referred to as "dependency injection".

In the context of the strategy pattern or similar design patterns, when you pass the behavior (usually in the form of an interface) as a parameter to a class, you are using dependency injection to decouple the specific behavior from the class itself. This allows for more flexibility and promotes the principle of composition over inheritance.

In object-oriented design and the SOLID principles, the "D" stands for Dependency Inversion Principle, which suggests that high-level modules should not depend on low-level modules, but both should depend on abstractions. Dependency injection is one way to achieve this principle.

Duck wildDuck = new Duck(new Quack(), new FlyWithWings());
wildDuck.performQuack(); // Output: Quack!
wildDuck.performFly(); // Output: I'm flying with wings!

using constructor-based dependency injection to pass specific behaviors (Quack and FlyWithWings) directly into a Duck instance. By doing this, you've decoupled the Duck class from the concrete implementations of its behaviors, allowing you to easily change or add new behaviors without modifying the Duck class itself. This approach provides flexibility and adheres to the open/closed principle, which is one of the SOLID principles, meaning that a class should be open for extension but closed for modification.
