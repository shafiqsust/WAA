package edu.miu.lab6.service;

import edu.miu.lab6.viewmodel.LoginRequest;
import edu.miu.lab6.viewmodel.LoginResponse;
import edu.miu.lab6.viewmodel.RefreshTokenRequest;

public interface IUaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
