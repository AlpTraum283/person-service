package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.AddressService;

import liga.medical.personservice.core.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService service;

    @GetMapping("/address")
    public List<Address> printAddresses() {
        return service.getAllAddresses();
    }
    @GetMapping("/addressbatis")
    public List<Address> printAddressesBatis() {
        return service.getAllAddressesMyBatis();
    }
}
