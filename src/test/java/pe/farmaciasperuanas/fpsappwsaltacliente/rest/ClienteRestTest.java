package pe.farmaciasperuanas.fpsappwsaltacliente.rest;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteDTO;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteRestTest {

	@Autowired
    private ClienteRest clienteRest;

    @Test
    public void contexLoads() throws Exception {
        assertThat(clienteRest).isNotNull();
    }

    @Test
    public void createCliente() throws Exception {
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = "24/11/2002";
    	
        Date date = formatter.parse(fechaNacimiento);
        ClienteDTO clienteDTO = new ClienteDTO("JUnit","Apellido",24,date);
    	
        assertThat(clienteRest.creacliente(clienteDTO).getBody()).contains("Created");
    }
    
    @Test
    public void findAllClientes() throws Exception {
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = "24/11/2002";
    	
        Date date = formatter.parse(fechaNacimiento);
        ClienteDTO clienteDTO = new ClienteDTO("JUnit","Apellido",24,date);
        assertThat(clienteRest.creacliente(clienteDTO).getBody()).isNotNull();
    }
	
}
