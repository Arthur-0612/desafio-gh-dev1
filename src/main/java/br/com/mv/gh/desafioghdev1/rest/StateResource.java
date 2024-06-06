package br.com.mv.gh.desafioghdev1.rest;

import br.com.mv.gh.desafioghdev1.dto.StateDTO;
import br.com.mv.gh.desafioghdev1.model.State;
import br.com.mv.gh.desafioghdev1.provider.StateProvider;
import br.com.mv.gh.desafioghdev1.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/state")
public class StateResource {

    @Autowired
    private StateService service;

    @RequestMapping(value="/save/{lang}", method= RequestMethod.GET)
    public ResponseEntity<List<State>> saveStateList(@PathVariable String lang) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(lang));
    }

    @RequestMapping(value="/list/{lang}", method= RequestMethod.GET)
    public ResponseEntity<List<State>> listAllStates() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listAll());
    }
}
