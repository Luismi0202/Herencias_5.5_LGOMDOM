
fun tomarPrestadoLibro(usuario:Usuario,libro: Libro){
    when(usuario){
        is Estudiante -> println("No puedes tomar prestado el libro")
        is Profesor -> println("Puedes tomar el libro todo el tiempo que quieras")
        is Visitante -> println("No puedes tomar prestado un libro")
    }
}


fun main(){
    val libro = Libro("ArchivoDeLasTormetas","BrandonSanderson",2014)
    /*val usuario = Usuario("jtdsg")*/ //NO SE PUEDE PORQUE ESTA SEALED

    val visitante = Visitante("4343","Juan")
    tomarPrestadoLibro(visitante,libro)

    val profesor = Profesor("94343","Paco","Mates")
    tomarPrestadoLibro(profesor,libro)

    val estudiante = Estudiante("483853","Julio","Biologia")
    tomarPrestadoLibro(estudiante,libro)
}