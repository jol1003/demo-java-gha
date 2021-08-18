package pe.farmaciasperuanas.fpsappwsaltacliente.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static BigDecimal getDesviacionEstandar() {
		
		return null;
	}
	
	public static Date getFechaAproxMuerte(Date fechaNacimiento, int edad) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		String fechaNacimientoVAR= formatter.format(fechaNacimiento);
		int anio = Integer.parseInt(fechaNacimientoVAR.substring(fechaNacimientoVAR.length()-4));
		int cantanios = 87-edad;
		String aprox = String.valueOf(anio+cantanios);
		String nuevaFecha = fechaNacimientoVAR.substring(0, fechaNacimientoVAR.length()-4)+aprox;
		
		return formatter.parse(nuevaFecha);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
