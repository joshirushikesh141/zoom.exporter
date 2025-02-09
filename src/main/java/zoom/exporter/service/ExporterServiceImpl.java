package zoom.exporter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zoom.exporter.entity.Exporter;
import zoom.exporter.repository.ExporterRepository;

@Service
public class ExporterServiceImpl implements ExporterService {
	
	@Autowired
	ExporterRepository exporterRepository;

	@Override
	public Exporter registerExporter(Exporter exporter) {
		return exporterRepository.save(exporter);

		
	}

	@Override
	public Exporter getExporterByExporterCode(int exporterCode) {
		 return exporterRepository.findById(exporterCode).orElseThrow(() -> new IllegalArgumentException("Got exception!!"));
	}

}
