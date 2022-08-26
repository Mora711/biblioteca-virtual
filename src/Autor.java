import java.util.List;
public class Autor {
    // variables globales
    String nombre;
    String primerApellido;
    String segundoapellido;
    List<Titulo>titulos;


    //sobrecargarmos los metodos constructores
    public Autor (){
        // este se genera por defecto (opcional)
    }
    public Autor(String nombre, String primerApellido){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        //primera sobrecarga
    }
    public Autor(String nombre,String primerApellido, String segundoapellido){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoapellido = segundoapellido;
        //segunda sobrecarga
    }
}
