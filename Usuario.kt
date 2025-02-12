sealed class Usuario(
    val id: String,
    val nombre: String
) {
    open fun tomarPrestado(libro: Libro){
        println("Desconocido...")
    }
}