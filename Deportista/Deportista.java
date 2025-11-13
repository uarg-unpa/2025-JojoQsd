public class Deportista{
    private String nombre;
    private int edad;
    public String deporte;
    public int puntos;

    public Deportista(String nombre, int edad, String deporte, int puntos){
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.puntos = puntos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setDeporte(String deporte){
        this.deporte = deporte;
    }
    public String getDeporte(){
        return this.deporte;
    }

    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    public int getPuntos(){
        return this.puntos;
    }

    public boolean esMasExperimentado(Deportista deportistaOtro){
        return (this.puntos > deportistaOtro.puntos);

    }

    public boolean esMayordeEdad(){
        return (this.edad>=18);
    }

    public String toString(){
        return "Deportista: " + this.nombre + ". Edad: " + this.edad + ". Deporte: " + this.deporte + " . Puntos: " + this.puntos + ".";
    }
}
