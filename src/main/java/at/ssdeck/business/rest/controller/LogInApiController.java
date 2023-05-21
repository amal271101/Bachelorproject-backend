package at.ssdeck.business.rest.controller;


import at.ssdeck.business.rest.Api.LogInApi;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;


import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T16:55:22.806765Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.simpleStudyDeckService.base-path:}")
public class LogInApiController implements LogInApi {

    private final NativeWebRequest request;

    @Autowired
    public LogInApiController(NativeWebRequest request) {
        this.request = request;
    }






}
