package pe.farmaciasperuanas.fpsappwsaltacliente.service;

import java.util.List;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;


public interface ClienteService {

    public void creacliente(Cliente cliente);
    
    public List<Cliente> listclientes();
	
}
