package Clases;
import java.util.ArrayList;
public class MonedasArray {
	public static String tipoMoneda;
	public static String tipoConvTemp;
	public static ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
	static {
		listaMonedas.add(new Moneda("Dolar a Peso", 20.0, "$", "Pesos Colombianos"));
		listaMonedas.add(new Moneda("Dolar a Euro", 0.85, "€", "Euros"));
		listaMonedas.add(new Moneda("Dolar a Libras", 0.72, "£", "Libras"));
		listaMonedas.add(new Moneda("Dolar a Yen", 109.15, "¥", "Yenes"));
		listaMonedas.add(new Moneda("Dolar a Won Coreano", 1176.71, "₩", "Wons Coreanos"));
		listaMonedas.add(new Moneda("Peso a Dolar", 0.05, "$", "Dolares"));
		listaMonedas.add(new Moneda("Euro a Dolar", 1.18, "$", "Dolares"));
		listaMonedas.add(new Moneda("Libras a Dolar", 1.38, "$", "Dolares"));
		listaMonedas.add(new Moneda("Yen a Dolar", 0.0091, "$", "Dolares"));
		listaMonedas.add(new Moneda("Won Coreano a Dolar", 0.00085, "$", "Dolares"));
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

	public static String getTipoConversion() {
		return tipoConvTemp;
	}

	public static void setTipoConversion(String tipoConversion) {
		tipoConvTemp = tipoConversion;
	}

	public static String getTipoMoneda() {
		return tipoMoneda;
	}

	

}
