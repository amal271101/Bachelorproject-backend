package at.ssdeck.business.mapper;

import at.ssdeck.business.dto.Card;
import at.ssdeck.persistence.entities.CardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {
    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);
    Card entityToDto(CardEntity cardEntity);
    CardEntity dtoToEntity(Card card);

}
