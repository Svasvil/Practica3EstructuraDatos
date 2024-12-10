package practica3evaluada;
public class Practica3Evaluada {
    public static void main(String[] args) {
           Arbol arbol = new Arbol();
        arbol.insertar(50, 'A', "Sebastian");
        arbol.insertar(30, 'B', "Ariel ");
        arbol.insertar(70, 'C', "Valeriar");
        arbol.insertar(20, 'A', "Ricardo");
        arbol.insertar(40, 'B', "Lorena");
        arbol.imprimirMayor();
        arbol.imprimirMenor();
        System.out.println("nombres que comienzan con vocal");
        arbol.imprimirNombresConVocal();
        System.out.println("categoria a:");
        arbol.imprimirPorCategoria('A');
      
    }
    
}
