package at.ssdeck.business.rest.services.service;

import at.ssdeck.persistence.entities.ProfileEntity;

public interface SignUp {
    void createAccount(ProfileEntity profileEntity);

}
