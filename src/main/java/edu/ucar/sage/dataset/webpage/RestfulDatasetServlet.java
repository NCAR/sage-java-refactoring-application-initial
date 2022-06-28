package edu.ucar.sage.dataset.webpage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import edu.ucar.sage.dataset.dao.Dataset;
import edu.ucar.sage.dataset.dao.DatasetDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("dataset-rest")
public class RestfulDatasetServlet {


    DatasetDao datasetDao;


    @RequestMapping(value = "/add")
    public Dataset addDataset(@RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("keywords") List<String> keywords) {

        Dataset dataset = new Dataset();
        dataset.setTitle(title);
        dataset.setDescription(description);
        dataset.setKeywords(keywords);

        if (datasetDao == null) {

            datasetDao = DatasetDao.getInstance();
        }

        datasetDao.saveDataset(dataset);

        return dataset;
    }

    @RequestMapping(value = "/get")
    public Dataset getDataset(@RequestParam("title") String title) {

        if (datasetDao == null) {

            datasetDao = DatasetDao.getInstance();
        }

        return datasetDao.getDataset(title);
    }

    @RequestMapping(value = "/update")
    public Dataset updateDataset(@RequestParam("title") String title,
                                 @RequestParam("description") String description,
                                 @RequestParam("keywords") List<String> keywords) {

        Dataset dataset = new Dataset();
        dataset.setTitle(title);
        dataset.setDescription(description);
        dataset.setKeywords(keywords);

        if (datasetDao == null) {

            datasetDao = DatasetDao.getInstance();
        }

        datasetDao.updateDataset(dataset);

        return dataset;
    }

    @RequestMapping(value = "/find")
    public Dataset findDataset(@RequestParam("title") String title) {

        if (datasetDao == null) { datasetDao = DatasetDao.getInstance(); }

        return datasetDao.findDataset(title);
    }

    @RequestMapping(value = "/getAll")
    public ArrayList<Dataset> getAll() {

        if (datasetDao == null) {

            datasetDao = DatasetDao.getInstance();
        }

        return datasetDao.datasetList;
    }

    @RequestMapping(value = "/delete")
    public ResponseEntity<String> delete(@RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("keywords") List<String> keywords) {

        Dataset dataset = new Dataset();
        dataset.setTitle(title);
        dataset.setDescription(description);
        dataset.setKeywords(keywords);

        if (datasetDao == null) {

            datasetDao = DatasetDao.getInstance();
        }

        datasetDao.deleteDataset(dataset);

        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }
}
