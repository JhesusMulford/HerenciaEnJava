/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

/**
 *
 * @author RYZEN
 */
public class Avion {

    private int numeroAlas;
    private String marca;
    private String modelo;
    private int numeroDeMotores;
    private int capacidadDePasajeros;

    public Avion(int numeroAlas, String marca, String modelo, int numeroDeMotores, int capacidadDePasajeros) {
        this.numeroAlas = numeroAlas;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeMotores = numeroDeMotores;
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroDeMotores() {
        return numeroDeMotores;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

   

    public class AvionComercial extends Avion {

        int pilotos;

        public AvionComercial(int numeroAlas, String marca, String modelo, int numeroDeMotores, int capacidadDePasajeros, int pilotos) {

            super(numeroAlas, marca, modelo, numeroDeMotores, capacidadDePasajeros);
            this.pilotos = pilotos;
        }

        public void MostrarDatos() {
            System.out.println("\n" + "\nNumero de alas: " + getNumeroAlas()
                    + "\nMarca: " + getMarca()
                    + "\nModelo: " + getModelo()
                    + "\nNumero de motores: " + getNumeroDeMotores()
                    + "\nCapacidad de pasajeros: " + getCapacidadDePasajeros()
                    + "\nPilotos: " + pilotos);
        }
    }
//------------------------------------------------------------------------------------------------------------------------------------------------

    public static void Mostrar() {
        Cachorro cachorro = new Cachorro("Canino", "Marrón", "Rocky", 1, "Bulldog", "Corto");
        System.out.println("\n" + "\n" + "Especie: " + cachorro.getEspecie()
                + "\nColor: " + cachorro.getColor()
                + "\nNombre: " + cachorro.getNombre()
                + "\nEdad: " + cachorro.getEdad()
                + "\nRaza: " + cachorro.getRaza()
                + "\nPelaje: " + cachorro.getPelaje());
        cachorro.ladrar();
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo de herencia simple: "
                + "\nherencia se encuentra en la definición de la clase interna \"AvionComercial\", que extiende la clase \"Avion\". Al heredar de la clase \"Avion\", la clase \"AvionComercial\" \n"
                + "puede acceder a los miembros públicos y protegidos de la clase \"Avion\", como los métodos\n"
                + " \"getNumeroAlas()\", \"getMarca()\", \"getModelo()\", \"getNumeroDeMotores()\", \"getCapacidadDePasajeros()\", y\n"
                + " utilizarlos en su propia implementación.");

        Avion avion = new Avion(2, "Boeing", "747", 4, 416);
        AvionComercial avionComercial = avion.new AvionComercial(2, "Boeing", "747", 4, 416, 2);
        avionComercial.MostrarDatos();
        
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\n" + "Ejemplo de herencia multinivel: "
                + "se muestra a través de la clase Animal, que es la superclase de Mascota, Perro y Cachorro. \n"
                + "Esto significa que las subclases heredan los campos y métodos de la superclase Animal. \n"
                + "Por ejemplo, la clase Mascota hereda los campos \"especie\" y \"color\" de la clase Animal, y la \n"
                + "clase Perro hereda los campos de Animal y Mascota.");
        Mostrar();
        
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\nEjemplo de herencia multiple: "
                + "En este ejemplo, la clase Animall es la clase base y tiene un método comer(). \n"
                + "La clase viviparoo hereda de Animall y tiene un método darALuz().\n"
                + "La clase oviparo hereda de viviparo y tiene un método ponerHuevo().\n"
                + "De esta manera, Oviparo hereda las propiedades y métodos de ambas clases, Animall y Viviparo.");
        
        Animall mostrar = new Animall("\nEl animal come","El animal es viviparo y da a luz","El animal pone huevos y es oviparo");
        mostrar.MostrarDos();

        

    }
}
