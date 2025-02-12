
fun main(){
    val libro = Libro("ArchivoDeLasTormetas","BrandonSanderson",2014)
    /*val usuario = Usuario("jtdsg")*/ //NO SE PUEDE PORQUE ESTA SEALED

    val visitante = Visitante("4343","Juan")
    visitante.tomarPrestado(libro)

    val profesor = Profesor("94343","Paco","Mates")
    profesor.tomarPrestado(libro)

    val estudiante = Estudiante("483853","Julio","Biologia")
    estudiante.tomarPrestado(libro)
}