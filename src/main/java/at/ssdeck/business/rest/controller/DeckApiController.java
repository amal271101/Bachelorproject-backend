package at.ssdeck.business.rest.controller;


import at.ssdeck.business.dto.Card;
import at.ssdeck.business.mapper.CardMapper;
import at.ssdeck.business.rest.Api.DeckApi;
import at.ssdeck.business.rest.services.service.Deck;
import at.ssdeck.persistence.entities.CardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.simpleStudyDeckService.base-path:}")
public class DeckApiController implements DeckApi {

    private final NativeWebRequest request;

    @Autowired
    Deck deckService;

    @Autowired
    public DeckApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<Void> createCard(Card card) {

        CardEntity cardEntity = new CardEntity();
        cardEntity = CardMapper.INSTANCE.dtoToEntity(card);

        deckService.createCard(cardEntity);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<Void> deleteCard(String cardId) {
        deckService.deleteCard(cardId);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<Card> getCard(String cardId) {
        Card card = new Card();
        card = CardMapper.INSTANCE.entityToDto(deckService.getCard(cardId));

        return new ResponseEntity<Card>(card, HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<List<Card>> getDeck() {
        List<Card> deck = new ArrayList<Card>();

        for (CardEntity cardEntity : deckService.getDeck()) {
            deck.add(CardMapper.INSTANCE.INSTANCE.entityToDto(cardEntity));
        }
        return new ResponseEntity<List<Card>>(deck, HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<Void> updateCard(String cardId, Card card) {

        CardEntity cardEntity = new CardEntity();
        cardEntity = CardMapper.INSTANCE.dtoToEntity(card);

        deckService.updateCard(cardId, cardEntity);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
