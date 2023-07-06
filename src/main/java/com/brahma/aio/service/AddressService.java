package com.brahma.aio.service;

import com.brahma.aio.model.Address;
import com.brahma.aio.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

//    public void saveAddress(Address address) {
//        addressRepository.save(address);
//    }

    public void saveAllAddress(List<Address> address) {
        addressRepository.saveAll(address);
    }
}