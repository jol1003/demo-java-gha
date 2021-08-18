package pe.farmaciasperuanas.fpsappwsaltacliente.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.base.AuditingEntity;

@Entity
public class Cliente extends AuditingEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
    private String nombre;

    private String apellido;
	
    private Integer edad;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
	
	public Cliente() {
	}
	
	private Cliente(String nombre, String apellido, Integer edad, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public static Cliente of(String nombre, String apellido, Integer edad, Date fechaNacimiento) {
		return new Cliente( nombre, apellido, edad, fechaNacimiento);
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
