package br.com.catherinck.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.catherinck.cursomc.domain.Cidade;
import br.com.catherinck.cursomc.repositories.CidadeRepository;
import br.com.catherinck.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {
	
	@Autowired //Auto instanciação da dependencia adicionada
	private CidadeRepository repo;
		
	public Cidade buscar(Integer id) {
		Optional<Cidade> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "
				+ id
				+", Tipo: "
				+ Cidade.class.getName()));
	}
}
