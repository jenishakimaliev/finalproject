package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Discount;
import kg.mega.finalproject.moldels.Dto.DiscountDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
    DiscountDto discountToDiscountDto(Discount discount);
    @InheritInverseConfiguration
    Discount discountDtoToDiscount(DiscountDto discountDto);
}
