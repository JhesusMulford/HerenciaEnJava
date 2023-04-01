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
class Animal {

    private String especie;
    private String color;

    public Animal(String especie, String color) {
        this.especie = especie;
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }
}

class Mascota extends Animal {

    private String nombre;
    private int edad;

    public Mascota(String especie, String color, String nombre, int edad) {
        super(especie, color);
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }                                                                           //EJEMPLO DE HERENCIA MULTINIVEL

    public int getEdad() {
        return edad;
    }
}

class Perro extends Mascota {

    private String raza;

    public Perro(String especie, String color, String nombre, int edad, String raza) {
        super(especie, color, nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }
}

class Cachorro extends Perro {

    private String pelaje;

    public Cachorro(String especie, String color, String nombre, int edad, String raza, String pelaje) {
        super(especie, color, nombre, edad, raza);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }
}
