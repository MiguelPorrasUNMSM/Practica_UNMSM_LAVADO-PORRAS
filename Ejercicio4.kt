fun main() {
    val distanciaA=80;
    val distanciaB=70;
    val distanciaEntreEllos=400;
    val velocidadRelativa=distanciaA+distanciaB;
    val tiempo = distanciaEntreEllos.toDouble() / velocidadRelativa
    val horas = tiempo.toInt()
    val minutos = Math.round((tiempo - horas) * 60).toInt()
    println("Los trenes se encontrarán en "+horas+" horas y "+minutos+" minutos.")
}