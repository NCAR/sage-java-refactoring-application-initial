package edu.ucar.sage.dataset.dao;

import java.util.ArrayList;

public class DatasetDao {

    public ArrayList<Dataset> datasetList;

    public static DatasetDao singleton;

    public static DatasetDao getInstance() {

        if (singleton == null) {
            singleton = new DatasetDao();
        }
        return singleton;
    }

    public void saveDataset(Dataset dataset) {

        if (datasetList == null) {

            datasetList = new ArrayList<>();
        }

        datasetList.add(dataset);
    }

    public Dataset getDataset(String title) {

        try {
            for (int i = 0; i < datasetList.size(); i++) {
                if (datasetList.get(i).getTitle() == title) {
                    return datasetList.get(i);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
        return null;
    }

    public void updateDataset(Dataset dataset) {
        try {
            for (int i = 0; i < datasetList.size(); i++) {
                if (datasetList.get(i).getTitle() == dataset.getTitle()) {
                    datasetList.get(i).setDescription(dataset.getDescription());
                    datasetList.get(i).setKeywords(dataset.getKeywords());
                }
            }
        } catch (Throwable e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }

    public Dataset findDataset(String title) {

        try {
            for (int i = 0; i < datasetList.size(); i++) {
                if (datasetList.get(i).title == title) {
                    return datasetList.get(i);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Dataset> getDatasets() {

        return datasetList;
    }

    public void deleteDataset(Dataset deletedDataset) {

        try {
            for (Dataset dataset : datasetList) {
                if (dataset.getTitle() == deletedDataset.getTitle()) {
                    datasetList.remove(dataset);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }
}