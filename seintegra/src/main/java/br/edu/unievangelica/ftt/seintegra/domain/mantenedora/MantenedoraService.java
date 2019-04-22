package br.edu.unievangelica.ftt.seintegra.domain.mantenedora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unievangelica.ftt.seintegra.core.service.IService;

@Service
public class MantenedoraService implements IService<Mantenedora> {

	@Autowired
	private MantenedoraRepository repository;
	
	@Override
	public List<Mantenedora> findAll() {
		return repository.findAll();
	}

	@Override
	public Mantenedora findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public Mantenedora save(Mantenedora object) {
		return repository.save(object);
	}

	@Override
	public void deleteById(long id) {
		repository.deleteById(id);
	}

}

