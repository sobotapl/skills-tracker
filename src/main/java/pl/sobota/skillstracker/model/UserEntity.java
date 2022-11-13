package pl.sobota.skillstracker.model;
import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "users")
@Getter
@Setter
@ToString(exclude = "password", callSuper = true)
@NoArgsConstructor @AllArgsConstructor @SuperBuilder
public class UserEntity extends BaseEntity {

    @NotBlank
    @Column(unique = true)
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String role;
}
