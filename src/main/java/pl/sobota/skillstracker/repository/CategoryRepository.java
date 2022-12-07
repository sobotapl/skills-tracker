package pl.sobota.skillstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sobota.skillstracker.model.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    Optional<Category> findByFirstNameAndDescription(String name, String description);
}
