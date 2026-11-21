fun main() {
    val nombre: String = "Otto"
    var edad: Int = 20

    val correo: String = "27072@virtual.utsc.edu.mx"
    var cuentaActiva: Boolean = true
    val satisfaccion: Double = 9.5

    println("INFORMACION DEL USUARIO")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Correo: $correo")
    println("Cuenta activa: $cuentaActiva")
    println("Satisfaccion: $satisfaccion")

    edad = 21
    cuentaActiva = false

    println("\nINFORMACION ACTUALIZADA")
    println("Nueva edad: $edad")
    println("Cuenta activa: $cuentaActiva")
}
