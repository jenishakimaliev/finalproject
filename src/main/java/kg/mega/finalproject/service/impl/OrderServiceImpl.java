package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.OrderMapper;
import kg.mega.finalproject.moldels.Dto.OrderDto;
import kg.mega.finalproject.moldels.Order;
import kg.mega.finalproject.repo.OrderRepo;
import kg.mega.finalproject.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepo.save(order);
        return orderDto;
    }
}
