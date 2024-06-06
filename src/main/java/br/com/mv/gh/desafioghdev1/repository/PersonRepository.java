package br.com.mv.gh.desafioghdev1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.gh.desafioghdev1.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
