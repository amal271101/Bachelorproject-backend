package at.ssdeck.business.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * LogInRequest
 */

@JsonTypeName("logIn_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
public class LogInRequest {

  private String username;

  private String password;

  public LogInRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of the user
   * @return username
  */
  
  @Schema(name = "username", description = "Username of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LogInRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the user
   * @return password
  */
  
  @Schema(name = "password", description = "Password of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogInRequest logInRequest = (LogInRequest) o;
    return Objects.equals(this.username, logInRequest.username) &&
        Objects.equals(this.password, logInRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogInRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

