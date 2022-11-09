package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    Address findByContactId(Long id);
}
