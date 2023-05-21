package at.ssdeck.business.rest.services.serviceimplementation;

import at.ssdeck.business.rest.services.service.Profile;
import at.ssdeck.persistence.entities.ProfileEntity;
import at.ssdeck.persistence.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements Profile {
    final ProfileRepository profileRepository;
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public void deleteProfile(String username) {
        profileRepository.deleteByUsername(username);

    }

    @Override
    public void updateProfile(String username, ProfileEntity profileEntity) {
        profileRepository.updateProfile(username,profileEntity);
    }

    @Override
    public ProfileEntity getProfile(String username) {
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity=profileRepository.findByUsername(username);
        return profileEntity;
    }
}
