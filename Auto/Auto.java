public class Auto {
    public String marca;
    public String modelo;
    public int año;
    public int velocidadMax;

    public Auto(String marca, String modelo, int año, int velocidadMax){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMax = velocidadMax;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setAño(int año){
        this.año = año;
    }
    public int getAño(){
        return this.año;
    }

    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax=velocidadMax;
    }
    public int getVelocidadMax(){
        return this.velocidadMax;
    }

    public boolean esMasRapidoQue(Auto otro){
        return (this.getVelocidadMax()>otro.getVelocidadMax());
    }

    public boolean esAutoClasico(){
        if (año<2000){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString(){
        return "Auto: "+this.marca + ", " + this.modelo + "Año: " + this.año + "Velocidad maxima: " + this.velocidadMax + "Km/h.";
    }

    
}
