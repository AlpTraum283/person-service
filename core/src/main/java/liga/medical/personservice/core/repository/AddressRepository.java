package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AddressRepository extends JpaRepository<Address, BigInteger> {

}
