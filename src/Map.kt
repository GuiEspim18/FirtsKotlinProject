fun main(args: Array<String>) {
    val products = HashMap<String, Double>();
    products.put("Macbook Air M1", 7000.0);
    products.put("Macbook Pro M1", 9000.0);
    products.put("Magic Mouse", 700.0);
    products.put("Magic Mouse ", 800.0);

    println(products);
    println(products.size);
    products.remove("Magic Mouse");
    println(products);
    println(products.get("Macbook Air M1"))

}