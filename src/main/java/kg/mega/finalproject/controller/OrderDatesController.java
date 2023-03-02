package kg.mega.finalproject.controller;

import kg.mega.finalproject.moldels.Dto.OrderDatesDto;
import kg.mega.finalproject.service.OrderDatesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderDatesController {
    private final OrderDatesService orderDatesService;

    public OrderDatesController(OrderDatesService orderDatesService) {
        this.orderDatesService = orderDatesService;
    }
    @PostMapping("/save")
    public OrderDatesDto save(@RequestBody OrderDatesDto orderDatesDto) {
        return orderDatesService.save(orderDatesDto);
    }
}
