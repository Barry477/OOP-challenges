// Main class file to demonstrate Inheritance and Aggregation

import java.util.*;

// Abstract superclass - Inheritance
abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void performOperation(LibraryOperation operation, Library library);
}

// Librarian class inherits from Person
class Librarian extends Person {
    private String staffCode;

    public Librarian(int id, String name, String staffCode) {
        super(id, name);
        this.staffCode = staffCode;
    }

    @Override
    public void performOperation(LibraryOperation operation, Library library) {
        operation
