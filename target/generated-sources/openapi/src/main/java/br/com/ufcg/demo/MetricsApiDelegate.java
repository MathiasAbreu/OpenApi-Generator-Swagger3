package br.com.ufcg.demo;

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
 * A delegate to be called by the {@link MetricsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-06T11:18:00.272393600-03:00[America/Sao_Paulo]")
public interface MetricsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /metrics/detailed
     *
     * @return OK (status code 200)
     * @see MetricsApi#getDetailedMetrics
     */
    default ResponseEntity<Object> getDetailedMetrics() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /metrics/generic
     *
     * @return OK (status code 200)
     * @see MetricsApi#getGenericMetrics
     */
    default ResponseEntity<Object> getGenericMetrics() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
