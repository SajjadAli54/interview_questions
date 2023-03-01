# Object Oriented and Data Structures

## OOP features

### Required Classes

1. Class Position, which will have
   - doubles x, y, and z with setters and getters. These values will be limited to the range +/- 10.0 (i.e., from -10.0 to 10.0). If inputted a value outside that range, clamp to the closest value.
   - Method move() which takes doubles dx, dy, and dz and changes the position by + dx, + dy, +dz (it camps to max values of +/- 100 for the edges). The three values dx, dy, and dz can be positive or negative.
2. Class Animal, which will have

   - Properties: int ID, string name, double age, Position pos.
   - Methods. Setters and getters for the fields/properties, and a Move method. Move passes inputted (dx, dy, dz) to the position class (which also will have a move method, the move method in Position should handle the actual implementation of moving things).
   - ToString, (public override string ToString()). The Animal class and each subclass will implement its own ToString(), and it should just return off all of the properties in some sane format.

3. Animal subclass: Cat

   - Enum property Breed {Abyssinian, British Shorthair, Bengal, Himalayan, Ocicat, Serval} (if this confused you, look up Enumeration Types on the MSDN C# reference).

4. Animal Subclass: Snake
   - Properties: double length, bool venomous.
