//Andrés Villalobos
//4-3-22
package PaqueteA;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola a todos!");

        Pet mascota = new Pet();
        
        Vehiculo elVehiculo = new Vehiculo();
        
         //Probando el objeto de la clase Vehiculo
        elVehiculo.setPuertas(5);
        int lasPuertas = elVehiculo.getPuertas();
        System.out.println("Hay estas puertas: "+lasPuertas);
        
        //Probando el objeto de la clase Pet
        String gatoName= "pusungo";
        mascota.setGato(gatoName);        
        System.out.println("Este es el nuevo nombre: " + gatoName);
    }

}
