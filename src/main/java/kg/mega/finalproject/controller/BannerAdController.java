package kg.mega.finalproject.controller;

import kg.mega.finalproject.moldels.Dto.BannerAdDto;
import kg.mega.finalproject.service.BannerAdService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bannerAd")
public class BannerAdController {
    private final BannerAdService bannerAdService;

    public BannerAdController(BannerAdService bannerAdService) {
        this.bannerAdService = bannerAdService;
    }
    @PostMapping("/save")
    public BannerAdDto save(@RequestBody BannerAdDto bannerAdDto) {
        return bannerAdService.save(bannerAdDto);
    }
}
