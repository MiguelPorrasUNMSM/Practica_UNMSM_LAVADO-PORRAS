fun main() {
    var mejorPromedio = 0.0
    var nombreMejorAlumno = ""
    var suspendidos = 0
    println("Ejercicio 1")
    println()
    for (i in 1..20) {
        println("ALUMNO $i")
        print("Nombre: ")
        val nombre = readLine() ?: "Alumno $i"
        var nota1: Double
        do {
            print("Nota 1: ")
            nota1 = readLine()?.toDoubleOrNull() ?: -1.0
        } while (nota1 < 0 || nota1 > 20)
        var nota2: Double
        do {
            print("Nota 2: ")
            nota2 = readLine()?.toDoubleOrNull() ?: -1.0
        } while (nota2 < 0 || nota2 > 20)
        var nota3: Double
        do {
            print("Nota 3: ")
            nota3 = readLine()?.toDoubleOrNull() ?: -1.0
        } while (nota3 < 0 || nota3 > 20)
        val promedio = (nota1 + nota2 + nota3) / 3
        println("Promedio: $promedio")
        if (promedio > mejorPromedio) {
            mejorPromedio = promedio
            nombreMejorAlumno = nombre
        }
        if (promedio < 12) {
            suspendidos++
            println("SUSPENDIDO")
        } else {
            println("APROBADO")
        }
        println("---")
    }

    println("RESULTADOS:")
    println("Mejor alumno: $nombreMejorAlumno")
    println("Mejor promedio: $mejorPromedio")
    println("Suspendidos: $suspendidos")
}