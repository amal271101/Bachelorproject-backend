package at.ssdeck.persistence.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profile")
public class ProfileEntity {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "First name is not allowed to be empty")
    @Column
    private String firstname;

    @NotNull(message = "Last name is not allowed to be empty")
    @Column
    private String lastname;

    @NotNull(message = "Username is not allowed to be empty")
    @Column
    private String username;

    @NotNull(message = "Email is not allowed to be empty")
    @Column
    private String email;

    @NotNull(message = "Password is not allowed to be empty")
   // @Pattern(regexp = "^[A-Z0-9]{9}$")
    @Column
    private String password;

    @Column
    @OneToMany(fetch = FetchType.EAGER)
    private List<CardEntity> deck;

    @Column
    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
