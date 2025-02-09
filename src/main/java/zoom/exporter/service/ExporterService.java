package zoom.exporter.service;

import zoom.exporter.entity.Exporter;

public interface ExporterService {

	Exporter registerExporter(Exporter exporter);

	Exporter getExporterByExporterCode(int exporterCode);

}
