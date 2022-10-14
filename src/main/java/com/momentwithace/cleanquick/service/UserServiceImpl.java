package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.dtos.request.*;
import com.momentwithace.cleanquick.data.dtos.response.*;
import com.momentwithace.cleanquick.data.models.User;
import com.momentwithace.cleanquick.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
//@Getter
//@Setter
@Builder
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public UserRegisterResponse register(UserRegisterRequest userRegisterRequest) {
        User user = User.builder()

                .build();

        return null;
    }

    @Override
    public UserLoginResponse login(UserLoginRequest userLoginRequest) {
        return null;
    }

    @Override
    public ServiceRequestResponse serviceRequest(ServiceRequestRequest serviceRequestRequest) {
        return null;
    }

    @Override
    public UpdateProfileResponse updateProfile(UpdateProfileRequest updateProfileRequest) {
        return null;
    }

    @Override
    public ChangePasswordResponse changePassword(ChangePasswordRequest changePasswordRequest) {
        return null;
    }

    @Override
    public PaymentResponse makePayment(PaymentRequest paymentRequest) {
        return null;
    }

    @Override
    public ServiceSearchResponse serviceSearch(ServiceSearchRequest serviceSearchRequest) {
        return null;
    }

    @Override
    public LogOutResponse logOut(LogOutRequest logOutRequest) {
        return null;
    }
}
