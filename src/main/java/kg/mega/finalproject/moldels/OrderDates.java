package kg.mega.finalproject.moldels;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_order_dates")
public class OrderDates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date date;
    @ManyToOne
    @JoinColumn(name = "tb_order")
    Order order;
}
