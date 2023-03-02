package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.OrderDatesMapper;
import kg.mega.finalproject.moldels.Dto.OrderDatesDto;
import kg.mega.finalproject.moldels.OrderDates;
import kg.mega.finalproject.repo.OrderDatesRepo;
import kg.mega.finalproject.service.OrderDatesService;
import org.springframework.stereotype.Service;

@Service
public class OrderDatesServiceImpl implements OrderDatesService {
    private final OrderDatesRepo orderDatesRepo;

    public OrderDatesServiceImpl(OrderDatesRepo orderDatesRepo) {
        this.orderDatesRepo = orderDatesRepo;
    }

    @Override
    public OrderDatesDto save(OrderDatesDto orderDatesDto) {
        OrderDates orderDates = OrderDatesMapper.INSTANCE.orderDatesDtoToOrderDates(orderDatesDto);
        orderDates = orderDatesRepo.save(orderDates);
        return orderDatesDto;
    }
}
