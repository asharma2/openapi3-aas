package com.aks.openapi3.student.api;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import com.aks.openapi3.student.model.Student;

/**
 * A delegate to be called by the {@link StudentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-23T21:34:41.819537+05:30[Asia/Kolkata]")

public interface StudentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /student/{id} : Retrieves Student by ID
     *
     * @param id retrieves user by student id (required)
     * @return Retrieves Student by id (status code 200)
     * @see StudentApi#getStudentById
     */
    default ResponseEntity<Student> getStudentById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"gender\" : \"MALE\", \"dateOfBirth\" : \"1992-10-05\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
