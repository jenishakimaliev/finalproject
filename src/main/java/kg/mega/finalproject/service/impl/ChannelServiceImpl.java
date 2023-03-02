package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.ChannelMapper;
import kg.mega.finalproject.moldels.Channel;
import kg.mega.finalproject.moldels.Dto.ChannelDto;
import kg.mega.finalproject.repo.ChannelRepo;
import kg.mega.finalproject.service.ChannelService;
import org.springframework.stereotype.Service;

@Service
public class ChannelServiceImpl implements ChannelService {
    private final ChannelRepo channelRepo;

    public ChannelServiceImpl(ChannelRepo channelRepo) {
        this.channelRepo = channelRepo;
    }


    @Override
    public ChannelDto save(ChannelDto channelDto) {
        Channel channel = ChannelMapper.INSTANCE.channelDtoToChannel(channelDto);
        channel = channelRepo.save(channel);
        return channelDto;
    }
}
