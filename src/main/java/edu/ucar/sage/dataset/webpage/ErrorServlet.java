package edu.ucar.sage.dataset.webpage;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorServlet implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {

        return "error";
    }
}
