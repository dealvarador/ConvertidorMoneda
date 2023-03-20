package Clases;
import Clases.ListasyValores.Moneda;



public class Conversiones{
	
double monedaEntra;
double monedaSale;
double tempEntra;
double tempSale;
double longitudEntra;
double longitudSale;
public static String simboloMoneda;
public static String NombreMoneda;
public static double valorMoneda;
public static String tipoMoneda;

public static String TipoConverTemp;
public static String getTipoConverTemp() {
	return TipoConverTemp;
}
public static void setTipoConverTemp(String tipoConverTemp) {
	TipoConverTemp = tipoConverTemp;
}
public static String getSimboloTemp() {
	return simboloTemp;
}
public static void setSimboloTemp(String simboloTemp) {
	Conversiones.simboloTemp = simboloTemp;
}
public static String getNombreTemp() {
	return nombreTemp;
}
public static void setNombreTemp(String nombreTemp) {
	Conversiones.nombreTemp = nombreTemp;
}
public static String simboloTemp;
public static String nombreTemp;




public static String getSimboloMoneda() {
	return simboloMoneda;
}
public static void setSimboloMoneda(String simboloMoneda) {
	Conversiones.simboloMoneda = simboloMoneda;
}
public static String getNombreMoneda() {
	return NombreMoneda;
}
public static String setNombreMoneda(String nombreMoneda) {
	return NombreMoneda = nombreMoneda;
}
public static double getValorMoneda() {
	return valorMoneda;
}
public static void setValorMoneda(double valorMoneda) {
	Conversiones.valorMoneda = valorMoneda;
}
public static String getTipoMoneda() {
	return tipoMoneda;
}
public static void setTipoMoneda(String tipoMoneda) {
	Conversiones.tipoMoneda = tipoMoneda;
}
public double getMonedaEntra() {
	return monedaEntra;
}
public void setMonedaEntra(double monedaEntra) {
	this.monedaEntra = monedaEntra;
}
public double getMonedaSale() {
	return monedaSale;
}
public void setMonedaSale(double monedaSale) {
	this.monedaSale = monedaSale;
}
public double getTempEntra() {
	return tempEntra;
}
public void setTempEntra(double tempEntra) {
	this.tempEntra = tempEntra;
}
public double getTempSale() {
	return tempSale;
}
public void setTempSale(double tempSale) {
	this.tempSale = tempSale;
}
public double getLongitudEntra() {
	return longitudEntra;
}
public void setLongitudEntra(double longitudEntra) {
	this.longitudEntra = longitudEntra;
}
public double getLongitudSale() {
	
	return longitudSale;
}
public void setLongitudSale(double longitudSale) {
	this.longitudSale = longitudSale;
}
public double ConvertirMoneda(double entrada, double comparador) throws ExcepcionError{
	if (entrada <= 0) {
		throw new ExcepcionError("Datos Inválidos");
	}
	return this.monedaSale = entrada * comparador;
	
}
public double ConvertirTemperatura(String TipoConvTemp, double entrada) throws ExcepcionError{
	switch (TipoConvTemp) {
	case "Celsius a Fahrenheit":
		return this.tempSale = (entrada * 9/5) + 32;		
	case "Celsius a Kelvin":
		return this.tempSale = entrada + 273.15;				
	case "Fahrenheit a Celcius":
		return this.tempSale = (entrada - 32) * 5/9;		
	case "Fahrenheit a Kelvin":
		return this.tempSale = (entrada - 32) * 5/9 + 273.15;		
	case "Kelvin a Celsius":
		return this.tempSale = entrada - 273.15;		
	case "Kelvin a Fahrenheit":
		return this.tempSale = (entrada - 273.15) * 9/5 + 32;		
	}
	return this.tempSale;	
	
}


}
