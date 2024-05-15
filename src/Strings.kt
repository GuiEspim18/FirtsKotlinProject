fun main() {
    // Strings in kotlin
    var name = "Guilherme";
    println(name);
    name = "Heloísa";
    println(name);
    println(name.length);
    var city: String = "São Paulo";
    println("O nome da cidade é " + city);
    println("O número de lentras guardadso são " + city.length);
    var type = 'X'; // creating char
    var (code, description) = Pair(100, "Mouse");
    println(code);
    println(description);
}