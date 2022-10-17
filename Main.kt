
fun main() {
    val point = Point( 3, 7,  9 ,  4)
    val fraction = Fraction(  2,  4,  6 , 1)

    println(point.toString())
    println(point.Symetric())
    println(fraction.multiply())
    println(fraction.sum)
    println(fraction.truncateFraction())
}
class Point(X : Int, Y: Int, A: Int, B : Int) {

    val Y = Y
    val X = X
    val A = A
    val B = B

    fun Symetric() : String{
        val symetricY = -X
        val symetricX = -Y

        return"($symetricX,$symetricY"
    }

    fun truncate(){
        var a = 2
        var truncate = 2

        while (a <= mnishvneli && a <= mricxveli){
            if (mnishvneli % a == 0 && mnishvneli % a == 0)
                truncatedFraction = a
            ++a
        }
        val axalimricxveli = mricxveli / truncate
        val axalimnishveli = mnishvneli / truncate
        println("answer: $axalimricxveli/$axalimnishveli")
    }
}
class Fraction(mricxveli: Int, mnishvneli: Int,mricxveli2 : Int, mnishvneli2: Int ){
    val mricxveli = mricxveli
    val mnishvneli = mnishvneli
    val mricxveli2 = mricxveli2
    val mnishvneli2 = mnishvneli2

    fun sum(){
        val bolomnishvneli = mnishvneli + mnishvneli2
        val bolomnishveli2 = (mricxveli*mnishvneli2)+(mricxveli2+mnishvneli)
        val bolomricxveli = mricxveli*mricxveli2

        if (mnishvneli == mricxveli2)
            print("answer:$bolomnishvneli/$bolomricxveli")
        else{
            println("answer:$bolomnishveli2/$bolomricxveli")
        }
    }


}

