package pl.sobota.skillstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sobota.skillstracker.model.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);
}