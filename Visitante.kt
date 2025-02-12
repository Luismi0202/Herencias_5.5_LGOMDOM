class Visitante(
    id: String,
    nombre: String
):Usuario(id,nombre){
    override fun tomarPrestado(libro: Libro) {
        println("¡No puedes tomar prestado ese libro!")
    }
}