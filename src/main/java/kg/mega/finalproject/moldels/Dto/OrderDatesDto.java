package kg.mega.finalproject.moldels.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDatesDto {
    long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date date;
    OrderDto orderDto;
}
