package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.TextAdMapper;
import kg.mega.finalproject.moldels.Dto.TextAdDto;
import kg.mega.finalproject.moldels.TextAd;
import kg.mega.finalproject.repo.TextAdRepo;
import kg.mega.finalproject.service.TextAdService;
import org.springframework.stereotype.Service;

@Service
public class TextAdServiceImpl implements TextAdService {
    private final TextAdRepo textAdRepo;

    public TextAdServiceImpl(TextAdRepo textAdRepo) {
        this.textAdRepo = textAdRepo;
    }

    @Override
    public TextAdDto save(TextAdDto textAdDto) {
        TextAd textAd = TextAdMapper.INSTANCE.textAdDtoToTextAd(textAdDto);
        textAd.setSymbolCount(textAdDto.getText().replaceAll(" ", "").length());
        textAd = textAdRepo.save(textAd);
        textAdDto.setSymbolCount(textAd.getSymbolCount());
        return textAdDto;
    }
}
