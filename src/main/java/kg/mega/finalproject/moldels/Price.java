package kg.mega.finalproject.moldels;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "tb_price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "tb_channel")
    Channel channel;
    @JsonProperty("price_per_symbol")
    double pricePerSymbol;
    @JsonProperty("banner_price")
    double bannerPrice;
    @JsonProperty("start_date")
    Date startDate;
    @JsonProperty("end_date")
    Date endDate;

}
