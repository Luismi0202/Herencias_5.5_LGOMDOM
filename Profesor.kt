class Profesor(
    id: String,
    nombre: String,
    val departamento: String

): Usuario(id,nombre){
    override fun tomarPrestado(libro: Libro ) {
        println("Puedes tomarlo prestado el tiempo que quieras!")
    }
}