package com.brahma.aio;

import com.brahma.aio.model.Address;
import com.brahma.aio.repository.AddressRepository;
import com.brahma.aio.service.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DataJpaTest
public class AddressServiceTest {

    private AddressRepository addressRepositoryMock;
    private AddressService addressService;

    @BeforeEach
    public void setup(){
        addressRepositoryMock=mock(AddressRepository.class);
        addressService=new AddressService(addressRepositoryMock);
    }

    @Test
    public void getAddressTest(){
        Address addressMock=mock(Address.class);
        List<Address> addressListMock= Arrays.asList(addressMock,addressMock, addressMock);

//        addressService.saveAllAddress(addressListMock);
        when(addressRepositoryMock.findAll()).thenReturn(addressListMock);
        Assertions.assertEquals(addressListMock,addressService.getAllAddress());
    }

}
