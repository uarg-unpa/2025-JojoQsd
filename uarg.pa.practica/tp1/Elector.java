public class Elector {
    String nombre;
    String Apellido;
    int Matricula;
    int Clase;
    String Domicilio;

    public Elector(String nombre, String Apellido, int Matricula, int Clase, String Domicilio){
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Matricula = Matricula;
        this.Clase = Clase;
        this.Domicilio = Domicilio;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }

     public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public String setApellido(){
        return this.Apellido;
    }

     public void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    public int  getMatricula(){
        return this.Matricula;
    }

     public void setClase(int Clase){
        this.Clase = Clase;
    }
    public int  getClase(){
        return this.Clase;
    }

     public void setDomicilio(String Domicilio){
        this.Domicilio = Domicilio;
    }
    public String getDomicilio(){
        return this.Domicilio;
    }

    public String toString(){
        return "["+ this.nombre + "]" +  "["+ this.Apellido + "]" + "["+ this.Matricula + "]" +  "["+ this.Clase + "]" + "["+ this.Domicilio + "]";
    }
}
