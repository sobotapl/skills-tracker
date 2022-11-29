package pl.sobota.skillstracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sobota.skillstracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
