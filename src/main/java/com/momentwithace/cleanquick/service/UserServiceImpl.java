package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.dtos.request.*;
import com.momentwithace.cleanquick.data.dtos.response.*;
import com.momentwithace.cleanquick.data.models.Address;
import com.momentwithace.cleanquick.data.models.Customer;
import com.momentwithace.cleanquick.data.models.VerificationToken;
import com.momentwithace.cleanquick.repositories.CustomerRepository;
import com.momentwithace.cleanquick.service.notification.EmailNotificationService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserServiceImpl implements UserService{
    private final VerificationTokenService verificationTokenService;

    private EmailNotificationService emailSender;
    private final CustomerRepository customerRepository;
    private final ModelMapper mapper = new ModelMapper();

    private final CustomerRepository userRepository;
    @Override
    public CustomerRegisterResponse register(CustomerRegisterRequest customerRegisterRequest) {
        Customer customer = mapper.map(customerRegisterRequest, Customer.class);
            setCustomerAddress(customerRegisterRequest, customer);
            customer.setFirstName(customer.getFirstName());
            Customer savedCustomer = customerRepository.save(customer);
            var token = verificationTokenService.generateVerificationToken(savedCustomer.getEmail());
            emailSender.sendHtmlMail(buildEmailNotificationRequest(token, savedCustomer.getFirstName()));
        return registrationResponseBuilder(savedCustomer);
    }

    private CustomerRegisterResponse registrationResponseBuilder(Customer customer) {
        return  CustomerRegisterResponse.builder()
                .message("Success")
                .userId(customer.getId())
                .code(201)
                .build();
    }

    private EmailNotificationRequest buildEmailNotificationRequest(VerificationToken token, String firstName) {
        var email = getEmailTemplate();
        String mail = null;
        if(email != null){
            mail = String.format(email,firstName,  "http://localhost:8080/api/v1/customer/verify/" + token.getToken());
        }
        return EmailNotificationRequest.builder()
                .userEmail(token.getUserEmail())
                .mailContent(mail)
                .build();
    }

    private String getEmailTemplate() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/unlikeace/IdeaProjects/CleanQuick/src/main/resources/welcome.txt"))){
            return bufferedReader.lines().collect(Collectors.joining());
        } catch (IOException exception) {
            exception.printStackTrace();
        } return null;
    }

    private void setCustomerAddress(CustomerRegisterRequest customerRegisterRequest, Customer customer) {
        Address customerAddress = new Address();
        customerAddress.setCountry(customerRegisterRequest.getCountry());
        customer.getAddress().add(customerAddress);
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
