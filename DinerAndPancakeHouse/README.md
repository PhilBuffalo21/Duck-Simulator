This folder contains files that showcase Iterator pattern.

_Iterator Pattern_

- **Intent**: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- **Main Components**:

  - **Iterator**: Defines an interface for accessing and traversing elements. (Java's Iterator)
  - **ConcreteIterator**: Implements the Iterator interface and keeps track of the current position in the traversal of the aggregate.(DinerMenuIterator and PancakeHouse Iterator)
  - **Aggregate**: An interface that defines creating an Iterator object. (Menu)
  - **ConcreteAggregate**: Implements the Aggregate interface and returns an instance of ConcreteIterator. (Diner and PancakeHouse)

    This is the essence of the principle: Code to an interface, not an implementation. The Iterator Pattern embodies this principle by allowing iteration over a collection without tying the client to its concrete representation.
