package uzdigitl.one.springbootappsupermarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InputOutput {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    @ManyToOne
    private Werhouse werhouse;

    @ManyToOne
    private User supplier;

    @ManyToOne
    private Currensy currensy;

    @Column(unique = true, nullable = false)
    private String factureNumber;

    private String operationNumber;

    private String type;

    public InputOutput(LocalDate date, Werhouse werhouse, User supplier,
                       Currensy currensy, String factureNumber, String operationNumber, String type) {
        this.date = date;
        this.werhouse = werhouse;
        this.supplier = supplier;
        this.currensy = currensy;
        this.factureNumber = factureNumber;
        this.operationNumber = operationNumber;
        this.type = type;
    }
}
