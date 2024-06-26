package classes

import classes.model.Person
import java.time.LocalDate

fun main(args: Array<String>) {
    val person: Person = Person();
    person.name = "Guilherme";
    person.height = 1.72;
    person.weight = 56;
    person.birthdate = LocalDate.of(2002, 3, 13);
    person.getData();

    val person2: Person = Person();
    person2.name = "Heloísa";
    person2.height = 1.59;
    person2.weight = 97;
    person2.birthdate = LocalDate.of(2003, 4, 8);
    person2.getData();
}