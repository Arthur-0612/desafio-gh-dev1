package br.com.mv.gh.desafioghdev1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mv.gh.desafioghdev1.model.Person;
import br.com.mv.gh.desafioghdev1.repository.PersonRepository;


@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	

	public List<Person> list() {
		return personRepository.findAll();
	}
	
}
