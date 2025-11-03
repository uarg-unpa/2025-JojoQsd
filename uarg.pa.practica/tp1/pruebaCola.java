public class pruebaCola {
    public final int maxCola = 10;
    public int[] elementos;
    public int frente;
    public int fin;
    public int contOcurr = 0;
    public int aux;

    public pruebaCola() {
        elementos = new int[maxCola];
        frente = 0;
        fin = -1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    public boolean estaLlena() {
        return fin == maxCola - 1;
    }

    public void encolar(int e) {
            fin++;
            elementos[fin] = e;
    }

    public int desencolar() {
            aux = elementos[frente];
            frente++;
            return aux;
    }

    public int cantOcurrencias() {
        contOcurr++;
        return contOcurr;
    }

    public int promCola(){
        int pila = 0;
        int cont =0;
        pruebaCola colaAux = new pruebaCola();
        while (!estaVacia()) {
            desencolar();
            pila = pila + aux;
            cont ++;
            colaAux.encolar(aux);
        }
        while (!colaAux.estaVacia()){
            encolar(colaAux.desencolar());
        }
        int prom = (pila / cont);
        return prom;
    }
}

