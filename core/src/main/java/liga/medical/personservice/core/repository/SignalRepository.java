package liga.medical.personservice.core.repository;

import liga.medical.personservice.core.model.entity.Signal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignalRepository extends JpaRepository<Signal, Long> {

}
