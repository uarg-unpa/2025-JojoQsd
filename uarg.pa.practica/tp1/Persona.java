public class Persona {
    protected String apellido;
    protected int edad;
    protected int documento;
    protected char sexo;
    protected double peso;


public Persona(String ape,int ed, int dni , char sex, double pes){
    this.apellido = ape;
    this.edad = ed;
    this.documento = dni;
    this.sexo = sex;
    this.peso = pes;
}

public void setApellido(String a){
    this.apellido = a;
}

public String getApellido(){
    return this.apellido;
}

public void setEdad(int e){
    this.edad = e;
}
public int getEdad(){
    return this.edad;
}

public void setDocumento(int d){
    this.documento = d;
}
public int getDocumento(){
    return this.documento;
}

public void setSexo(char s){
    this.sexo = s;
}
public char getSexo(){
    return this.sexo;
}

public void setPeso(double p){
    this.peso = p;
}
public double getPeso(){
    return this.peso;
}

public boolean esMayorDeEdad(){
    if (this.edad > 18){
        System.out.println("Es mayor de edad.");
        return true;
    }
    else {
        System.out.println("Es menor de edad");
        return false;
    }
}
 public String toString(){
      return "[ "+ this.apellido+ " ] [ " +this.edad+ " ] [ "+this.documento+" ] [ "+this.sexo+" ] [ "+this.peso+" ] ";
}
}
