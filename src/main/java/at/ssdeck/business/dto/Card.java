package at.ssdeck.business.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Card
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
public class Card {

  private String question;

  private String answer;

  private Integer cardId;

  /**
   * Default constructor
   * @deprecated Use {@link Card#Card(String, String)}
   */
  @Deprecated
  public Card() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Card(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }

  public Card question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Question of the Card
   * @return question
  */
  @NotNull 
  @Schema(name = "question", description = "Question of the Card", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public Card answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Answer of the Question
   * @return answer
  */
  @NotNull 
  @Schema(name = "answer", description = "Answer of the Question", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public Card cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Id of the card
   * @return cardId
  */
  
  @Schema(name = "card_id", description = "Id of the card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card_id")
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.question, card.question) &&
        Objects.equals(this.answer, card.answer) &&
        Objects.equals(this.cardId, card.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer, cardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

