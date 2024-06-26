package classes.model

class Employee: Person() {

    public var position: String = "";
    public var salary: Double = 0.0;

    override fun getData() {
        println("Name: $name");
        println("Birthdate: $birthdate");
        println("Weight: $weight");
        println("Height: $height");
        println("Age: $age")
        println("Position: $position")
        println("Salary: $salary")
        println("----------------------------")
    }

}