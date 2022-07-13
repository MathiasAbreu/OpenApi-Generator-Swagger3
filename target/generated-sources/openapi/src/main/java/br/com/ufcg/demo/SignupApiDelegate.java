package br.com.ufcg.demo;

import br.com.ufcg.demo.model.Professor;
import br.com.ufcg.demo.model.ProfessorDTO;
import br.com.ufcg.demo.model.Student;
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
 * A delegate to be called by the {@link SignupApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T09:51:29.574502700-03:00[America/Sao_Paulo]")
public interface SignupApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /signup/professor
     *
     * @param professorDTO  (required)
     * @return Create a Professor (status code 200)
     * @see SignupApi#createProfessor
     */
    default ResponseEntity<Professor> createProfessor(ProfessorDTO professorDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"1234Abcd\", \"name\" : \"Francisco\", \"links\" : [ { \"hreflang\" : \"hreflang\", \"profile\" : \"profile\", \"rel\" : \"rel\", \"name\" : \"name\", \"href\" : \"href\", \"media\" : \"media\", \"title\" : \"title\", \"type\" : \"type\", \"deprecation\" : \"deprecation\" }, { \"hreflang\" : \"hreflang\", \"profile\" : \"profile\", \"rel\" : \"rel\", \"name\" : \"name\", \"href\" : \"href\", \"media\" : \"media\", \"title\" : \"title\", \"type\" : \"type\", \"deprecation\" : \"deprecation\" } ], \"id\" : 1, \"discipline\" : \"Cálculo 1\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /signup/student : Create a Student
     * Add a student to the system
     *
     * @param studentDTO  (required)
     * @return Create a Student (status code 200)
     * @see SignupApi#createStudent
     */
    default ResponseEntity<Student> createStudent(StudentDTO studentDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"password\", \"name\" : \"Josué\", \"registration\" : \"118111398\", \"id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
