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
    println(cities.size);

    val fruits = ArrayList<String>();
    println("Size of fruits " + fruits.size);
    fruits.add("Banana");
    fruits.add("Morango");
    fruits.add("Manga");
    fruits.add("Manga");
    println("Size of fruits " + fruits.size);
    println(fruits.contains("Uva"));
    println(fruits.contains("Manga"));
    println(fruits);
    println(fruits.remove("Manga"));
    println(fruits.remove("Uva"));
    println(fruits);
}