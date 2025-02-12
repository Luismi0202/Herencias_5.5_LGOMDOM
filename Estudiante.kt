class Estudiante(
    id: String,
    nombre: String,
    val carrera: String

) : Usuario(id, nombre){
    override fun tomarPrestado(libro: Libro){
        println("Puedes tomarlo prestado por un tiempo amigo...")
    }
}