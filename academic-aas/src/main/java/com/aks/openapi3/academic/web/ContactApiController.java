package com.aks.openapi3.academic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-23T23:23:43.733872+05:30[Asia/Kolkata]")

@Controller
@RequestMapping("${openapi.contactApplication.base-path:}")
public class ContactApiController implements ContactApi {

    private final ContactApiDelegate delegate;

    public ContactApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ContactApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ContactApiDelegate() {});
    }

    @Override
    public ContactApiDelegate getDelegate() {
        return delegate;
    }

}
