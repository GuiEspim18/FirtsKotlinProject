fun main(args: Array<String>) {
    val movies: HashSet<String> = HashSet();
    println(movies.size);
    movies.add("Homem-Aranha");
    movies.add("Carros");
    movies.add("1917");
    println(movies.size);
    println(movies);
    movies.add("Homem-Aranha");
    movies.add("Homem-Aranha 2");
    movies.add("John Wick");
    movies.add("Ford vs Ferrari");
    println(movies);
    println(movies.contains("Carros"));
    println(movies.contains("Kingsman"));
    movies.remove("Homem-Aranha");
    println(movies);

    val cars = setOf<String>("Nissan GTR", "Nissan March", "Porsche 911 GT3 RS", "VW Polo GTS");
    println(cars);

}