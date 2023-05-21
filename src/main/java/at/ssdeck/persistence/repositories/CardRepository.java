package at.ssdeck.persistence.repositories;

import at.ssdeck.persistence.entities.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity,Integer> {
    List<CardEntity> findAllByOrderByCardIdDesc();
    CardEntity findByCardId(int cardId);

    @Transactional
    void deleteByCardId(int cardId);


    @Transactional
    @Modifying
    @Query(value = "UPDATE card  SET question = :#{#cardEntity.question} , answer=:#{#cardEntity.answer}  WHERE card_id = :cardId",nativeQuery = true)
    void updateCard(@Param("cardId") int cardId, CardEntity cardEntity);
}
