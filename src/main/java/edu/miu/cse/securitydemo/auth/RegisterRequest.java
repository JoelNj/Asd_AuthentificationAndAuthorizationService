package edu.miu.cse.securitydemo.auth;

import edu.miu.cse.securitydemo.user.Role;

public record RegisterRequest(
        String firstName,
        String lastName,
        String username,
        String password,
        Role role
) {
}
