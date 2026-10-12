# Lab 4: Inheritance and Polymorphism

## Concepts and where they are used

| Concept | Exact context in this lab |
|---|---|
| Interface | `Shape` declares the common `getName()` and `calculateSurfaceArea()` contract. |
| Abstraction | `Shape2D` and `Shape3D` define common categories without being instantiated directly. |
| Inheritance | `Square`, `Rectangle`, `Circle`, and `Triangle` extend `Shape2D`; `Sphere`, `SquarePyramid`, `Cuboid`, `Cone`, and `Cylinder` extend `Shape3D`. |
| Encapsulation | Shape dimensions are `private final` fields and are supplied through constructors. |
| Method overriding | Every concrete shape overrides `getName()` and `calculateSurfaceArea()`; 3-D shapes also override `calculateVolume()`. |
| Runtime polymorphism | `Shape2DApp` and `Shape3DApp` store different concrete objects in a `Shape[]` and invoke `shape.calculateSurfaceArea()` without checking the concrete class. |
| Upcasting | A `Square`, `Circle`, or other concrete object is assigned to a `Shape` reference when it is placed into the array. |
| Downcasting | `Shape3DApp` casts a `Shape` to `Shape3D` only for the additional 3-D `calculateVolume()` operation. |
| Composition / has-a relationship | Each application has an array of `Shape` objects representing the selected figure. |
| Constructor initialization | Each shape constructor receives and stores its dimensions before calculation. |
| Deferred calculation | Dimensions are read and objects are created first; area or volume is calculated only after the user selects the requested calculation. |
| Mathematical specialization | Each subclass supplies its own area, surface-area, or volume formula while the applications use one common interface. |

## Design decision for 2-D and 3-D shapes

The relationship between a 2-D shape and a 3-D shape is not modeled as
“a sphere is a circle.” A sphere and a circle are different geometric
objects. Instead, both families implement the common `Shape` interface.
`Shape2D` and `Shape3D` specialize that common abstraction, while
`Shape3D` adds volume support for the future calculation requirement.

## Verification figures

For the requested 2-D figure:

- Circle with radius 10: `100 * PI`
- Triangle with base 20 and height 25: `250`
- Rectangle with length 50 and breadth 20: `1000`
- Total: `1250 + 100 * PI`, approximately `1564.16`

For the 3-D version, `Shape3DApp` supports sphere, square-based pyramid,
and cuboid. It also supports the replacement cone and cylinder choices
without requiring a different application class.
