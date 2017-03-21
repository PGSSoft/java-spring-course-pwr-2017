package entity;

import lombok.Data;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="weather")
public class Weather {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String city;

    @Column
    private Double temp;

    @Column
    private Double pressure;

    @Column
    private Timestamp time;

}
