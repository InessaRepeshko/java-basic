## Task13 "Use of polymorphism"

For the Box and ColorBox classes from the previous homework override the toString method of the Object class, in which the implementation of the Box class will output information about the length, width and height, as well as the material of the box, and for the ColorBox class - all the same information and information about the color of the box. 

Also create a Warehouse class which will contain an array of boxes (exactly the basic type of boxes - Box) and the number of boxes that have already been added to this array. Create the array in the constructor of this class (take the array size as a constructor parameter). Implement a method in this class to add a box to the array (take the basic type - Box), provide validation - check if it is possible to add a box to the array, the number of added boxes should not exceed the length of the array. Also override the toString method for this class - which will output information about all the boxes stored in the warehouse.

In the main method create an instance of the Warehouse class (set its capacity using the constructor). Fill the warehouse with boxes (different ones - both Box and ColorBox instances) and output information about the warehouse (call the warehouse toString method).

© Inessa Repeshko. 2021
