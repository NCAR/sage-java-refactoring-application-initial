package edu.ucar.sage.dataset.dao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DatasetDAOTest {

    DatasetDao datasetDao;

    @Test
    public void addDataset() {

        datasetDao = DatasetDao.getInstance();
        Dataset dataset = new Dataset();
        dataset.setTitle("test-title");
        dataset.setDescription("test-description");
        dataset.setKeywords(Arrays.asList("atmosphere", "aerosols"));
        datasetDao.saveDataset(dataset);
    }

    @Test
    public void deleteDataset() {

        datasetDao = DatasetDao.getInstance();

        Dataset dataset = new Dataset();
        dataset.setTitle("test-title");
        
        dataset.setDescription("test-description");
        dataset.setKeywords(Arrays.asList("atmosphere", "aerosols"));

        try {
            datasetDao.deleteDataset(dataset);
        } catch (NullPointerException e) {}
    }
}
