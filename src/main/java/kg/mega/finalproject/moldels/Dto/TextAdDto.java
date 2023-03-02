package kg.mega.finalproject.moldels.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TextAdDto {
    long id;
    String text;
    @JsonProperty("symbol_count")
    int symbolCount;
}
