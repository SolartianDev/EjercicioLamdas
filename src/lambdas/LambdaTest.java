package lambdas;

public class LambdaTest {
    public static void main(String[] args) {
        // Un array de strings para realizar búsquedas.
        String[] arrayDeStrings = 
        {"hola","clase anonima","objeto","java","mundo","es verdad"};

        // Se crea una instancia de ConfigAnalizador para usar sus métodos.
        ConfigAnalizador configString = new ConfigAnalizador();
        // La cadena que se va a buscar en el array de strings.
        String cadenaABuscar = "java";
        
        // Imprime el valor que se va a buscar.
        System.out.println("El valor a buscar es: " + cadenaABuscar);
        System.out.println();
        
        // Realiza una búsqueda y muestra los resultados usando la expresión lambda.
        System.out.println("==Contiene==");
        // Expresión lambda que verifica si el string (a) contiene la cadena a buscar (c).
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (a,c)-> a.contains(c));
        System.out.println();
        
        // Realiza una búsqueda y muestra los resultados usando la expresión lambda.
        System.out.println("==Inicia con==");
        // Expresión lambda que verifica si el string (a) comienza con la cadena a buscar (c).
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (a,c)-> a.startsWith(c));
        System.out.println();
        
        // Realiza una búsqueda y muestra los resultados usando la expresión lambda.
        System.out.println("==Igual==");
        // Expresión lambda que verifica si el string (a) es igual a la cadena a buscar (c).
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (a,c)-> a.equals(c));
        System.out.println();
        
        // Realiza una búsqueda y muestra los resultados usando la expresión lambda.
        System.out.println("==Finaliza con==");
        // Expresión lambda que verifica si el string (a) termina con la cadena a buscar (c).
        configString.mostrarResultados(arrayDeStrings, cadenaABuscar, 
                (a,c)-> a.endsWith(c));
        System.out.println();
    }
}
