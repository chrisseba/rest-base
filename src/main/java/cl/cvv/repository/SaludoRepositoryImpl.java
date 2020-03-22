package cl.cvv.repository;

import org.springframework.stereotype.Repository;

import cl.cvv.dominio.Saludo;

@Repository
public class SaludoRepositoryImpl implements SaludoRepository{

	public Saludo getSaludo( String nombre   ) {
		
		return new Saludo( nombre );
	}
	
	
}
