**Suppose an expression**-
a = 10;
here, a is a ref variable and 10 is the value it points to.

how this is stored is that -
a (the ref variable) is stored in the **STACK** memory'
while, the value 10 is stored in the HEAP memory.
where a is a variable in stack memory that points to the value 10 in the heap memory.


**STACK** :  Stores primitive values (int, char, double) and local variable references.
It operates in a LIFO (Last In, First Out) order for function calls.

**HEAP** : Stores all Objects and Arrays (new keyword).
Reference variables sitting on the Stack point to memory addresses inside the Heap.



**MULTIPLE REF VARIABLES CAN POINT TO THE SAME OBJECT/VALUE**

**IF ANY ONE REF VARIABLES MODIFY THE OBJECT, ALL VARIABLES WILL ACKNOWLEDGE THE CHANGE**

**THE ORIGINAL OBJECT ITSELF IS MODIFIED**



if no ref variable is pointing towards a specific object, then **GARBAGE COLLECTION** will clear it from memory
automatically after some time.


**Java is Strictly Pass-by-Value**
In C++, you had pass-by-reference (&x). Java does NOT have pass-by-reference.
When you pass a primitive to a method, Java passes a copy of the value.
When you pass an Object or Array to a method, Java passes a copy of the reference address (value of the reference).

**Java Pass-by-Value Mechanism**
Java is strictly pass-by-value. It never uses pass-by-reference.
Primitives: Methods receive a copy of the literal value.
Modifying this copy inside a method leaves the original Stack variable unchanged.
Objects & Arrays: Methods receive a copy of the reference address.
Modifying the object state or array elements alters the Heap object.
Reassigning the reference inside the method only rebinds the copy, leaving the original caller reference intact.