package pl.sobota.skillstracker.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sobota.skillstracker.model.Category;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDto {

    private String title;

    private LocalDate start;

    private LocalDate end;

    private String description;

    @OneToMany
    private List<Category> categories = new ArrayList<>();



}
