package com.spring.portfolio.kakao_authentication.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import com.spring.portfolio.kakao_authentication.repository.KakaoAuthenticationRepository;

@Service
@RequiredArgsConstructor
public class KakaoAuthenticationServiceImpl implements KakaoAuthenticationService {
    private final KakaoAuthenticationRepository KakaoAuthenticationRepository;

    @Override
    public String getLoginLink() {
        return this.KakaoAuthenticationRepository.getLoginLink();
    }
}
