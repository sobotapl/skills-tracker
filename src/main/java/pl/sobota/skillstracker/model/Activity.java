package pl.sobota.skillstracker.model;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdOn;

    private String title;

    private LocalDate start;

    private LocalDate end;

    private String description;

    @OneToMany
    private List<Category> categories = new ArrayList<>();





}
