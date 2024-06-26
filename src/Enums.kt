fun main(args: Array<String>) {

    val account1: AccountType = AccountType.SAVINGS;
    println(account1.accountName);

    val account2: AccountType  =AccountType.CHECKING;
    println(account2.accountName);
    println(account2.name);

}

enum class AccountType(var accountName: String) {
    CHECKING("Checking"),
    SAVINGS("Savings"),
    SALARY("Salary")
}