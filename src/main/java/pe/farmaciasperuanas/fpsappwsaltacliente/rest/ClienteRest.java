package pe.farmaciasperuanas.fpsappwsaltacliente.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.farmaciasperuanas.fpsappwsaltacliente.facade.ClienteFacade;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteDTO;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteFechaDTO;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping
public class ClienteRest {	

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final ClienteFacade clienteFacade;

    public ClienteRest(ClienteFacade clienteFacade) {
        this.clienteFacade = clienteFacade;
    }
    
    @PostMapping("creacliente")
    public ResponseEntity<String> creacliente(@RequestBody ClienteDTO clienteDTO) {
        logger.info("Initializr @@PostMapping -> creacliente");
        logger.info(clienteDTO.toString());
        clienteFacade.creacliente(clienteDTO);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }
    
    @GetMapping("listclientes")
    public ResponseEntity<List<ClienteFechaDTO>> listclientes(){
        logger.info("Initializr @GetMapping -> listclientes ");
        
        return new ResponseEntity<>(clienteFacade.listclientes(), HttpStatus.OK);
    }

}