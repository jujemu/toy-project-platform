package com.sidematch.backend.domain.team;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PositionType {

    PLAN("기획"),
    UI_UX("UI/UX"),
    FE("프론트엔드"),
    BE("백엔드"),
    APP("앱"),
    GAME("게임"),
    AI("AI"),
    LEADER("리더"),
    ETC("기타"),
    NA("없음");

    private final String role;
}
