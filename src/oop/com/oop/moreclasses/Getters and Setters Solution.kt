fun main(args: Array<String>) {
    var bankAccount = BankAccoun2()
    bankAccount.updateAmount(5000)
    bankAccount.amount= 11_000
    bankAccount.interestRate = 3.5
}

class BankAccoun2 {

    var interestRate = 0.0
        get() = field
        set(value) {
            field = value
            println("BankAccount2 has interestRate: $interestRate and amount: $amount")
        }

    var amount: Int = 0
        get() = field
        set(value) {
            field = value
            if (value < 1000) interestRate = 1.0
            else if (value < 10_000) interestRate = 0.5
            else interestRate = 0.2
            println("BankAccount2 has interestRate: $interestRate and amount: $amount")
        }

    fun updateAmount(amount:Int){
        this.amount = amount
    }
}