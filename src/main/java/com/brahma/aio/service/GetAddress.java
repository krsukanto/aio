package com.brahma.aio.service;


import com.brahma.aio.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAddress {
    @Autowired
    private final WebClient.Builder webClientBuilder;

    
    public GetAddress(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }




    public List<Address> getAddress(Integer number){
        System.out.println("Inside the webclient thingy>>>>>>>");
        String apiUrl = "https://random-data-api.com/api/v2/addresses";

        String uriString = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("size", number)
                .toUriString();
        System.out.println("Final URL:  "+uriString);
        List<Address> results=new ArrayList<>();
        webClientBuilder.build()
                .get()
                .uri(uriString)
                .retrieve()
                .bodyToMono(Address.class)
                .doOnSuccess(response -> {
                    // Process the API response here
                    System.out.println("API Response: " + response);
//                    return response;
                    results.add(response);
                })
                .doOnError(WebClientResponseException.class, error -> {
                    // Handle error cases
                    System.err.println("API Error: " + error.getMessage());
                });
        System.out.println(results);
        return results;
    }
}
