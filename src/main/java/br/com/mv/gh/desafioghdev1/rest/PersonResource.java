package br.com.mv.gh.desafioghdev1.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.gh.desafioghdev1.model.Person;
import br.com.mv.gh.desafioghdev1.service.PersonService;

@RestController
@RequestMapping(value="api/person")
public class PersonResource {

	@Autowired
	private PersonService personService;

	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Person> list() {
		return personService.list();
	}
	
}
