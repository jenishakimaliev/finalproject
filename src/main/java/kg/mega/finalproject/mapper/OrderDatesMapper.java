package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Dto.OrderDatesDto;
import kg.mega.finalproject.moldels.OrderDates;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDatesMapper {
    OrderDatesMapper INSTANCE = Mappers.getMapper(OrderDatesMapper.class);
    OrderDatesDto orderDatesToOrderDatesDto(OrderDates orderDates);
    @InheritInverseConfiguration
    OrderDates orderDatesDtoToOrderDates(OrderDatesDto orderDatesDto);
}
