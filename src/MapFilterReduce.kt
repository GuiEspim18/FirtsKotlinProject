fun main(args: Array<String>) {
    val nums: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
    val pairs: List<Int> = nums.filter {
        it % 2 == 0
    };
    println(pairs);
}