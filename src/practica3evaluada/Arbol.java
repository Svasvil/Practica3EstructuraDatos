
package practica3evaluada;
public class Arbol {
       private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }
    public void insertar(int valor, char categoria, String nombreCompleto) {
        raiz = insertarRecursivo(raiz, valor, categoria, nombreCompleto);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor, char categoria, String nombreCompleto) {
        if (actual == null) {
            return new Nodo(valor, categoria, nombreCompleto);
        }

        if (valor < actual.getValor()) {
            actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), valor, categoria, nombreCompleto));
        } else if (valor > actual.getValor()) {
            actual.setDerecho(insertarRecursivo(actual.getDerecho(), valor, categoria, nombreCompleto));
        }

        return actual;
    }
    public void imprimirMayor() {
        Nodo mayor = obtenerMayor(raiz);
        if (mayor != null) {
            System.out.println("Mayor: " + mayor.getNombreCompleto() + " con valor " + mayor.getValor());
        }
    }

    private Nodo obtenerMayor(Nodo actual) {
        if (actual == null) {
            return null;
        }

        while (actual.getDerecho() != null) {
            actual = actual.getDerecho();
        }
        return actual;
    }
    public void imprimirMenor() {
        Nodo menor = obtenerMenor(raiz);
        if (menor != null) {
            System.out.println("Menor: " + menor.getNombreCompleto() + " con valor " + menor.getValor());
        }
    }

    private Nodo obtenerMenor(Nodo actual) {
        if (actual == null) {
            return null;
        }

        while (actual.getIzquierdo() != null) {
            actual = actual.getIzquierdo();
        }
        return actual;
    }
    public void imprimirNombresConVocal() {
        imprimirNombresConVocalRecursivo(raiz);
    }

    private void imprimirNombresConVocalRecursivo(Nodo actual) {
        if (actual != null) {
            if (actual.getNombreCompleto().matches("^[AEIOU].*")) {
                System.out.println(actual.getNombreCompleto());
            }
            imprimirNombresConVocalRecursivo(actual.getIzquierdo());
            imprimirNombresConVocalRecursivo(actual.getDerecho());
        }
    }
    public void imprimirPorCategoria(char categoria) {
        imprimirPorCategoriaRecursivo(raiz, categoria);
    }

    private void imprimirPorCategoriaRecursivo(Nodo actual, char categoria) {
        if (actual != null) {
            if (actual.getCategoria() == categoria) {
                System.out.println(actual.getNombreCompleto() + " pertenece a la categoria " + categoria);
            }
            imprimirPorCategoriaRecursivo(actual.getIzquierdo(), categoria);
            imprimirPorCategoriaRecursivo(actual.getDerecho(), categoria);
        }
    }
    
}
