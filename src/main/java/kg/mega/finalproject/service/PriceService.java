package kg.mega.finalproject.service;

import kg.mega.finalproject.moldels.Dto.PriceDto;
import kg.mega.finalproject.moldels.Dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface PriceService {
    PriceDto save(PriceDto priceDto);
}
