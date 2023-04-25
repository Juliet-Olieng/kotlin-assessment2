import java.awt.font.FontRenderContext

fun main(args: Array<String>) {
   println( valuesStrr("kaitlin"))
    createPassword("juliet236")
    numbers(24)
    numbers(42)

    var currentAmount=CurrentAmount(124578342F,"JULIET",124452.50)
    currentAmount.details()
    currentAmount.deposits(1000.00)
    currentAmount.withdrawal(5000)
}
//question1
fun valuesStrr(name:String):String{
    var vowel=("a,e,i,o,u")
    var i=0
if (name[i].toChar()==vowel[i].toChar()){
    i++

}
    return name

}
//question2
fun createPassword(password:String){
    var newpass=password.toCharArray()
    if (newpass.size > 8 && newpass.size<16 ){
      println("valid password")
    }
    else if(newpass==password.toCharArray()){
        println("valid password")
    }
    else if (newpass.toString()!="password"){
        println("valid password")

    }
    else{
        println("password not valid")
    }


}
//question3
fun numbers(num:Int){
    for (num in 1..1000)
    if(num %6==0 && num%7==0){
        println("bingo")
    }
    else{
        println(num)
    }
}
//question4
open class CurrentAmount(var accountNumber:Float,var accountName: String,var balance:Double){
    fun deposits(deposit:Double){
        val amount=deposit+balance
        println(amount)
    }
    open fun withdrawal(withdraw:Int){
        val amount2=balance-withdraw
        println(amount2)
    }
    fun details(){
        println("Account number $accountNumber with a balance$balance is operated by $accountName")
    }


}
//question5
class SavingAccount(accountNumber: Float,accountName: String,balance: Double):CurrentAmount(accountNumber,accountName,balance){
    override fun withdrawal(withdraw: Int) {
        var count=0
       super.withdrawal(withdraw)
        if(withdraw<4){
            count++
        }
        return

    }
}