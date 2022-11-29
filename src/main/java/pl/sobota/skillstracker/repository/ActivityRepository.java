package pl.sobota.skillstracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.sobota.skillstracker.model.Category;

public interface ActivityRepository extends JpaRepository<Category, Long> {
}
