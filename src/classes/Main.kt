package classes

import classes.model.Employee
import classes.model.Person
import java.time.LocalDate

fun main(args: Array<String>) {
    val employee1: Employee = Employee();
    employee1.name = "Guilherme";
    employee1.height = 1.72;
    employee1.weight = 56;
    employee1.birthdate = LocalDate.of(2002, 3, 13);
    employee1.salary = 2000.00;
    employee1.position = "Data analytics";
    employee1.getData();
}