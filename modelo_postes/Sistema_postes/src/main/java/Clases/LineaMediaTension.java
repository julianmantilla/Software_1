/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clases;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */
public class LineaMediaTension extends Componente {
    private Componente componente;
    
    public LineaMediaTension(Componente componente) {
        this.componente = componente;
    }

    public LineaMediaTension(Componente componente, String nombre) {
        super(nombre);
        this.componente = componente;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Transformador{" + "componente=" + componente + '}';
    }
}