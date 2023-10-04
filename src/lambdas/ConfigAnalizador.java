
package lambdas;

public class ConfigAnalizador {
    public void mostrarResultados (String[] arrayDeStrings, String cadenaABuscar, StringAnalyzer analizador){
        for(String elemento: arrayDeStrings){
            if(analizador.analizar(elemento, cadenaABuscar)){
                System.out.println( elemento);
            }
        }
    }
}
