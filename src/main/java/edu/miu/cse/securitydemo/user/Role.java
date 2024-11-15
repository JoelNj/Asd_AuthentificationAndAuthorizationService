package edu.miu.cse.securitydemo.user;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public enum Role {
    ADMIN(
            Set.of(
                    Permission.ADMIN_WRITE,
                    Permission.ADMIN_READ
            )
    ),
    MEMBER(
            Set.of(
                    Permission.MEMBER_WRITE,
                    Permission.MEMBER_READ
            )
    );

    private final Set<Permission> permissions;
}
