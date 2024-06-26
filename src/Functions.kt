fun main(args: Array<String>) {
    hello();
    sum(10, 20);
    sum(a=20, b=40);
    val x: Int = subtraction(10, 5);
    println(x);
    val y: Int = divide(10, 5);
    print(y);
}

fun sum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

fun hello() {
    println("Hello!");
}

fun subtraction(a: Int, b: Int): Int {
    return a - b;
}

fun divide(a: Int, b: Int) = a / b;