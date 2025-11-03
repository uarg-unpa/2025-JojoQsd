public class pruebapila {
    public final int maxpila=10;
    public int[] elementos;
    public int cima;
    public int contOcurr;
    public int aux;

    public pruebapila() {
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia(){
        return (cima<0);
    }

    public boolean estaLlena(){
        return (cima == maxpila-1);
    }

    public void meter(int e){
        cima = cima+1;
        elementos[cima]=e;
    }

    public int sacar(){
        aux=elementos[cima];
        cima=cima -1;
        return aux;
    }

    public int cantOcurrencias(int ele){
        contOcurr = 0;
        pruebapila pilaAux = new pruebapila();
            for (int i = 0; i < cima; i++) {
        sacar();
        if (aux == ele) {
            contOcurr ++;
        }
        pilaAux.meter(aux);
    }
    while(!pilaAux.estaVacia()){
        meter(pilaAux.sacar());
    }

        return contOcurr;
    }

    public int suprEle(int ele){
        int contMov = 0;
        pruebapila pilaAux = new pruebapila();
        while (!estaVacia()){
            sacar();
            if (aux != ele){
            pilaAux.meter(aux);
            contMov ++;
            }
            else {
                return contMov;
            }
        }
        while(!pilaAux.estaVacia()){
           meter(pilaAux.sacar());
    }
    return contMov;
}
}
