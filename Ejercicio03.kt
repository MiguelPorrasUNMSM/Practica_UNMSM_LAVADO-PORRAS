import kotlin.math.sqrt
fun main() {
    println("Cálculo de la serie: 1 - 1/√3 + 1/√5 - 1/√7 + ...")
    println()
    print("¿Cuántos términos de la serie quiere calcular? ")
    val n = readLine()?.toIntOrNull() ?: 1
    var suma = 0.0
    for (i in 1..n) {
        val denominador = 2 * i - 1  // 1, 3, 5, 7, 9, ...
        val termino: Double

        if (i == 1) {
            termino = 1.0
        } else if (i % 2 == 0) {
            termino = -1.0 / sqrt(denominador.toDouble())
        } else {
            termino = 1.0 / sqrt(denominador.toDouble())
        }
        suma += termino
    }
    println("Suma de los primeros $n términos = $suma")
}

