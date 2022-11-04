package liga.medical.personservice.core.repository;


import liga.medical.personservice.core.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
