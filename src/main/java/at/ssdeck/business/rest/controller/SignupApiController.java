package at.ssdeck.business.rest.controller;


import at.ssdeck.business.dto.Profile;
import at.ssdeck.business.mapper.ProfileMapper;
import at.ssdeck.business.rest.Api.SignupApi;
import at.ssdeck.business.rest.services.service.SignUp;
import at.ssdeck.persistence.entities.ProfileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.simpleStudyDeckService.base-path:}")
public class SignupApiController implements SignupApi {

    private final NativeWebRequest request;

    @Autowired
    SignUp signUpService;
    @Autowired
    public SignupApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<Void> createAccount(Profile profile) {
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity= ProfileMapper.INSTANCE.dtoToEntity(profile);
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        // https://www.baeldung.com/spring-security-5-default-password-encoder
        String encodedPassword = encoder.encode(profileEntity.getPassword());
        profileEntity.setPassword(encodedPassword);
        signUpService.createAccount(profileEntity);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

}
