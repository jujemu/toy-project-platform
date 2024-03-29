package com.sidematch.backend.domain.feed.controller;

import com.sidematch.backend.domain.feed.controller.dto.FeedSearchRequest;
import com.sidematch.backend.domain.feed.controller.dto.FeedSliceServiceResponse;
import com.sidematch.backend.domain.feed.service.FeedService;
import com.sidematch.backend.domain.user.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.sidematch.backend.domain.user.util.UserUtil.getUser;

@Slf4j
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@RestController
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/feeds")
    public ResponseEntity<FeedSliceServiceResponse> showFeeds(@Valid FeedSearchRequest feedSearchRequest,
                                                              Pageable pageable,
                                                              Authentication authentication) {

        Optional<User> optUser = getUser(authentication);
        FeedSliceServiceResponse response = feedService.getSliceFeed(feedSearchRequest, pageable);
        return (response != null)
                ? ResponseEntity.ok(response)
                : ResponseEntity.badRequest().build();
    }
}


