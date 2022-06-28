package edu.ucar.sage.dataset.weppage;

import edu.ucar.sage.dataset.dao.Dataset;
import edu.ucar.sage.dataset.webpage.RestfulDatasetServlet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RESTFulDatasetServletTest{

    @Test
    public void addDataset(){
        RestfulDatasetServlet servlet = new RestfulDatasetServlet();

        Dataset dataset = servlet.addDataset("integration-title", "integration-description", Arrays.asList("keyword1", "keyword2"));

        Assertions.assertEquals("integration-title", dataset.getTitle());
    }

    @Test
    public void updateDataset(){
        RestfulDatasetServlet servlet = new RestfulDatasetServlet();

        Dataset dataset = servlet.addDataset("integration-title", "integration-description", Arrays.asList("keyword1", "keyword2"));

        Assertions.assertEquals("integration-title", dataset.getTitle());
    }
}
