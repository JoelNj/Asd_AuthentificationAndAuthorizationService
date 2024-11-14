package edu.miu.cse.securitydemo.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
