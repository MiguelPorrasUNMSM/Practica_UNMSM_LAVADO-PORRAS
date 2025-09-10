fun main() {
    val distanciaInicial = 400
    val velocidadA = 80   // km/h
    val velocidadB = 70   // km/h

    var distancia = distanciaInicial.toDouble()
    var horas = 0
    var minutos = 0

    // simulamos minuto a minuto hasta que la distancia sea 0 o negativa
    while (distancia > 0) {
        distancia -= (velocidadA + velocidadB) / 60.0  // avance conjunto en 1 minuto
        minutos++
        if (minutos == 60) {
            horas++
            minutos = 0
        }
    }

    println("Los trenes se encontrarán en $horas horas y $minutos minutos.")
}
