// package com.brahma.aio.service;

// import com.brahma.aio.model.Address;
// import com.brahma.aio.repository.AddressRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Lazy;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// @Lazy
// public class AddressService {
//     @Autowired
//     private final AddressRepository addressRepository;

    
//     public AddressService(AddressRepository addressRepository) {
//         this.addressRepository = addressRepository;
//     }


//     public void saveAllAddress(List<Address> address) {
//         addressRepository.saveAll(address);
//         System.out.println(address);
//     }

//     public List<Address> getAllAddress(){
//         return  addressRepository.findAll();
//     }
// }