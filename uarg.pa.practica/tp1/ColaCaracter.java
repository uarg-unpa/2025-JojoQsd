public class ColaCaracter {
   private final int maxcola=5;
   private int elementos[];
   private int ultimo;
   
   public ColaCaracter() {
      elementos=new int[maxcola];
      ultimo = -1;   
   }
   
   public boolean estaVacia() {
      return (ultimo==-1);
   }
   
   public boolean estaLlena() {
      return (ultimo==maxcola-1);
   }
   
   public void insertar(int elem) {      
      if (!this.estaLlena()){
         ultimo++;
         elementos[ultimo]=elem;         
      }
   }
   
   public int borrar() {
      int aux=elementos[0];
      for (int i=0; i<ultimo; i++) 
         elementos[i] = elementos[i+1];
      ultimo--;     
      return aux;
   }

   public ColaCaracter menorCaracter(char caracter, pilaChar pila){
      pilaChar pilaaux = new pilaChar();
      ColaCaracter nuevaCola = new ColaCaracter();
      while(!pila.estaVacia()){
         pila.sacar();
         if (pila.aux > caracter){
            nuevaCola.insertar(caracter);
         }
         pilaaux.meter(pila.aux);
      }
      while(!pilaaux.estaVacia()){
         pilaaux.sacar();
         pila.meter(pilaaux.aux);
      }
      return nuevaCola;
   }
}
