package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Dto.TextAdDto;
import kg.mega.finalproject.moldels.TextAd;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface TextAdMapper {
    TextAdMapper INSTANCE = Mappers.getMapper(TextAdMapper.class);
    TextAdDto textAdToTextAdDto(TextAd textAd);
    @InheritInverseConfiguration
    TextAd textAdDtoToTextAd(TextAdDto textAdDto);

}
