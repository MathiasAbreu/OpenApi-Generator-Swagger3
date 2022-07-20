package br.com.ufcg.demo;

import br.com.ufcg.demo.model.ProfessorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ProfessorApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-20T09:56:59.482560800-03:00[America/Sao_Paulo]")
public interface ProfessorApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /professor/ : Get Professor By Id
     * Get professor info by id
     *
     * @param id  (required)
     * @return It&#39;s Ok (status code 200)
     *         or Professor Not Found (status code 404)
     * @see ProfessorApi#deleteProfessorById
     */
    default ResponseEntity<Object> deleteProfessorById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /professor/ : List All Professors
     * List all professors from the system
     *
     * @return Request OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Forbidden (status code 403)
     * Documentation
     * @see <a href="www.ufcg.com">List All Professors Documentation</a>
     * @see ProfessorApi#getAllProfessors
     */
    default ResponseEntity<List<ProfessorDTO>> getAllProfessors() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"password\" : \"1234Abcd\", \"name\" : \"Pedro\", \"discipline\" : \"Lógica\", \"serviceTime\" : 15 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /professor/{id}
     * description for professor operations
     *
     * @param id  (required)
     * @return OK (status code 200)
     * @see ProfessorApi#getProfessorById
     */
    default ResponseEntity<Object> getProfessorById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /professor/ : Update Professor By Id
     * Update professor info by id
     *
     * @param id  (required)
     * @param professorDTO  (required)
     * @return It&#39;s Ok (status code 200)
     *         or Professor Not Found (status code 404)
     * @see ProfessorApi#updateProfessorById
     */
    default ResponseEntity<Object> updateProfessorById(Long id,
        ProfessorDTO professorDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
