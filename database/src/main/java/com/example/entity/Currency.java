package entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="currency")
public class Currency {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    String currencyName;

    @Column
    BigDecimal value;
}
