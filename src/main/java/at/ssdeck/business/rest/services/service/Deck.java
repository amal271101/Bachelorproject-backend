package at.ssdeck.business.rest.services.service;

import at.ssdeck.business.dto.Card;
import at.ssdeck.persistence.entities.CardEntity;

import java.util.List;

public interface Deck {
     void createCard(CardEntity card);

     void deleteCard(String cardId);

     CardEntity getCard(String cardId);

     List<CardEntity> getDeck();

    void updateCard(String cardId, CardEntity card);
}

