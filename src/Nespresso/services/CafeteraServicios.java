/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nespresso.services;

import Nespresso.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class CafeteraServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera datos = new Cafetera();
    public void llenarCafetera(){
    datos.setCantidadActual(datos.getCapacidadMaxima());
    }
    public void servirTaza(int tamañoTaza){
    if (datos.getCantidadActual()>=tamañoTaza){
        System.out.println("Se lleno la taza");
    }else{
        System.out.println("La taza no se lleno. Se sirvio " + datos.getCantidadActual() + " de cafe");
    }
    }
    public void vaciarCafetera(){
    datos.setCantidadActual(0);
    }
    public void agregarCafe(int cantidadCafe){
    if (cantidadCafe+datos.getCantidadActual()<=datos.getCapacidadMaxima()){
        datos.setCantidadActual(cantidadCafe+datos.getCantidadActual());
    }else{
        System.out.println("Se lleno la cafetera pero sobró cafe");
        datos.setCantidadActual(datos.getCapacidadMaxima());
    }
    }
}
