package pe.farmaciasperuanas.fpsappwsaltacliente.assembler.cliente;

import java.util.ArrayList;
import java.util.List;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteDTO;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteFechaDTO;
import pe.farmaciasperuanas.fpsappwsaltacliente.util.Util;

public class ClienteAssembler {
	
	public static Cliente fromDTO(ClienteDTO clienteDTO) {
		
		return Cliente.of(clienteDTO.getNombre(),clienteDTO.getApellido(),clienteDTO.getEdad(),clienteDTO.getFechaNacimiento());
		
	}
	
	public static List<ClienteFechaDTO> toDTOClienteList(List<Cliente> lstcliente){
		
		List<ClienteFechaDTO> lstClienteFecha = new ArrayList<>();

		for(Cliente cli: lstcliente) {
			ClienteFechaDTO clienteFechaDTO = new ClienteFechaDTO (cli.getNombre(),cli.getApellido(),cli.getEdad(),cli.getFechaNacimiento(), Util.getFechaAproxMuerte(cli.getFechaNacimiento(), cli.getEdad()));
			lstClienteFecha.add(clienteFechaDTO);
		}
		
		return lstClienteFecha;
	}

}
