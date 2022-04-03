package br.com.catherinck.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.catherinck.cursomc.domain.Endereco;
import br.com.catherinck.cursomc.repositories.EnderecoRepository;
import br.com.catherinck.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired //Auto instanciação da dependencia adicionada
	private EnderecoRepository repo;
		
	public Endereco buscar(Integer id) {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "
				+ id
				+", Tipo: "
				+ Endereco.class.getName()));
	}
}
