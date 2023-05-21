package at.ssdeck.persistence.repositories;

import at.ssdeck.persistence.entities.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity,Long> {
    ProfileEntity findByUsername(String username);

    @Transactional
    void deleteByUsername(String username);



    @Transactional
    @Modifying
    @Query(value = "UPDATE profile  SET email = :#{#profileEntity.email} , firstname=:#{#profileEntity.firstname},lastname=:#{#profileEntity.lastname} WHERE username = :username",nativeQuery = true)
    void updateProfile(@Param("username") String username, ProfileEntity profileEntity);
}

