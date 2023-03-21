package Clases;
import java.util.ArrayList;
public class TemperaturasArray {
	public static String tipoMoneda;
	public static String tipoConvTemp;
	
	public static ArrayList<Temperaturas> ListaTemp = new ArrayList<Temperaturas>();

    static {
    	ListaTemp.add(new Temperaturas("Celsius a Fahrenheit", "°F", "Fahrenheit"));
    	ListaTemp.add(new Temperaturas("Celsius a Kelvin", "K", "Kelvin"));
    	ListaTemp.add(new Temperaturas("Fahrenheit a Celcius", "°C", "Celsius"));
    	ListaTemp.add(new Temperaturas("Fahrenheit a Kelvin", "K", "Kelvin"));
    	ListaTemp.add(new Temperaturas("Kelvin a Celsius", "°C", "Celsius"));
    	ListaTemp.add(new Temperaturas("Kelvin a Fahrenheit", "°F", "Fahrenheit"));       
    }   
	public static String getTipoConversion() {
		return tipoConvTemp;
	}
	public static void setTipoConversion(String tipoConversion) {
		tipoConvTemp = tipoConversion;
	}
    public static class Temperaturas {
       
		private String TipoConver;      
        private String simbolo;
        private String nombre;  
        public Temperaturas(String tipo,  String simbolo, String nombre) {
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
