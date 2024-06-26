fun main(args: Array<String>) {
//    var nums: List<Int> = listOf(1, 2, 3, 4, 5, 6);
//    var i = 0;
//    while(i < nums.size) {
//        if (nums[i] % 2 == 0) {
//            println("O número ${nums[i]} é par")
//        } else {
//            println("O número ${nums[i]} é ímpar");
//        }
//        i++;
//    }

//    for (i in 0 until nums.size) {
//        if (nums[i] % 2 == 0) {
//            println("O número ${nums[i]} é par")
//        } else {
//            println("O número ${nums[i]} é ímpar");
//        }
//    }

    val fruits: List<String> = listOf("Maçã", "Uva", "Laranja", "Melancia");

//    var i = 0;
//
//    while (i < fruits.size) {
//        println(fruits[i]);
//        i++;
//    }

    for (fruit: String in fruits) {
        println(fruit);
    }
}