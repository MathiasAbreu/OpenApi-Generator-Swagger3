package br.com.ufcg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-06T11:18:00.272393600-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.university.base-path:}")
public class StudentApiController implements StudentApi {

    private final StudentApiDelegate delegate;

    public StudentApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) StudentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new StudentApiDelegate() {});
    }

    @Override
    public StudentApiDelegate getDelegate() {
        return delegate;
    }

}
