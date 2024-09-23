package com.demo.myblog.domain.like;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LikeService {

    private final LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public List<Like> findAll() {
        return likeRepository.findAll();
    }

    public Like save(Like like) {
        return likeRepository.save(like);
    }
}
