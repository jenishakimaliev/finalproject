package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Dto.PriceDto;
import kg.mega.finalproject.moldels.Price;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    PriceDto priceToPriceDto(Price price);
    @InheritInverseConfiguration
    Price priceDtoToPrice(PriceDto priceDto);
}
