package me.whizlabs.javaDataTypes;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: WORKING WITH JAVA DATA TYPES  ********
 * 1)   Declare and initialize variables (including casting of primitive data types)
 * 2)   DIFFERENTIATE BETWEEN OBJECT REFERENCE VARIABLES AND PRIMITIVE VARIABLES
 * 3)   Know how to read and write to object fields
 * 4)   Explain an object Lifecycle
 * 5)   Develop code that uses wrapper classes
 * *******************************************************************************************************************
 *
 * **********************************    OBJECT REFERENCE VS PRIMITIVE VARIABLES      ********************************
 *
 * ✓    Object reference variable store addresses of object they refer to
 * ✓    Primitive variables store actual values
 *
 * **********************************     COMPARISON AND ASSIGNMENT       ***********************************
 *
 * ✓    COMPARISON  : Primitive variables are compared based on their literal values; while object reference variables
 *      are compared based on the addresses of their associated objects in the memory
 *
 * ✓    ASSIGNMENT  : In the assignment of a primitive variable, the value of the right-hand side (RHS) is copied to
 *      the left-hand side (LHS), meaning that the LHS variable holds its own value; while the address is copied when
 *      assigning a reference variable, resulting in the LHS variable pointing to the same object returned by the
 *      expression on the RHS
 *
 * **********************************     PARAMETER PASSING AND VALUE RETURNING      *********************************
 *
 * ✓    PARAMETER PASSING   : A primitive variable is passed in a method by actual value, implying that changes made to
 *      the parameter are independent of the passed-in argument; whereas an object reference variable is passed by the
 *      address of the referenced object in the memory, meaning that any changes made to the parameter are reflected
 *      in the argument.
 * ✓    VALUE RETURNING     : A primitive variable is returned from a method by actual value and this variable dies
 *      after the method finishes execution; while an object reference is returned by the address of the referenced
 *      object in the memory and the original object may survive the method completion if it is assigned a variable
 *      outside the method
 *
 * *******************************************************************************************************************/


public class DifferentiateObjectPrimitive {
}
