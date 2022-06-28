package edu.ucar.sage.dataset;

import edu.ucar.sage.dataset.dao.DatasetDao;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public DatasetDao getDatasetDao() {	
		
		System.out.println("Creating DatasetDao");	
		return new DatasetDao();
	}
}
