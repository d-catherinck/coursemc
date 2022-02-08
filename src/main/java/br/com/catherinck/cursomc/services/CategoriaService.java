package br.com.catherinck.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.catherinck.cursomc.domain.Categoria;
import br.com.catherinck.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //Auto instanciação da dependencia adicionada
	private CategoriaRepository repo;
		
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
