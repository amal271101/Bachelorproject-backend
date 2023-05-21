/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package at.ssdeck.business.rest.Api;

import at.ssdeck.business.dto.Profile;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
@Validated
@Tag(name = "User", description = "the User API")
public interface SignupApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /signup : Create a new account
     *
     * @param profile  (required)
     * @return Created Account successfully (status code 201)
     *         or Sorry, could not create account. Check your entered data (passwords etc..) and try again. (status code 422)
     */
    @Operation(
        operationId = "createAccount",
        summary = "Create a new account",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created Account successfully"),
            @ApiResponse(responseCode = "422", description = "Sorry, could not create account. Check your entered data (passwords etc..) and try again.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/signup",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createAccount(
        @Parameter(name = "Profile", description = "", required = true) @Valid @RequestBody Profile profile
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}