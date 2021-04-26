package de.haegerconsulting.concepts.inheritence;

import de.haegerconsulting.concepts.inheritence.Customer;
import de.haegerconsulting.concepts.inheritence.Employee;
import de.haegerconsulting.concepts.inheritence.Person;
import de.haegerconsulting.concepts.inheritence.abstraction.ConcreteCustomer;
import de.haegerconsulting.concepts.inheritence.abstraction.ConcreteEmployee;

public class App {

    public static void main(String[] args){
        /**
        #1
        Inheritence
        Beispiel: Implementierung einer Zeiterfassung, die Domains "Customer" und "Employee" sollen definiert werden.
        de.haegerconsulting.inheritence
        */

        Customer customer = new Customer(1L, "Ralf", "Haeger", "ralf@haeger.de",
                "ralfPassword", "Haeger Consulting", "100");
        Employee employee = new Employee(1L, "Andreas", "Monschau", "andreas@company.de",
                "secret", 14);
        System.out.println(customer);
        System.out.println(employee);
        Person person = new Person(1L, "Cedrik", "Nauerth", "cedrik@company.de", "secretpwd");
        System.out.println(person);
        //Macht es Sinn, eine Instanz vom Typ "Person" erzeugen zu können, wenn wir eigentlich nur "Customer" und
        //"Employee" brauchen und die Klasse "Person" lediglich gemeinsame Attribute aggregiert?

        /**
        #2
        Inheritence Abstract Base Class
        Beispiel: Implementierung einer Zeiterfassung, die Domains "Customer" und "Employee" sollen definiert werden.
        de.haegerconsulting.inheritence.abstraction
        */

        ConcreteCustomer concreteCustomer = new ConcreteCustomer(1L, "Ralf", "Haeger", "ralf@haeger.de",
                "ralfPassword", "Haeger Consulting", "100");
        ConcreteEmployee concreteEmployee = new ConcreteEmployee(1L, "Andreas", "Monschau", "andreas@company.de",
                "secret", 14);
        System.out.println(concreteCustomer);
        System.out.println(concreteEmployee);
        //Der Versuch einer Instanziierung der Klasse AbstractPerson ist nicht moeglich (gerne mal ausprobieren...), sie ist
        //auch nicht notwendig

    }
}
