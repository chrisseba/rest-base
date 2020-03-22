package cl.cvv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.cvv.dominio.Saludo;
import cl.cvv.service.SaludoService;

@RestController
public class SaludoController {
	
	@Autowired
	private SaludoService saludoService;
	
	@RequestMapping(value = "/saludo/{nombre}", method = RequestMethod.GET)
	public Saludo greeting(@PathVariable("nombre")  String nombre) {
		
		return  saludoService.getSaludo(nombre);
	}
	
	

}
