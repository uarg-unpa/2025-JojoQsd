public class Domicilio {
    
    String Calle;
    int Altura;

    public Domicilio(String Calle, int Altura){
        this.Calle = Calle;
        this.Altura = Altura;
    }

    public void setCalle(String Calle){
        this.Calle = Calle;
    }

    public String getCalle(){
        return this.Calle;
    }

    public void setAltura(int Altura){
        this.Altura = Altura;
    }
    public int getAltura(){
        return this.Altura;
    }

    public String toString(){
        return "[" + this.Calle + "]" + "[" + this.Altura + "]" ;
    }


}
