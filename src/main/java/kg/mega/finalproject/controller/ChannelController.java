package kg.mega.finalproject.controller;

import kg.mega.finalproject.moldels.Dto.ChannelDto;
import kg.mega.finalproject.service.ChannelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel")
public class ChannelController {
    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @PostMapping("/save")
    public ChannelDto save(@RequestBody ChannelDto channelDto) {
        return channelService.save(channelDto);
    }
}
