//David Leitón Salas

package PaqueteA;

public class Pet {
    
//Atributos:
    
String perro;
String gato;

//Constructor

public Pet(){
    perro = "";
    gato = "";
}

public Pet(String Perro, String Gato){
    perro = Perro;
    gato = Gato;
}

//Propiedades:

public String getPerro(){
    return perro;
}

public void setPerro(String Perro){
     perro = Perro;
}

public String getGato(){
    return gato;
}

public void setGato(String Gato){
    gato = Gato;
}


}

