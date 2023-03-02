package kg.mega.finalproject.controller;

import kg.mega.finalproject.moldels.Dto.OrderDto;
import kg.mega.finalproject.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/save")
    public OrderDto save(@RequestBody OrderDto orderDto) {
        return orderService.save(orderDto);
    }
}
