package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.BannerAdMapper;
import kg.mega.finalproject.moldels.BannerAd;
import kg.mega.finalproject.moldels.Dto.BannerAdDto;
import kg.mega.finalproject.repo.BannerAdRepo;
import kg.mega.finalproject.service.BannerAdService;
import org.springframework.stereotype.Service;

@Service
public class BannerAdServiceImpl implements BannerAdService {
    private final BannerAdRepo bannerAdRepo;

    public BannerAdServiceImpl(BannerAdRepo bannerAdRepo) {
        this.bannerAdRepo = bannerAdRepo;
    }

    @Override
    public BannerAdDto save(BannerAdDto bannerAdDto) {
        BannerAd bannerAd = BannerAdMapper.INSTANCE.bannerAdDtoToBannerAd(bannerAdDto);
        bannerAd = bannerAdRepo.save(bannerAd);
        return bannerAdDto;
    }
}
