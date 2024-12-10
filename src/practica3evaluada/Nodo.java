
package practica3evaluada;
public class Nodo {
    private int valor;
    private char categoria;
    private String nombreCompleto;
    private Nodo izquierdo;
    private Nodo derecho;
    
    public Nodo() {
    }
    public Nodo(int valor, char categoria, String nombreCompleto) {
        this.valor = valor;
        this.categoria = categoria;
        this.nombreCompleto = nombreCompleto;
        this.izquierdo = null;
        this.derecho = null;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}