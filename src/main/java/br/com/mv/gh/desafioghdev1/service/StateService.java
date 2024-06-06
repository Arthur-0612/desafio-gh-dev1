package br.com.mv.gh.desafioghdev1.service;


import br.com.mv.gh.desafioghdev1.dto.StateDTO;
import br.com.mv.gh.desafioghdev1.model.State;
import br.com.mv.gh.desafioghdev1.provider.StateProvider;
import br.com.mv.gh.desafioghdev1.provider.response.StateResponse;
import br.com.mv.gh.desafioghdev1.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private  StateProvider provider;

    public List<State> listAll() {
        return stateRepository.findAll();
    }

    public List<State> save(String lang) {
        var states = listAll();

        if (!states.isEmpty()) {
            stateRepository.deleteAll();
        }
        var stateResponse = provider.getState();

        List<State> stateList = getState(stateResponse, lang);

        return stateRepository.saveAll(stateList);
    }

    private State toEntity(StateDTO dto) {
        State entity = new State();
        entity.setTitle(dto.getTitle());
        entity.setUrl(dto.getUrl());
        return entity;
    }

    private List<State> getState(StateResponse stateResponse, String lang) {
        return stateResponse.getStateDTOList().stream()
                .filter(state -> lang.equals(state.getLang()))
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
