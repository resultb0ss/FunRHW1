fun main() {
    var num = 10
    println(num.getSqr())
}

fun Int.getSqr(): Int{
    var result = this
    result *= this
    return result
}