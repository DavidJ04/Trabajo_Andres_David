//Andrés Villalobos
//4-3-22
package PaqueteA;

public class Vehiculo {
    // Atributos 

    private int puertas;
    private int anio;

    // Propiedades
    public int getPuertas() {
        return puertas;
    }

    public int getAnio() {
        return anio;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Constructor
    public Vehiculo() {
        puertas = 0;
        anio = 0;
    }

    public Vehiculo(int puertas, int anio) {
        this.puertas = puertas;
        this.anio = anio;
    }
}
