package at.ssdeck.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "cardId", nullable = false)
    private Integer cardId;

    @NotNull(message = "Question is not allowed to be empty")
    @Column
    private String question;

    @NotNull(message = "Answer is not allowed to be empty")
    @Column
    private String answer;

    public Integer getId() {
        return cardId;
    }

    public void setId(Integer id) {
        this.cardId = id;
    }


}
