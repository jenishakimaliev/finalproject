package kg.mega.finalproject.moldels.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDto {
    long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("client_fio")
    String clientFio;
    @JsonProperty("client_phone")
    String clientPhone;
    @JsonProperty("order_status")
    boolean orderStatus;
    ChannelDto channelDto;
    TextAdDto textAdDto;
    BannerAdDto bannerAdDto;
    @JsonProperty("order_sum")
    double orderSum;


}
