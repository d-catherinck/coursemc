package br.com.catherinck.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.catherinck.cursomc.domain.Cliente;
import br.com.catherinck.cursomc.repositories.ClienteRepository;
import br.com.catherinck.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired //Auto instanciação da dependencia adicionada
	private ClienteRepository repo;
		
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "
				+ id
				+", Tipo: "
				+ Cliente.class.getName()));
	}
}
