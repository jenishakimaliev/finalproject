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
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JsonProperty("created_date")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("client_fio")
    String clientFio;
    @JsonProperty("client_phone")
    String clientPhone;
    @JsonProperty("order_status")
    boolean orderStatus;
    @ManyToOne
    @JoinColumn(name = "tb_channel")
    Channel channel;
    @ManyToOne
    @JoinColumn(name = "tb_text_ad")
    TextAd textAd;
    @ManyToOne
    @JoinColumn(name = "tb_banner_ad")
    BannerAd bannerAd;
    @JsonProperty("order_sum")
    double orderSum;
}
