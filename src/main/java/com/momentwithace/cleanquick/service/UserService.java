package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.dtos.request.*;
import com.momentwithace.cleanquick.data.dtos.response.*;

public interface UserService {
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);
    UserLoginResponse login(UserLoginRequest userLoginRequest);
    ServiceRequestResponse serviceRequest(ServiceRequestRequest serviceRequestRequest);
    UpdateProfileResponse updateProfile(UpdateProfileRequest updateProfileRequest);
    ChangePasswordResponse changePassword(ChangePasswordRequest changePasswordRequest);
    PaymentResponse makePayment(PaymentRequest paymentRequest);
    ServiceSearchResponse serviceSearch(ServiceSearchRequest serviceSearchRequest);
    LogOutResponse logOut(LogOutRequest logOutRequest);




}
