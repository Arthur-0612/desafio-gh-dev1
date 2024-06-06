package br.com.mv.gh.desafioghdev1.provider.response;

import br.com.mv.gh.desafioghdev1.dto.StateDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class StateResponse {

    @JsonProperty("states")
    private List<StateDTO> stateDTOList = new ArrayList<>();

    public List<StateDTO> getStateDTOList() {
        return stateDTOList;
    }

    public void setStateDTOList(List<StateDTO> stateDTOList) {
        this.stateDTOList = stateDTOList;
    }


}
