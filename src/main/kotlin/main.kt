fun main() {
    val transferAmount = 20020
    val percent = 0.0075
    val minimal = 3500

    var amount = transferAmount * 100
    var commission = (amount * percent).toInt()
    if (commission <= minimal) {
        commission = minimal
        amount += commission

    } else {
        amount += commission
    }

    var resultAmount = amount.toDouble() / 100
    var resultCommission = commission.toDouble() / 100
    println("Сумма перевода: $resultAmount рублей, включая сумму комиссии\n" +
            "Сумма комиссии составляет: $resultCommission рублей")
}