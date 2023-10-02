_Composite Pattern_

The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

In simpler terms, the Composite Pattern allows you to build structures of objects with both individual elements and groups (composites) of elements. Both individual elements and composites should be treated the same way through a common interface.

The term "part-whole hierarchy" refers to a structural pattern where individual parts and their groupings (compositions) are organized in a hierarchical manner. It's a representation of objects which can be both individual parts and composite wholes in the same structure.

Here's a simple breakdown:

- **Part**: This is an individual component, something that doesn't contain other components within it. It's a standalone piece.
- **Whole**: This represents a grouping or a composition of parts. It can also contain other wholes, leading to a nested structure

**Basically, the pattern is made with an interface and TWO types of child concrete classes; `branch` and `leaf`.Where a `branch` has a data structure to contain a `leaf` or its own kind `branch` (imagine ArrayList of the inferface that contain both types). And `leaf` is just a standalone value.**

**Example of treating composite and individual is increment() and TreeOut()**

increment() in Leaf -> Increments its `val` variable.
increment() in Branch -> Goes through all Tree concrete class instances and call their increment(). Hence, if the instance is `leaf`, it increment() will increment its `val` variable. Otherwise, (well there is only one other case, `Branch`), it will call that `Branch` increment(), and go through all that `Branch`'s children. And process repeats.
