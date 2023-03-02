package kg.mega.finalproject.moldels.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    long id;
    String fio;
    String role;
    String login;
    String email;
    String phone;
    @JsonProperty("user_status")
    String userStatus;
}
