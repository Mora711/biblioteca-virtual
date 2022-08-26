import java.sql.SQLOutput;
import java.util.List;

public class Titulo{
    /*variables globales usadas en todo el ambito de la clase de nuestra clase titulo*/
    public String titulo;
    public String edicion;
    public String isbn ;
    List<Autor>autores;
    List<Categoria>categorias;

    //metodo de contructor , el cual puede ser opcional
    public Titulo () {
        System.out.println("El objeto titulo se creo");
    }

    public Titulo (String titulo, String edicion) {
        this.titulo = titulo;
        this.edicion = edicion;
    }
    /*Sobre carga de metodos -> cuando tenemos dos metodos del mismo nombre, en este caso construccion*/
}
