package zoom.exporter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zoom.exporter.entity.Exporter;
import zoom.exporter.service.ExporterService;

@RestController
@RequestMapping("/exporter")
public class ExporterController {

	@Autowired
	ExporterService exporterService;
	
	@PostMapping("/register")
	public ResponseEntity<Exporter> registerExporter(@RequestBody Exporter exporter) {
		System.out.println(exporter);
		return new ResponseEntity<>(exporterService.registerExporter(exporter),HttpStatus.OK);
	}
	
	@GetMapping("/getExporterDetails")
	public ResponseEntity<Exporter> getExporterByExporterCode(@RequestParam int exporterCode) {
		return new ResponseEntity<>(exporterService.getExporterByExporterCode(exporterCode), HttpStatus.OK);
	}
}
