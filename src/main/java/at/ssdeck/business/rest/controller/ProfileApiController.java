package at.ssdeck.business.rest.controller;


import at.ssdeck.business.dto.Profile;
import at.ssdeck.business.mapper.ProfileMapper;
import at.ssdeck.business.rest.Api.ProfileApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.simpleStudyDeckService.base-path:}")
public class ProfileApiController implements ProfileApi {

    private final NativeWebRequest request;
    @Autowired
    at.ssdeck.business.rest.services.service.Profile profileService;


    @Autowired
    public ProfileApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<Void> deleteProfile(String username) {
        profileService.deleteProfile(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Profile> getProfile(String username) {
        Profile profile = new Profile();
        profile= ProfileMapper.INSTANCE.entityToDto(profileService.getProfile(username));
        return new ResponseEntity<Profile>(profile, HttpStatus.OK);
    }


    public ResponseEntity<Void> updateProfile(String username, Profile profile) {
        profileService.updateProfile(username, ProfileMapper.INSTANCE.dtoToEntity(profile));
        return new ResponseEntity<>( HttpStatus.OK);
    }
}