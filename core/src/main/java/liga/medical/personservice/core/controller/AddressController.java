package liga.medical.personservice.core.controller;

import liga.medical.common.dto.annotations.DbLog;
import liga.medical.personservice.core.model.entity.Address;
import liga.medical.personservice.core.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressRepository repository;

    @PutMapping
    @DbLog
    public Address updateAddress(Address address) {
        return repository.save(address);
    }

    @PostMapping
    @DbLog
    public Address saveAddress(Address address) {
        return repository.save(address);
    }
}
