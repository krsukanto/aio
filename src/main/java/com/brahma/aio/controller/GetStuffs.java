package com.brahma.aio.controller;


import com.brahma.aio.model.Address;
import com.brahma.aio.model.Beer;
import com.brahma.aio.service.AddressService;
import com.brahma.aio.service.GetAddress;
import com.brahma.aio.service.GetRandomStuffs;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/get")
public class GetStuffs {

    @Autowired
    GetRandomStuffs getRandomStuffs;

    @Autowired
    GetAddress getAddress;

    @Autowired
    AddressService addressService;


    @GetMapping("/beer/{number}")
    @Operation(summary = "Get chilled Beer infos")
    public List<Beer> getBeerMethod(@PathVariable("number") Integer sn){
        if(sn>1){
            return getRandomStuffs.getBeers(sn);
        }
        List<Beer> resultBeer=new ArrayList<>();
        resultBeer.add(getRandomStuffs.getOneBeer());
        return resultBeer;
    }

    @GetMapping("/address/{number}")
    @Operation(summary = "Get address of a random locations")
    public List<Address> getAddressMethod(@PathVariable("number") Integer sn){

        List<Address> resultAddress=new ArrayList<Address>();
        if(sn<=1){
            resultAddress.add(getRandomStuffs.getOneAddress());
            addressService.saveAllAddress(resultAddress);
        }
        else{
            addressService.saveAllAddress(getRandomStuffs.getAddress(sn));
        }
        return resultAddress;
    }
}
