package at.ssdeck.business.mapper;

import at.ssdeck.business.dto.Profile;
import at.ssdeck.persistence.entities.ProfileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfileMapper {
    ProfileMapper INSTANCE = Mappers.getMapper(ProfileMapper.class);
    Profile entityToDto(ProfileEntity profileEntity);
    ProfileEntity dtoToEntity(Profile profile);

}
