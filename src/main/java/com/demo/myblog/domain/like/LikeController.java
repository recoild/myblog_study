package com.demo.myblog.domain.like;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/likes")
public class LikeController {

    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<Like> getAllLikes() {
        return likeService.findAll();
    }

    @PostMapping
    public Like createLike(@RequestBody Like like) {
        return likeService.save(like);
    }
}
