package lambdas;

public class ConfigAnalizador {
    // Método que muestra los resultados de análisis de las cadenas en el arrayDeStrings
    // utilizando el analizador proporcionado.
public void mostrarResultados(String[] arrayDeStrings, String cadenaABuscar, StringAnalyzer analizador) {
        // Itera a través de cada elemento en el arrayDeStrings.
        for (String elemento : arrayDeStrings) {
            // Comprueba si el analizador considera que la cadena contiene cadenaABuscar.
            if (analizador.analizar(elemento, cadenaABuscar)) {
                // Si es así, imprime la cadena.
                System.out.println("Encontrado " + elemento);
            }
        }
    }
}

