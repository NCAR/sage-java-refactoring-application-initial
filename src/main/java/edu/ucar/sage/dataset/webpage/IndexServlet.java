package edu.ucar.sage.dataset.webpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexServlet {

    @RequestMapping("/")
    public String index() {

        return "index";
    }
}
