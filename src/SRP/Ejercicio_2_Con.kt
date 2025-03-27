package SRP

class Cliente(val nombre: String, val edad: Int)

class ClienteGuardar {
    fun guardarCliente(cliente: Cliente) {
        println("Guardando cliente en la base de datos: ${cliente.nombre}...")
    }
}

class ClienteCorreo {
    fun enviarCorreo(cliente: Cliente) {
        println("Enviando correo a ${cliente.nombre}...")
    }
}

fun main() {
    val cliente = Cliente("Carlos", 28)
    val guardar = ClienteGuardar()
    val enviar = ClienteCorreo()

    guardar.guardarCliente(cliente)
    enviar.enviarCorreo(cliente)
}