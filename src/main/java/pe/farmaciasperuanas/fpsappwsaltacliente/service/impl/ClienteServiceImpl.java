package pe.farmaciasperuanas.fpsappwsaltacliente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;
import pe.farmaciasperuanas.fpsappwsaltacliente.repository.ClienteRepository;
import pe.farmaciasperuanas.fpsappwsaltacliente.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    public final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

	@Override
	public void creacliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> listclientes() {
		return clienteRepository.findAll();
	}
    
}
