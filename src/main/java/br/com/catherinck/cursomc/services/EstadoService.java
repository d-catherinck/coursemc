package br.com.catherinck.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.catherinck.cursomc.domain.Estado;
import br.com.catherinck.cursomc.repositories.EstadoRepository;
import br.com.catherinck.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired //Auto instanciação da dependencia adicionada
	private EstadoRepository repo;
		
	public Estado buscar(Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "
				+ id
				+", Tipo: "
				+ Estado.class.getName()));
	}
}
