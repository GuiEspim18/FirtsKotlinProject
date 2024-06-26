fun main(args: Array<String>) {
//    val nums: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
//    val pairs: List<Int> = nums.filter {
//        it % 2 == 0
//    };
//    println(pairs);

    val fruits: List<String> = listOf("Uva", "Pera", "Maçã", "Laranja", "Manga", "Mamão");
    val fruitsM: List<String> = fruits.filter {
        it.startsWith("M");
    };
    println(fruitsM);
}