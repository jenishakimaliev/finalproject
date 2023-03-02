package kg.mega.finalproject.controller;

import kg.mega.finalproject.moldels.Dto.TextAdDto;
import kg.mega.finalproject.service.TextAdService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/textAd")
public class TextAdController {
    private final TextAdService textAdService;


    public TextAdController(TextAdService textAdService) {
        this.textAdService = textAdService;
    }
    @PostMapping("/save")
    public TextAdDto save(@RequestBody TextAdDto textAdDto) {
        return textAdService.save(textAdDto);
    }
}
