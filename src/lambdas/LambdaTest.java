
package lambdas;

public class LambdaTest {
    public static void main(String[] args) {
        String[] arrayDeStrings = 
        {"clase","objeto","clase anidada","clase anonima","herecia","hola","mundo"};
        
        ConfigAnalizador configString = new ConfigAnalizador();
        String cadenaABuscar ="objeto";
        
        System.out.println("Buscando la cadena: "+ cadenaABuscar);
        System.out.println();
        
        
        System.out.println("==Contiene==");
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (s,p)-> s.contains(p));
        System.out.println();
        
        
        System.out.println("==Inicia con==");
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (s,p)-> s.startsWith(p));
        System.out.println();
        
        System.out.println("==Igual==");
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (s,p)-> s.equals(p));
        System.out.println();
        
        System.out.println("==Finaliza con==");
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (s,p)-> s.endsWith(p));
        System.out.println();
        
        System.out.println();
        
       
        
        
    }
}
