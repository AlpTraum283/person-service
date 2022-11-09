package liga.medical.personservice.core.service;

import liga.medical.personservice.core.model.entity.Address;
import liga.medical.personservice.core.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepository repository;

    public Optional<Address> getAddressById(Long id) {
        return repository.findById(id);
    }
}
