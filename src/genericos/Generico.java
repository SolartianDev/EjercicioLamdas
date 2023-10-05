package genericos;

import java.util.List;

/**
 *
 * @author RYZEN
 */
public class Generico <Tipo extends Number,Tipo2 extends String> {
    
    private Tipo precio;
    private Tipo2 nombre;

    public Generico(Tipo precio, Tipo2 nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    
 
    //<Wrapper> void return 
    public Tipo metodoConGenericos(Tipo numero){
        Tipo suma= numero;
        return suma;
    }



    public void listas(List<? extends Number> lista){
        
    }

    public Tipo getPrecio() {
        return precio;
    }

    public Tipo2 getNombre() {
        return nombre;
    }
    
    
}