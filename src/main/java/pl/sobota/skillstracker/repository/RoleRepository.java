package pl.sobota.skillstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sobota.skillstracker.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
