package com.spring.portfolio.kakao_authentication.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class KakaoAuthenticationRepositoryImpl implements KakaoAuthenticationRepository {
    private final String loginUrl;
    private final String clientId;
    private final String redirectUri;

    public KakaoAuthenticationRepositoryImpl(
            @Value("${kakao.login-url}") String loginUrl,
            @Value("${kakao.client-id}") String clientId,
            @Value("${kakao.redirect-uri}") String redirectUri) {
        this.loginUrl = loginUrl;
        this.clientId = clientId;
        this.redirectUri = redirectUri;
    }

    public String getLoginLink() {
        System.out.println("getLoginLink() for Login");
        return String.format("%s/oauth/authorize?client_id=%s&redirect_uri=%s&response_type=code",
                loginUrl, clientId, redirectUri);
    }
}