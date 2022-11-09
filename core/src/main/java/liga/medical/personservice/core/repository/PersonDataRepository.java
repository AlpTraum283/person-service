package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.entity.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDataRepository extends JpaRepository<PersonData, Long> {
}
