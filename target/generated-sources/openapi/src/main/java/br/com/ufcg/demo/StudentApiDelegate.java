package br.com.ufcg.demo;

import br.com.ufcg.demo.model.StudentDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link StudentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T09:51:29.574502700-03:00[America/Sao_Paulo]")
public interface StudentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /student/ : Delete Student By Id
     * Delete a Student from the system
     *
     * @param id  (required)
     * @return It&#39;s Ok (status code 200)
     *         or Student Not Found (status code 404)
     *         or Bad Request (status code 400)
     *         or Forbidden (status code 403)
     * @see StudentApi#deleteStudentById
     */
    default ResponseEntity<Object> deleteStudentById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /student/ : Get All Students
     * Student List
     *
     * @return It&#39;s Ok (status code 200)
     *         or Bad Request (status code 400)
     *         or Forbidden (status code 403)
     * @see StudentApi#getAllStudents
     */
    default ResponseEntity<List<StudentDTO>> getAllStudents() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"78adRf99\", \"name\" : \"José\", \"registration\" : \"118111693\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /student/{id} : Get Student By Id
     * Student Info
     *
     * @param id  (required)
     * @return It&#39;s Ok (status code 200)
     *         or Student Not Found (status code 404)
     *         or Bad Request (status code 400)
     *         or Forbidden (status code 403)
     * @see StudentApi#getStudentById
     */
    default ResponseEntity<Object> getStudentById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /student/ : Update Student By Id
     * Update a Student from the system
     *
     * @param id  (required)
     * @param studentDTO  (required)
     * @return It&#39;s Ok (status code 200)
     *         or Student Not Found (status code 404)
     *         or Bad Request (status code 400)
     *         or Forbidden (status code 403)
     * @see StudentApi#updateStudentById
     */
    default ResponseEntity<Object> updateStudentById(Long id,
        StudentDTO studentDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
