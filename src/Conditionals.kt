fun main(args: Array<String>) {
    /* val age: Int = 14;
    if (age >= 18) {
        println("Maior de idade!");
    } else {
        println("Menor de idade!");
    } */

    /* val color: String = "azul";

    if (color == "vermelho") {
        println("Você escolheu vermelho");
    } else if (color == "azul") {
        println("Você escolheu azul");
    } else {
        println("Você escolheu amarelo");
    } */

    /* val num: Int = 11;

    when (num % 2) {
        0 -> println("Número $num é par");
        // 1 -> println("Número $num é ímpar");
        else -> println("Número $num é ímpar");
    } */

    val letter: String = "z";

    when (letter) {
        "a", "e", "i", "o", "u" -> println("A letra $letter é vogal");
        else -> println("A letra $letter é consoante!");
    }
}