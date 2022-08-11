import java.util.*

fun main() {
    while (true){
    val cal = Cal()
    var scanner = Scanner(System.`in`)
    print("1=")
    val  a :Double = scanner.nextDouble()
    scanner = Scanner(System.`in`)
val sign = scanner.next()
print("2=")
    val b :Double= scanner.nextDouble()
when(sign){
    "+"->{

        cal.plus(a,sign,b)

    }
    "-"->{
        cal.minus(a,sign,b)

    }
    "*"->{
        cal.multiplication(a,sign,b)

    }
    "/"->{
        cal.division(a,sign,b)

    }
    "%"->{
        cal.percent(a,b)
    }
    "!"->{
        cal.factorial(a,b)
    }



}


}}