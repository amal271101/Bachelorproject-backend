package at.ssdeck.business.rest.services.serviceimplementation;

import at.ssdeck.business.rest.services.service.Deck;
import at.ssdeck.persistence.entities.CardEntity;
import at.ssdeck.persistence.repositories.CardRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeckServiceImpl implements Deck {
    final CardRepository cardRepository;

    public DeckServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void createCard(CardEntity card) {
        cardRepository.save(card);
    }

    @Override
    public void deleteCard(String cardId) {
        cardRepository.deleteByCardId(Integer.parseInt(cardId));
    }

    @Override
    public CardEntity getCard(String cardId) {
        CardEntity cardEntity = new CardEntity();
        cardEntity= cardRepository.findByCardId(Integer.parseInt(cardId));
        return cardEntity;
    }

    @Override
    public List<CardEntity> getDeck() {
        List<CardEntity> deck;
        deck= cardRepository.findAllByOrderByCardIdDesc();
        return deck;
    }

    @Override
    public void updateCard(String cardId, CardEntity card) {
        cardRepository.updateCard(Integer.parseInt(cardId),card);
    }
}
