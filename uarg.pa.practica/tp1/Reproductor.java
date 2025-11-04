public class Reproductor {
    public final int maxCola = 50;
    public temaMusical[] listaReproduccion;
    public int frente;
    public int fin;
    public temaMusical aux;

     public Reproductor() {
        listaReproduccion = new temaMusical[maxCola];
        frente = 0;
        fin = -1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    public boolean estaLlena() {
        return fin == maxCola - 1;
    }

    public void agregar(temaMusical cancion) {
            fin++;
            listaReproduccion[fin] = cancion;
    }

    public temaMusical reproducirSig() {
            aux = listaReproduccion[frente];
            frente++;
            return aux;
    }

}
