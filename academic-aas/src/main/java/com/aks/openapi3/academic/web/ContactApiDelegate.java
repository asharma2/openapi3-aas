package com.aks.openapi3.academic.web;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import com.aks.openapi3.academic.model.Address;
import com.aks.openapi3.academic.model.Contact;

/**
 * A delegate to be called by the {@link ContactApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-23T23:23:43.733872+05:30[Asia/Kolkata]")

public interface ContactApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/contacts : Add a new contact
     *
     * @param contact Contact to add. Cannot null or empty. (required)
     * @return Contact created (status code 201)
     * @see ContactApi#addContact
     */
    default ResponseEntity<Contact> addContact(Contact contact) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"note\" : \"Meet her at Spring Boot Conference\", \"address3\" : \"Florida\", \"phone\" : \"62482211\", \"address2\" : \"San Angeles\", \"address1\" : \"888\", \"postalCode\" : \"32106\", \"name\" : \"Jessica Abigail\", \"id\" : 1, \"email\" : \"jessica@ngilang.com\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/contacts/{contactId} : Deletes a contact
     *
     * @param contactId Id of the contact to be delete. Cannot be empty. (required)
     * @return Contact not found (status code 404)
     *         or successful operation (status code 200)
     * @see ContactApi#deleteContactById
     */
    default ResponseEntity<Void> deleteContactById(Long contactId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/contacts : Find Contacts by name
     * Name search by %name% format
     *
     * @param page Page number, default is 1 (optional, default to 1)
     * @param name Name of the contact for search. (optional)
     * @return successful operation (status code 200)
     * @see ContactApi#findAll
     */
    default ResponseEntity<List<Contact>> findAll(Integer page,
        String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"note\" : \"Meet her at Spring Boot Conference\", \"address3\" : \"Florida\", \"phone\" : \"62482211\", \"address2\" : \"San Angeles\", \"address1\" : \"888\", \"postalCode\" : \"32106\", \"name\" : \"Jessica Abigail\", \"id\" : 1, \"email\" : \"jessica@ngilang.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Contact> <id>1</id> <name>Jessica Abigail</name> <phone>62482211</phone> <email>jessica@ngilang.com</email> <address1>888</address1> <address2>San Angeles</address2> <address3>Florida</address3> <postalCode>32106</postalCode> <note>Meet her at Spring Boot Conference</note> </Contact>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/contacts/{contactId} : Find contact by ID
     * Returns a single contact
     *
     * @param contactId Id of the contact to be obtained. Cannot be empty. (required)
     * @return successful operation (status code 200)
     * @see ContactApi#findContactById
     */
    default ResponseEntity<Contact> findContactById(Long contactId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"note\" : \"Meet her at Spring Boot Conference\", \"address3\" : \"Florida\", \"phone\" : \"62482211\", \"address2\" : \"San Angeles\", \"address1\" : \"888\", \"postalCode\" : \"32106\", \"name\" : \"Jessica Abigail\", \"id\" : 1, \"email\" : \"jessica@ngilang.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>1</id> <name>Jessica Abigail</name> <phone>62482211</phone> <email>jessica@ngilang.com</email> <address1>888</address1> <address2>San Angeles</address2> <address3>Florida</address3> <postalCode>32106</postalCode> <note>Meet her at Spring Boot Conference</note> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /api/contacts/{contactId} : Update an existing contact&#39;s address
     *
     * @param contactId Id of the contact to be update. Cannot be empty. (required)
     * @param address Contact&#39;s address to update. (required)
     * @return Contact not found (status code 404)
     *         or successful operation (status code 200)
     * @see ContactApi#updateAddress
     */
    default ResponseEntity<Void> updateAddress(Long contactId,
        Address address) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/contacts/{contactId} : Update an existing contact
     *
     * @param contactId Id of the contact to be update. Cannot be empty. (required)
     * @param contact Contact to update. Cannot null or empty. (required)
     * @return Contact not found (status code 404)
     *         or Validation exception (status code 405)
     *         or Invalid ID supplied (status code 400)
     *         or successful operation (status code 200)
     * @see ContactApi#updateContact
     */
    default ResponseEntity<Void> updateContact(Long contactId,
        Contact contact) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
