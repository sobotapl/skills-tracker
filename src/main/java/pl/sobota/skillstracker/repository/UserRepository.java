package pl.sobota.skillstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sobota.skillstracker.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);


}