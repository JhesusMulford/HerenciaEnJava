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
class Animall {

    private String comer;
    private String darALuz;
    private String ponerHuevo;

    public Animall(String comer, String darALuz, String ponerHuevo) {
        this.comer = comer;
        this.darALuz = darALuz;
        this.ponerHuevo = ponerHuevo;
    }

    public String getComer() {
        return comer;
    }

    public String getDarALuz() {
        return darALuz;
    }

    public String getPonerHuevo() {
        return ponerHuevo;
    }

    class viviparo extends Animall {

        public viviparo(String comer, String darALuz, String ponerHuevo) {
            super(comer, darALuz, ponerHuevo);
        }
    }

    class Oviparo extends Animall {

        public Oviparo(String comer, String darALuz, String ponerHuevo) {
            super(comer, darALuz, ponerHuevo);
        }
    }
    public void MostrarDos(){
        System.out.println(getComer());
        System.out.println(getDarALuz());
        System.out.println(getPonerHuevo());
    }
}
