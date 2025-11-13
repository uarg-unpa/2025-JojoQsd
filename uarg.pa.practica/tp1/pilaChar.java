public class pilaChar {
    final int maxpila = 20;
    char[] palabra;
    int cima;
    char aux;

    public void PilaChar() {
        palabra = new char[maxpila];
        cima = -1;
    }

    public boolean estaVacia(){
        return (cima == -1);
    }

    public boolean estaLlena(){
        return (cima == maxpila);
    }

    public void meter(char l){
        cima = cima +1;
        palabra[cima] = l;
    }

    public void sacar(){
        aux = palabra[cima];
        cima = cima-1;
    }


}