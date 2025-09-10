fun main() {
    println("Realizar un algoritmo en que me permita hallar la suma de los n números consecutivos.")
    println("Digite el n:")
    val n = readLine()!!.toInt();
    println("Digite desde donde se va a comenzar:")
    val comienzo=readLine()!!.toInt();
    var sum=0;
    for (i in comienzo until comienzo + n) {
        sum += i
    }
    println("La suma de los "+n+" números consecutivos empezando desde el "+comienzo+" es "+sum)
}