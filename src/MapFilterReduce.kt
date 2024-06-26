fun main(args: Array<String>) {
    val nums: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
//    val pairs: List<Int> = nums.filter {
//        it % 2 == 0;
//    };
//    println(pairs);

    val fruits: List<String> = listOf("Uva", "Pera", "Maçã", "Laranja", "Manga", "Mamão");
    val fruitsM: List<String> = fruits.filter {
        it.startsWith("M");
    };
    println(fruitsM);

    println("---- Utilizando o map ----");

    val fruitsUpper: List<String> = fruits.map {
        it.uppercase();
    };
    println(fruitsUpper);

    println("---- Utilizando o reduce ----");

    // current -> current number
    // next -> next number
    val sum: Int = nums.reduce { current, next ->
        current + next
    };

    print(sum);

}