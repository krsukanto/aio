package com.brahma.aio.service;


import com.brahma.aio.conf.Configuration;
import com.brahma.aio.model.Address;
import com.brahma.aio.model.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Component
@FeignClient(name = "GetRandomStuffs", url = "https://random-data-api.com/api/v2", configuration = Configuration.class)
public interface GetRandomStuffs {
    @GetMapping("/beers")
    public List<Beer> getBeers(@RequestParam("size") Integer size);

    @GetMapping("/addresses")
    public List<Address> getAddress(@RequestParam("size") Integer size);

    @GetMapping("/addresses")
    public Address getOneAddress();

    @GetMapping("/beers")
    public Beer getOneBeer();
}
