public class pruebapila {
    public final int maxpila=10;
    public int[] elementos;
    public int cima;
    public int contOcurr=0;

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
        int aux=elementos[cima];
        cima=cima -1;
        return aux;
    }

    public int cantOcurrencias(){
        contOcurr ++;
        return contOcurr;
    }
}
