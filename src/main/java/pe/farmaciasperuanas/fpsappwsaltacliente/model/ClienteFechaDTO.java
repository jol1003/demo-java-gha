package pe.farmaciasperuanas.fpsappwsaltacliente.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClienteFechaDTO {

	private String nombre;
    private String apellido;
    private Integer edad;
    @JsonFormat(pattern="dd/MM/yyyy", timezone="EST")
    private Date fechaNacimiento;
    @JsonFormat(pattern="dd/MM/yyyy", timezone="EST")
    private Date fechaProbable;
    
	public ClienteFechaDTO(String nombre, String apellido, Integer edad, Date fechaNacimiento, Date fechaProbable) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaProbable = fechaProbable;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaProbable() {
		return fechaProbable;
	}
	public void setFechaProbable(Date fechaProbable) {
		this.fechaProbable = fechaProbable;
	}
    
	
    
	
}
