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
@Table(name = "tb_channel")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JsonProperty("channel_name")
    String channelName;
    @JsonProperty("created_date")
    Date createdDate;
    @JsonProperty("channel_status")
    boolean channelStatus;
    @JsonProperty("logo_path")
    String logoPath;
}
