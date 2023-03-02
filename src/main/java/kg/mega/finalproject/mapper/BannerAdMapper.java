package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.BannerAd;
import kg.mega.finalproject.moldels.Dto.BannerAdDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BannerAdMapper {
    BannerAdMapper INSTANCE = Mappers.getMapper(BannerAdMapper.class);
    BannerAdDto bannerAdToBannerAdDto(BannerAd bannerAd);
    @InheritInverseConfiguration
    BannerAd bannerAdDtoToBannerAd(BannerAdDto bannerAdDto);
}
