package at.ssdeck.business.rest.services.service;

import at.ssdeck.persistence.entities.ProfileEntity;

public interface Profile {
    void deleteProfile(String username);

    void updateProfile(String username, ProfileEntity profileEntity);

    ProfileEntity getProfile(String username);
}
