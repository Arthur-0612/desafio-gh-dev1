package br.com.mv.gh.desafioghdev1.repository;

import br.com.mv.gh.desafioghdev1.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
