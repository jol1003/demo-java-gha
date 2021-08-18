package pe.farmaciasperuanas.fpsappwsaltacliente.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClienteDTO implements Serializable{
	
	private static final long serialVersionUID = -2535147420214960536L;
	
	private String nombre;
    private String apellido;
    private Integer edad;
    @JsonFormat(pattern="dd/MM/yyyy", timezone="EST")
    private Date fechaNacimiento;
    
    public ClienteDTO() {
	}
    
	public ClienteDTO(String nombre, String apellido, Integer edad, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
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
	
}
