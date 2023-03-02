package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.DiscountMapper;
import kg.mega.finalproject.moldels.Discount;
import kg.mega.finalproject.moldels.Dto.DiscountDto;
import kg.mega.finalproject.repo.DiscountRepo;
import kg.mega.finalproject.service.DiscountService;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepo discountRepo;

    public DiscountServiceImpl(DiscountRepo discountRepo) {
        this.discountRepo = discountRepo;
    }

    @Override
    public DiscountDto save(DiscountDto discountDto) {
        Discount discount = DiscountMapper.INSTANCE.discountDtoToDiscount(discountDto);
        discount = discountRepo.save(discount);
        return discountDto;
    }
}
