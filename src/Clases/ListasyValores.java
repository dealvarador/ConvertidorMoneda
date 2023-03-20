package Clases;
import java.util.ArrayList;
public class ListasyValores {
	
	public static ArrayList<Moneda> lista = new ArrayList<Moneda>();

    static {
        lista.add(new Moneda("Dolar a Peso", 20.0, "$","Pesos Colombianos"));
        lista.add(new Moneda("Dolar a Euro", 0.85,"€", "Euros"));
        lista.add(new Moneda("Dolar a Libras", 0.72, "£","Libras"));
        lista.add(new Moneda("Dolar a Yen", 109.15,"¥","Yenes"));
        lista.add(new Moneda("Dolar a Won Coreano", 1176.71,"₩","Wons Coreanos"));
        lista.add(new Moneda("Peso a Dolar", 0.05,"$","Dolares"));
        lista.add(new Moneda("Euro a Dolar", 1.18,"$","Dolares"));
        lista.add(new Moneda("Libras a Dolar", 1.38,"$","Dolares"));
        lista.add(new Moneda("Yen a Dolar", 0.0091,"$","Dolares"));
        lista.add(new Moneda("Won Coreano a Dolar", 0.00085,"$","Dolares"));
    }
   
	    

		public static void main(String[] args) {
			 
	        // imprimir la lista
	        for (Moneda elemento : lista) {
	            System.out.println(elemento.getTipo() + " - " + elemento.getNumero());
	        }
	    }

	    public static class Moneda {
	        private String tipoMoneda;
	        private double numero;
	        private String simbolo;
	        private String nombreMoneda;

	        public Moneda(String tipo, double numero, String simbolo, String nomMoneda) {
	            this.tipoMoneda = tipo;
	            this.numero = numero;
	            this.simbolo = simbolo;
	            this.nombreMoneda = nomMoneda;
	        }

	        public String getTipo() {
	            return tipoMoneda;
	        }

	        public double getNumero() {
	            return numero;
	        }
	        public String getSimbolo() {
	            return simbolo;
	        }
	        public String getNombreMoneda() {
	            return nombreMoneda;
	        }
	    }
	}


