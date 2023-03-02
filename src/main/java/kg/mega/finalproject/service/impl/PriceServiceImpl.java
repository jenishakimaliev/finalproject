package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.PriceMapper;
import kg.mega.finalproject.moldels.Dto.PriceDto;
import kg.mega.finalproject.moldels.Price;
import kg.mega.finalproject.repo.PriceRepo;
import kg.mega.finalproject.service.PriceService;

public class PriceServiceImpl implements PriceService {
    private final PriceRepo priceRepo;

    public PriceServiceImpl(PriceRepo priceRepo) {
        this.priceRepo = priceRepo;
    }


    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        price = priceRepo.save(price);
        return priceDto;
    }
}
