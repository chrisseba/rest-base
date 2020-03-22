package cl.cvv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.cvv.dominio.Saludo;
import cl.cvv.repository.SaludoRepository;

@Service
public class SaludoServiceImpl implements SaludoService {
	
	@Autowired
	private SaludoRepository saludoRepository;
	
	@Override
	public Saludo getSaludo(String nombre) {
		
		return saludoRepository.getSaludo(nombre);
	}
	
}
