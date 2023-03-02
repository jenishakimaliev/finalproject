package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Channel;
import kg.mega.finalproject.moldels.Dto.ChannelDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelMapper {
    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);
    ChannelDto channelToChannelDto(Channel channel);
    @InheritInverseConfiguration
    Channel channelDtoToChannel(ChannelDto channelDto);
}
