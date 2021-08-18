package pe.farmaciasperuanas.fpsappwsaltacliente.entity.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AuditingEntity implements BaseEntity {
	
    private Date fechaCreacion;

    @Column(name = "FechaCreacion")
    public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
