package at.ssdeck.business.rest.services.serviceimplementation;

import at.ssdeck.business.rest.services.service.SignUp;
import at.ssdeck.persistence.entities.ProfileEntity;
import at.ssdeck.persistence.repositories.ProfileRepository;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImplementation implements SignUp {
    final ProfileRepository profileRepository;

    private String uuid() {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', 'Z')
                .filteredBy(CharacterPredicates.DIGITS, CharacterPredicates.LETTERS)
                .build();
        return generator.generate(12);
    }

    public SignUpServiceImplementation(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public void createAccount(ProfileEntity profileEntity) {
        profileEntity.setUuid(uuid());
        profileRepository.save(profileEntity);

    }
}
