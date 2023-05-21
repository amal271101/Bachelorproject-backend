package at.ssdeck.business.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Profile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
public class Profile {

  private String firstname;

  private String lastname;

  private String username;

  private String email;

  private String password;

  /**
   * Default constructor
   * @deprecated Use {@link Profile#Profile(String, String, String, String, String)}
   */
  @Deprecated
  public Profile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Profile(String firstname, String lastname, String username, String email, String password) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Profile firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Firstname of the user
   * @return firstname
  */
  @NotNull 
  @Schema(name = "firstname", description = "Firstname of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Profile lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Lastname of the user
   * @return lastname
  */
  @NotNull 
  @Schema(name = "lastname", description = "Lastname of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Profile username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Nickname of the user
   * @return username
  */
  @NotNull 
  @Schema(name = "username", description = "Nickname of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Profile email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email Adress of the user
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "Email Adress of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Profile password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the User
   * @return password
  */
  @NotNull 
  @Schema(name = "password", description = "Password of the User", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Profile profile = (Profile) o;
    return Objects.equals(this.firstname, profile.firstname) &&
        Objects.equals(this.lastname, profile.lastname) &&
        Objects.equals(this.username, profile.username) &&
        Objects.equals(this.email, profile.email) &&
        Objects.equals(this.password, profile.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, username, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

