package br.com.ufcg.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-20T09:56:59.482560800-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.university.base-path:}")
public class MetricsApiController implements MetricsApi {

    private final MetricsApiDelegate delegate;

    public MetricsApiController(@Autowired(required = false) MetricsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MetricsApiDelegate() {});
    }

    @Override
    public MetricsApiDelegate getDelegate() {
        return delegate;
    }

}
