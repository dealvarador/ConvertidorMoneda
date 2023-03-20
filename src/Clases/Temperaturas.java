package Clases;

import java.util.ArrayList;

import Clases.ListasyValores.Moneda;

public class Temperaturas {
	public static ArrayList<Temperatura> ListaTemp = new ArrayList<Temperatura>();

    static {
    	ListaTemp.add(new Temperatura("Celsius a Fahrenheit", "°F", "Fahrenheit"));
    	ListaTemp.add(new Temperatura("Celsius a Kelvin", "K", "Kelvin"));
    	ListaTemp.add(new Temperatura("Fahrenheit a Celcius", "°C", "Celsius"));
    	ListaTemp.add(new Temperatura("Fahrenheit a Kelvin", "K", "Kelvin"));
    	ListaTemp.add(new Temperatura("Kelvin a Celsius", "°C", "Celsius"));
    	ListaTemp.add(new Temperatura("Kelvin a Fahrenheit", "°F", "Fahrenheit"));
       
    }
    public static void main(String[] args) {
		 
        // imprimir la lista
        for (Temperatura elemento : ListaTemp) {
            System.out.println(elemento.getTipo() + " - " + elemento.getSimbolo() + " - " + elemento.getNombre());
        }
    }
    public static class Temperatura {
        private String TipoConver;      
        private String simbolo;
        private String nombre;
        

        public Temperatura(String tipo,  String simbolo, String nombre) {
            this.TipoConver = tipo;           
            this.simbolo = simbolo;     
            this.nombre = nombre;  
        }

        public String getTipo() {
            return TipoConver;
        }     
        public String getSimbolo() {
            return simbolo;
        }
        public String getNombre() {
            return nombre;
        }
        
    }
}
