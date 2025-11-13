public class pila {
    public int[] elementos; // Array para almacenar los elementos
    public int cima = -1;  
    public int elem;     
    public final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public pila() {
        elementos = new int[MAX]; // Crear el array
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return (cima < 0);
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return (cima == MAX);
        }

    // Agrega un elemento en la cima (push)
    public void meter() {
        cima++;
        this.elementos[cima] = elem;
    }
    public int sacar(){
        return this.elementos[cima];
    }
}

