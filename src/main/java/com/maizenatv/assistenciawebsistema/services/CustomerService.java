package com.maizenatv.assistenciawebsistema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CustomerService {
    @Autowired
    private RestTemplate restTemplate;

    private static final String Via_CEP_Url = "https://viacep.com.br/ws/64060170/json/";

    public Object buscarEnderecoPorCep(String cep) {
        @SuppressWarnings("deprecation")
        String url = UriComponentsBuilder.fromHttpUrl(Via_CEP_Url)
                                        .buildAndExpand(cep)
                                        .toUriString();
        return restTemplate.getForObject(url, Object.class);
    }
}
