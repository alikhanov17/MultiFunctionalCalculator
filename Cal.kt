class Cal:Calculator {
    var res :Double = 0.0
    override fun plus(a: Double, sign: String, b: Double) {
        res = a+b
        println("$a + $b = $res")
    }


    override fun minus(a: Double, sign: String, b: Double) {
       res=a-b
        println("$a - $b = $res")

    }


    override fun multiplication(a: Double, sign: String, b: Double) {
        res=a*b
        println("$a * $b = $res")

    }


    override fun division(a: Double, sign: String, b: Double) {
        res=a/b
        println("$a / $b = $res")

    }

    override fun percent(a: Double, b: Double) {
        res=(a/100)*b
        println("$a % $b = $res")
res+=a
        println("$a % $b = $res")

    }

    override fun factorial(a: Double, b: Double) {
var f = 1
        for (i in 1..a.toInt()) {
           f=f*i
        }
        println(" factorial = $f")
    }
}