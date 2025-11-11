public class Empleado {
    private String nombre;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, int legajo, double sueldo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public int getLegajo(){
        return this.legajo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public double getSueldo(){
        return this.sueldo;
    }

    public boolean ganaMasQue(Empleado empAux){
        if (this.sueldo > empAux.sueldo){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Empleado: " + this.nombre + " N° Legajo: " + this.legajo + " Sueldo actual: " + this.sueldo;
    }
}

