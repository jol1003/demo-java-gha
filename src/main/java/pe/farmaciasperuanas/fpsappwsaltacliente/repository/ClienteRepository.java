package pe.farmaciasperuanas.fpsappwsaltacliente.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;

import java.util.Date;
import java.util.List;


@Repository("clienteRepository")
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
    public Cliente findByNombre(String nombre);
    
    public List<Cliente> findAll();

    /*
    public abstract Cliente findByNombres(String nombres);

    @Query(value="SELECT * FROM cliente where fecha_registro between :fecha_inicio and :fecha_final", nativeQuery=true)
    public abstract List<Cliente> findByAll_Fecha(@Param("fecha_inicio") Date fecha_inicio,@Param("fecha_final") Date fecha_final);

    @Query(value= "SELECT * FROM cliente WHERE id_proveedor = :id_proveedor and fecha_registro between :fecha_inicio and :fecha_final GROUP BY comprobante ORDER BY id;", nativeQuery=true)
    public abstract List<Cliente> findById_proveedor(@Param("id_proveedor") int id_proveedor, @Param("fecha_inicio") Date fecha_inicio,@Param("fecha_final") Date fecha_final);

    @Query(value= "select * from cliente where id_empresa= :id_empresa and fecha_registro between :fecha_inicio and :fecha_final", nativeQuery=true)
    public abstract List<Cliente> findById_empresa(@Param("id_empresa") int id_empresa, @Param("fecha_inicio") Date fecha_inicio,@Param("fecha_final") Date fecha_final);*/
}
