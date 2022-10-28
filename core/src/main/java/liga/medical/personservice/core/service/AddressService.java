package liga.medical.personservice.core.service;

import liga.medical.personservice.core.repository.AddressMapper;
import liga.medical.personservice.core.repository.AddressRepository;
import liga.medical.personservice.core.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository repository;
    @Autowired
    AddressMapper mapper;

    public List<Address> getAllAddresses() {
        return repository.findAll();
    }

    public List<Address> getAllAddressesMyBatis() {
        return mapper.getAddressesMyBatis();
    }
}
