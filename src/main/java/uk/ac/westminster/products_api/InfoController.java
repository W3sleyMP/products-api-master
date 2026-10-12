package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController{
    @GetMapping("/info")
    public String info() { return "This application uses starts a local server on your computer that uses springboot to start an embedded web server so te app can recieve and handle web requests on localhost:8080";}


}
