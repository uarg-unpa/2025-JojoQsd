public class temaMusical {
    String Interprete, genero, nombre;
    int año;
    
    public temaMusical (String nombre, String Interprete, String genero, int año){
        this.nombre = nombre;
        this.Interprete= Interprete;
        this.genero= genero;
        this.año= año;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }


    public void setInterprete(String Interprete){
        this.Interprete = Interprete;
    }
    public String getInterprete(){
        return this.Interprete;
    }


    public void setgenero(String genero){
        this.genero= genero;
    }
    public String getgenero(){
        return this.genero;
    }


    public void setaño(int año){
        this.año = año;
    }
    public int getaño(){
        return this.año;
    }

    public String toString(){
        return  "Ahora reproduciendo: " + this.nombre + "[Autor: " + this.Interprete + "]" +  "[" + this.genero + "]" +  "[" + this.año + "].";
    }
}
