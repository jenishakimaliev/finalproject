package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Dto.OrderDto;
import kg.mega.finalproject.moldels.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDto orderToOrderDto(Order order);
    @InheritInverseConfiguration
    Order orderDtoToOrder(OrderDto orderDto);

}
