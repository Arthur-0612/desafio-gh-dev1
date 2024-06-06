package br.com.mv.gh.desafioghdev1.provider.impl;

import br.com.mv.gh.desafioghdev1.dto.StateDTO;
import br.com.mv.gh.desafioghdev1.provider.StateProvider;
import br.com.mv.gh.desafioghdev1.provider.response.StateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StateProviderImpl implements StateProvider {

    private RestTemplate restTemplate;

    public StateProviderImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public StateResponse getState() {
        try {
            String url = "https://www.healthcare.gov/api/states.json";
            ResponseEntity<StateResponse> response = restTemplate.getForEntity(url, StateResponse.class);

            return response.getBody();
        } catch (RestClientException e) {
            throw new RuntimeException("testetstes", e);
        }
    }
}
