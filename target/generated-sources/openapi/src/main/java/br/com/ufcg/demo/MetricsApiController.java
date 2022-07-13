package br.com.ufcg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T09:51:29.574502700-03:00[America/Sao_Paulo]")
@Controller
@RequestMapping("${openapi.university.base-path:}")
public class MetricsApiController implements MetricsApi {

    private final MetricsApiDelegate delegate;

    public MetricsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) MetricsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MetricsApiDelegate() {});
    }

    @Override
    public MetricsApiDelegate getDelegate() {
        return delegate;
    }

}
