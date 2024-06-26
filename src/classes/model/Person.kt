package classes.model

import java.time.LocalDate
import java.time.Period

open class Person {

    // Properties
    public var name: String = "";
    public var birthdate: LocalDate = LocalDate.of(2002, 3, 13);
    public var weight: Int = 56;
    public var height: Double = 1.72;
    public val age: Int
        get() {
            return Period.between(birthdate, LocalDate.now()).years;
        }

    // Methods
    open fun getData() {
        println("Name: $name");
        println("Birthdate: $birthdate");
        println("Weight: $weight");
        println("Height: $height");
        println("Age: $age")
        println("----------------------------")
    }

//    private fun calculateAge(): Int {
//        val age = Period.between(birthdate, LocalDate.now()).years;
//        return age;
//    }

}