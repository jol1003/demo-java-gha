package pe.farmaciasperuanas.fpsappwsaltacliente;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;
import pe.farmaciasperuanas.fpsappwsaltacliente.repository.ClienteRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FpsAppWsAltaclienteApplicationTests {

	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Test
    public void contextLoads() throws Exception {
    	
    }
	
    @Test
    public void findByName() throws ParseException {
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = "24/11/2002";
    	
        // given
        Date date = formatter.parse(fechaNacimiento);
        Cliente cliente = Cliente.of("JUnitJpas","Apellido",24,date);
        entityManager.persist(cliente);
        entityManager.flush();
     
        // when
        Cliente found = clienteRepository.findByNombre(cliente.getNombre());
     
        // then
        assertThat(found.getNombre())
          .isEqualTo(cliente.getNombre());
    }

}
