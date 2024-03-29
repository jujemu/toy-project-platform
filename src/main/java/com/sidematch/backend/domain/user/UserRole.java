package com.sidematch.backend.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    USER("ROLE_USER"),
    MENTOR("ROLE_MENTOR"),
    ADMIN("ROLE_ADMIN");

    private final String key;

    @Override
    public String toString() {
        return key;
    }
}
