package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;

@Repository
public interface PersonDataRepository extends JpaRepository<PersonData, BigInteger> {
}
