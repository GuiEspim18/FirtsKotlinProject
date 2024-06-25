fun main() {
    val cities: Array<String> = arrayOf<String>("São Paulo", "Rio de Janeiro", "Curitiba");
    println(cities[1]);
    println(cities[2]);
    cities[2] = "Florianópolis";
    println(cities[2]);
    var empty: Boolean = cities.isEmpty();
    println(empty);
    val values: Array<Int> = arrayOf();
    empty = values.isEmpty();
    println(empty);
}